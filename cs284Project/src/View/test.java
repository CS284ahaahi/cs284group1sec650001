package View;

import javax.swing.JFrame;

public class test extends JFrame{
	public static void main(String[] args) {
		test mainframe=new test();
		LoginPage pp=new LoginPage();
		mainframe.add(pp);
		mainframe.setTitle("CS284 PROJECT");
		
		
		mainframe.pack();
		mainframe.setVisible(true);
		mainframe.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

}