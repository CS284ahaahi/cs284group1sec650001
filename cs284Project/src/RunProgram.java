
import javax.swing.JFrame;
import View.LoginPage;
import View.createSubjectPage;
import View.profresserPage;

public class RunProgram {
	public static void main(String[] args) {
		//LoginPage login = new LoginPage();
		JFrame frame = new JFrame();
		frame.add(new createSubjectPage());
		frame.pack();
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
