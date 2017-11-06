package Controller;

import Model.User;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import Model.User;

public class UserMgnt {
	public static User checkUserPass(String user, String pass) {
		String sql = "select * from USER_DATA";
		ResultSet rs;
		try {
			Connection con = ConnectMgnt.getConnect();
			Statement st = con.createStatement();
			rs = st.executeQuery(sql);
			while (rs.next()) {
				//System.out.println(rs.getString(3) + " " + rs.getString(4));
				if (rs.getString(3).equals(user.trim()) && rs.getString(4).equals(pass.trim())) {
					String userID, userName, passWord, firstName, lastName, email, rank, status;
					userID = rs.getString(2);
					userName = rs.getString(3);
					passWord = rs.getString(4);
					firstName = rs.getString(5);
					lastName = rs.getString(6);
					email = rs.getString(7);
					rank = rs.getString(8);
					status = rs.getString(9);
					return new User(userID, userName, passWord, firstName, lastName, email, rank, status);
				}
			}

		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Database Error.!!!", "ERROR", JOptionPane.ERROR_MESSAGE);
		}
		return null;
	}
}