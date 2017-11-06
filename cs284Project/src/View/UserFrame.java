package View;

import Model.User;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class UserFrame extends JFrame {

	private JLabel userIDlb, userNamelb, firstNamelb, lastNamelb, emaillb, ranklb, statuslb;
	private JLabel userID, userName, firstName, lastName, email, rank, status;
	private JButton logout, exit;
	private User user;

	public UserFrame(User user) {
		this.user = user;
		userIDlb = new JLabel("ID");
		userNamelb = new JLabel("Username");
		firstNamelb = new JLabel("Firstname");
		lastNamelb = new JLabel("Lastname");
		emaillb = new JLabel("E-mail");
		ranklb = new JLabel("Status");
		statuslb = new JLabel("Status");
		userID = new JLabel(user.getUserID());
		userName = new JLabel(user.getUserName());
		firstName = new JLabel(user.getFirstName());
		lastName = new JLabel(user.getLastName());
		email = new JLabel(user.getEmail());
		rank = new JLabel(user.getRank());
		this.exit = new JButton("Exit");
		this.logout = new JButton("Logout");
		this.exit.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		this.logout.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
				new LoginFrame();
			}
		});
		this.setTitle("Welcome " + user.getFirstName());
		JPanel info = new JPanel(new GridLayout(7, 7));
		info.add(userIDlb);
		info.add(userID);
		info.add(userNamelb);
		info.add(userName);
		info.add(firstNamelb);
		info.add(firstName);
		info.add(lastNamelb);
		info.add(lastName);
		info.add(emaillb);
		info.add(email);
		info.add(ranklb);
		info.add(rank);
		info.add(statuslb);
		JPanel btnPanel = new JPanel();
		btnPanel.add(logout);
		btnPanel.add(exit);
		JPanel panel = new JPanel();
		panel.add(info);
		JPanel panel2 = new JPanel();
		panel2.add(btnPanel);
		this.add(panel, BorderLayout.CENTER);
		this.add(panel2, BorderLayout.SOUTH);
		this.pack();
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null); // center on screen
		this.setVisible(true);
	}
}
