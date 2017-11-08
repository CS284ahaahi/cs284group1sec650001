package Controller;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

import Model.Subject;

public class FileMgnt {

	public static boolean exportExcelGrade(String tableName) {
		JFileChooser chooser = new JFileChooser();
		chooser.setFileFilter(new FileNameExtensionFilter("Text File (*.txt)", "txt"));
		String sql = "select * from " + tableName + " Where STATUS like '%N%'";
		int check = chooser.showSaveDialog(null);
		if (check == JFileChooser.APPROVE_OPTION) {
			ResultSet rs;
			File file = chooser.getSelectedFile();
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
		}
		return false;
	}

	// public static void main(String[] args) {
	// Subject sub = new Subject("Test", "CS284", "650001", "test", "1", "2560");
	// if(exportExcelGrade(sub)) {
	// JOptionPane.showMessageDialog(null, "Export เสร็จสิ้น");
	// }
	// }

}
