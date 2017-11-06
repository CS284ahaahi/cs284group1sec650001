package Controller;

import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ConnectMgnt {
	public static Connection getConnect() {
		String dbName = "cs284_db1";
		String user = "cs284";
		String pass = "12345678";
		String host = "mydpk.ddns.net:3307";
		String driver = "org.mariadb.jdbc.Driver";
		try {
			Class.forName(driver);
			String url = "jdbc:mariadb://" + host + "/" + dbName;
			Connection conDb = DriverManager.getConnection(url, user, pass);
			return conDb;
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "failed to connect database server.\n" + e.getMessage(), "ERROR",
					JOptionPane.ERROR_MESSAGE);
		} catch (ClassNotFoundException ex) {
			JOptionPane.showMessageDialog(null, "file class " + driver + " not found.", "ERROR",
					JOptionPane.ERROR_MESSAGE);
		}
		return null;
	}

	public static boolean CheckInternetConnection() {
		try {
			URL url = new URL("http://www.google.co.th/");
			URLConnection conn = url.openConnection();
			conn.connect();
			return true;
		} catch (IOException e) {
			return false;
		}
	}
}
