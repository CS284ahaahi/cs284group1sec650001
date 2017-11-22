package Controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.NumberFormat;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import Model.ClassList;
import Model.Student;

public class FileMgnt {

	public static boolean exportGrade(String tableName) {
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

	public static ClassList readClassListFile() {
		JFileChooser chooser = new JFileChooser();
		FileFilter fileExcel = new FileNameExtensionFilter("Excel File (*xls)", "xls");
		chooser.setFileFilter(fileExcel);
		int check = chooser.showOpenDialog(null);
		ClassList list = new ClassList();
		if (check == JFileChooser.APPROVE_OPTION) {
			try (FileInputStream file = new FileInputStream(chooser.getSelectedFile())) {
				HSSFWorkbook wb = new HSSFWorkbook(file);
				HSSFSheet sheet = wb.getSheetAt(0);
				HSSFRow row;
				HSSFCell cell;
				Iterator<Row> rows = sheet.rowIterator();
				rows.next();
				rows.next();
				rows.next();
				rows.next();
				rows.next();
				rows.next();
				row = (HSSFRow) rows.next();
				Iterator<Cell> cells = row.cellIterator();
				while (rows.hasNext()) {
					row = (HSSFRow) rows.next();
					cells = row.cellIterator();
					cells.next();
					cell = (HSSFCell) cells.next();
					long idLong = (long) cell.getNumericCellValue();
					String id = Long.toString(idLong);
					if (id.equals("0")) {
						break;
					}
					System.out.print(id);
					cell = (HSSFCell) cells.next();
					String name = cell.getStringCellValue().trim();
					System.out.print(name);
					System.out.println();
					list.add(new Student(id, name));
				}
				return list;
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		return null;
	}

	public static void main(String[] args) {
		FileMgnt.readClassListFile();
	}
}
