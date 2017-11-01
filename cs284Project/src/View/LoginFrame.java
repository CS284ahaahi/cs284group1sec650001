package View;

import Controller.ConnectDB;
import Model.User;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import Controller.UserMgnt;;

public class LoginFrame extends JFrame {

	private JTextField userIn;
	private JButton loginBtn;
	private JPasswordField passIn;

	public LoginFrame() {
		this.userIn = new JTextField(10);
		this.loginBtn = new JButton("Login");
		this.passIn = new JPasswordField(10);
		this.passIn.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				super.keyPressed(e);
				if (e.getKeyCode() == KeyEvent.VK_ENTER) {
					submit();
				}
			}
		});
		JLabel loginlb = new JLabel("LOGIN");
		JLabel userlb = new JLabel("USER");
		JLabel passlb = new JLabel("PASS");
		this.loginBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				submit();
			}
		});
		JPanel mainPanel = new JPanel(new GridLayout(4, 1));
		JPanel hPanel = new JPanel();
		JPanel userPanel = new JPanel();
		JPanel passPanel = new JPanel();
		JPanel btnPanel = new JPanel();
		hPanel.add(loginlb);
		userPanel.add(userlb);
		userPanel.add(userIn);
		passPanel.add(passlb);
		passPanel.add(passIn);
		btnPanel.add(loginBtn);
		mainPanel.add(hPanel);
		mainPanel.add(userPanel);
		mainPanel.add(passPanel);
		mainPanel.add(btnPanel);
		mainPanel.setPreferredSize(new Dimension(230, 160));
		this.setTitle("CS284");
		this.add(mainPanel);
		this.pack();
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null); // center on screen
		this.setVisible(true);
		if(ConnectDB.CheckInternetConnection()){
			if (ConnectDB.getConnect() == null) {
				this.userIn.setEditable(false);
				this.passIn.setEditable(false);
				this.loginBtn.setEnabled(false);
			}
		}else{
			JOptionPane.showMessageDialog(this, "Can't connect internet please check Internet Conection","Error",JOptionPane.ERROR_MESSAGE);
			this.userIn.setEditable(false);
			this.passIn.setEditable(false);
			this.loginBtn.setEnabled(false);
		}
	}

	public void submit() {
		String user = this.userIn.getText().trim();
		String pass = new String(this.passIn.getPassword());
		if (user.equals("") || pass.equals("")) {
			JOptionPane.showMessageDialog(this, "Please Enter Username,Password", "Message", JOptionPane.ERROR_MESSAGE);
		} else {
			User us = UserMgnt.checkUserPass(user, pass);
			if (us != null) {
				new UserFrame(us);
				this.dispose();
			} else {
				this.userIn.setText("");
				this.passIn.setText("");
				JOptionPane.showMessageDialog(this, "Username Or Password incorrect!", "Message",
						JOptionPane.ERROR_MESSAGE);
			}

		}
	}
}
