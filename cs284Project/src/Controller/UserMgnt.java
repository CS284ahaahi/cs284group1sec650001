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
		String sql = "select * from USER_DATA where USER = '" + user + "'";
		ResultSet rs;
		try {
			Connection con = ConnectMgnt.getConnect();
			Statement st = con.createStatement();
			rs = st.executeQuery(sql);
			if (rs.next()) {
				if (rs.getString("PASS").equals(pass.trim())) {
					String userID, userName, passWord, firstName, lastName, email, rank;
					userID = rs.getString("USER_ID");
					userName = rs.getString("USER");
					passWord = rs.getString("PASS");
					firstName = rs.getString("NAME");
					lastName = rs.getString("LNAME");
					email = rs.getString("EMAIL");
					rank = rs.getString("RANK");
					return new User(userID, userName, passWord, firstName, lastName, email, rank);
				}
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			JOptionPane.showMessageDialog(null, "Database Error.!!!", "ERROR", JOptionPane.ERROR_MESSAGE);
		}
		return null;
	}
}