package Controller;

import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
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
	
	public static boolean sendEmail(String email, String title, String text) {
		String to = email;
		String from = "cs284cstu@gmail.com";
		final String username = "cs284cstu@gmail.com";
		final String password = "0822808826";
		String host = "smtp.gmail.com";
		Properties props = new Properties();
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.starttls.enable", "true");
		props.put("mail.smtp.host", host);
		props.put("mail.smtp.port", "587");
		Session session = Session.getInstance(props, new javax.mail.Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(username, password);
			}
		});
		try {
			Message message = new MimeMessage(session);
			message.setFrom(new InternetAddress(from));
			message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(to));
			message.setSubject(title);
			message.setText(text);
			// Send message
			Transport.send(message);
			return true;
		} catch (MessagingException e) {
			JOptionPane.showMessageDialog(null, e.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
			return false;
		}
	}
}
