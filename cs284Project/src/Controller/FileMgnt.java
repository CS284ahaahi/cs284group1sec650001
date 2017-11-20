package Controller;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class FileMgnt {

	public static boolean exportExcelGrade(String tableName) {
		JFileChooser chooser = new JFileChooser();
		FileFilter fileTxt = new FileNameExtensionFilter("Text File (*.txt)", "txt");
		FileFilter fileExcel = new FileNameExtensionFilter("Excel File (*.xlsx)", "xlsx");
		chooser.setFileFilter(fileTxt);
		chooser.addChoosableFileFilter(fileExcel);
		String sql = "select * from " + tableName + " Where STATUS like '%N%'";
		int check = chooser.showSaveDialog(null);
		if (check == JFileChooser.APPROVE_OPTION) {
			ResultSet rs;
			File file = chooser.getSelectedFile();
			if (chooser.getFileFilter().equals(fileTxt)) { // txt
				file = new File(file.getAbsolutePath() + ".txt");
				try (PrintWriter write = new PrintWriter(file);) {
					Connection con = ConnectMgnt.getConnect();
					Statement st = con.createStatement();
					rs = st.executeQuery(sql);
					write.println("เลขทะเบียนนักศึกษา\tเกรด");
					while (rs.next()) {
						String str = rs.getString("ID_STUDENT") + "\t";
						str += rs.getString("GRADE");
						write.println(str);
					}
					return true;
				} catch (SQLException e) {
					JOptionPane.showMessageDialog(null, "Database Error.!!!", "ERROR", JOptionPane.ERROR_MESSAGE);
				} catch (IOException e) {
					JOptionPane.showMessageDialog(null, e.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
				}
			} else { // xls
				file = new File(file.getAbsolutePath() + ".xlsx");
				try {
					Connection con = ConnectMgnt.getConnect();
					Statement st = con.createStatement();
					rs = st.executeQuery(sql);
					// Blank workbook
					XSSFWorkbook workbook = new XSSFWorkbook();
					// Create a blank sheet
					XSSFSheet sheet = workbook.createSheet("เกรด");
					// This data needs to be written (Object[])
					Map<String, Object[]> data = new TreeMap<String, Object[]>();
					data.put("1", new Object[] { "เลขทะเบียนนักศึกษา", "เกรด" });
					for (int i = 2; rs.next(); i++) {
						data.put(i + "", new Object[] { rs.getString("ID_STUDENT"), rs.getString("GRADE") });
					}
					// Iterate over data and write to sheet
					Set<String> keyset = data.keySet();
					int rownum = 0;
					for (String key : keyset) {
						Row row = sheet.createRow(rownum++);
						Object[] objArr = data.get(key);
						int cellnum = 0;
						for (Object obj : objArr) {
							Cell cell = row.createCell(cellnum++);
							if (obj instanceof String)
								cell.setCellValue((String) obj);
							else if (obj instanceof Integer)
								cell.setCellValue((Integer) obj);
						}
					}
					// Write the workbook in file system
					FileOutputStream out = new FileOutputStream(file);
					workbook.write(out);
					out.close();
					return true;
				} catch (SQLException e) {
					JOptionPane.showMessageDialog(null, "Database Error.!!!", "ERROR", JOptionPane.ERROR_MESSAGE);
				} catch (FileNotFoundException e) {
					System.out.println(e.getMessage());
				} catch (IOException e) {
					System.out.println(e.getMessage());
				}
			}
		}
		return false;
	}

}
