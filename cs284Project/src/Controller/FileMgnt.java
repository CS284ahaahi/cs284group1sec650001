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

import Model.Subject;

public class FileMgnt {

	public static boolean exportExcelGrade(Subject s) {
		JFileChooser chooser = new JFileChooser();
		String sql = "select * from " + s.getTableName();
		int check = chooser.showSaveDialog(null);
		if (check == JFileChooser.APPROVE_OPTION) {
			ResultSet rs;
			File file = chooser.getSelectedFile();
			try (PrintWriter write = new PrintWriter(file);) {
				Connection con = ConnectMgnt.getConnect();
				Statement st = con.createStatement();
				StringBuilder sb = new StringBuilder();
				rs = st.executeQuery(sql);
				sb.append("เลขทะเบียนนักศึกษา,เกรด\n");
				while (rs.next()) {
					String str = rs.getString(2) + ",";
					str += rs.getString(6);
					sb.append(str+"\n");
				}
				write.print(sb.toString());
				return true;
			} catch (SQLException e) {
				JOptionPane.showMessageDialog(null, "Database Error.!!!", "ERROR", JOptionPane.ERROR_MESSAGE);
			} catch (IOException e) {

			}
		}
		return false;
	}

	public static void main(String[] args) {
		Subject sub = new Subject("Test", "CS284", "650001", "test", "1", "2017");
		if(exportExcelGrade(sub)) {
			JOptionPane.showMessageDialog(null, "Export เสร็จสิ้น");
		}
	}

}
