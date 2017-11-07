package View;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.KeyboardFocusManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Collections;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import Model.User;
import Controller.UserMgnt;

public class LoginPage extends JPanel{
	
	private JFrame frame;
    public LoginPage() {
        initComponents();
        frame = new JFrame("CS284 Project");
        frame.add(this);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null); // center on screen
        frame.setVisible(true);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        passwordtxt = new javax.swing.JLabel();
        IDtxt = new javax.swing.JLabel();
        linepasswotd = new javax.swing.JSeparator();
        lineID = new javax.swing.JSeparator();
        registerbtt = new javax.swing.JButton();
        loginbtt = new javax.swing.JButton();
        logoTU = new javax.swing.JLabel();
        bigbackground = new javax.swing.JLabel();
        passwordInput = new javax.swing.JPasswordField();
        IDinput = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 51, 51));
        setForeground(new java.awt.Color(255, 255, 255));

        passwordtxt.setFont(new java.awt.Font("Century", 1, 18)); // NOI18N
        passwordtxt.setForeground(new java.awt.Color(255, 255, 255));
        passwordtxt.setText("PASSWORD");

        IDtxt.setFont(new java.awt.Font("Century", 1, 18)); // NOI18N
        IDtxt.setForeground(new java.awt.Color(255, 255, 255));
        IDtxt.setText("ID");

        registerbtt.setBackground(new java.awt.Color(204, 204, 204));
        registerbtt.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        registerbtt.setForeground(new java.awt.Color(255, 102, 102));
        registerbtt.setText("REGISTER");
        registerbtt.setBorder(null);
        registerbtt.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                registerbttActionPerformed(evt);
            }
        });

        loginbtt.setBackground(new Color(204, 204, 204));
        loginbtt.setFont(new Font("Tahoma", 0, 18)); // NOI18N
        loginbtt.setForeground(new Color(255, 102, 102));
        loginbtt.setText("LOGIN");
        loginbtt.setBorder(null);
        loginbtt.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				loginbttActionPerformed(e);
			}
		});

        logoTU.setIcon(new javax.swing.ImageIcon(getClass().getResource("Logo-TU.png"))); // NOI18N

        bigbackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("background-TU.png"))); // NOI18N
        bigbackground.setMaximumSize(new Dimension(600, 800));
        bigbackground.setMinimumSize(new Dimension(600, 800));
        bigbackground.setPreferredSize(new Dimension(600, 736));

        passwordInput.setBackground(new Color(255, 51, 51));
        passwordInput.setFont(new Font("Century Gothic", 0, 18)); // NOI18N
        passwordInput.setForeground(new Color(255, 255, 255));
        passwordInput.setText("000000000000");
        passwordInput.setBorder(null);
        passwordInput.setOpaque(false);//clear
        
        passwordInput.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                passwordInputActionPerformed(evt);
            }
        });
        
        passwordInput.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mousePressed(MouseEvent e) {
        		passwordInputMousePressed(e);
        	}
		});

        IDinput.setBackground(new Color(255, 51, 51));
        IDinput.setFont(new Font("Century Gothic", 0, 18)); // NOI18N
        IDinput.setForeground(new Color(255, 255, 255));
        IDinput.setText("Enter you ID");
        IDinput.setBorder(null);
        IDinput.setOpaque(false);
        IDinput.setFocusTraversalKeys(KeyboardFocusManager.FORWARD_TRAVERSAL_KEYS,Collections.EMPTY_SET);
        IDinput.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mousePressed(MouseEvent e) {
        		IDinputMousePressed(e);
        	}
		});
        
        IDinput.addKeyListener(new KeyAdapter() {
        	@Override
        	public void keyPressed(KeyEvent e) {
        		IDinputKeyPressed(e);
        	}
		});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(420, 420, 420)
                .addComponent(IDinput, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(420, 420, 420)
                .addComponent(lineID, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(420, 420, 420)
                .addComponent(linepasswotd, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(430, 430, 430)
                .addComponent(loginbtt, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(registerbtt, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(420, 420, 420)
                .addComponent(passwordInput, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(logoTU))
            .addGroup(layout.createSequentialGroup()
                .addGap(420, 420, 420)
                .addComponent(passwordtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(420, 420, 420)
                .addComponent(IDtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(bigbackground, javax.swing.GroupLayout.PREFERRED_SIZE, 780, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addComponent(IDinput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(lineID, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(110, 110, 110)
                .addComponent(linepasswotd, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(loginbtt, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(registerbtt, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(layout.createSequentialGroup()
                .addGap(230, 230, 230)
                .addComponent(passwordInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(logoTU))
            .addGroup(layout.createSequentialGroup()
                .addGap(170, 170, 170)
                .addComponent(passwordtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(IDtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(bigbackground, javax.swing.GroupLayout.PREFERRED_SIZE, 750, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }                 

  
    
	private void IDinputKeyPressed(KeyEvent e) {
		if(e.getKeyCode() == KeyEvent.VK_TAB) {
			this.passwordInput.grabFocus();
			if(IDinput.getText().equals("")) {
				this.IDinput.setText("Enter you ID");
			}
			String password = new String(passwordInput.getPassword());
			if(password.equals("000000000000")) {
				this.passwordInput.setText("");
			}
		}
	}
	private void IDinputMousePressed(MouseEvent e) {
		if(IDinput.getText().equals("Enter you ID")) {
			this.IDinput.setText("");
		}
		String password = new String(passwordInput.getPassword());
		if(password.equals("")) {
			this.passwordInput.setText("000000000000");
		}
	}
	private void passwordInputMousePressed(MouseEvent e) {
		String password = new String(passwordInput.getPassword());
		if(password.equals("000000000000")) {
			this.passwordInput.setText("");
		}
		if(IDinput.getText().equals("")) {
			this.IDinput.setText("Enter you ID");
		}
	}
	private void loginbttActionPerformed(ActionEvent evt) {
		submit();
	}
	private void passwordInputActionPerformed(ActionEvent evt) {
    	submit();
    }                                             

    private void registerbttActionPerformed(ActionEvent evt) {
    	JOptionPane.showMessageDialog(this, "Coming soon");
    }                                           

    private void submit() {
		String user = this.IDinput.getText().trim();
		String pass = new String(this.passwordInput.getPassword());
		if (user.equals("") || pass.equals("")) {
			JOptionPane.showMessageDialog(this, "Please Enter Username,Password", "Message", JOptionPane.ERROR_MESSAGE);
		} else {
			User us = UserMgnt.checkUserPass(user, pass);
			if (us != null) {
				if(us.getRank().equals("STUDENT")){
					JOptionPane.showMessageDialog(this, "Page for student coming soon");
					this.IDinput.setText("");
					this.passwordInput.setText("");
					this.IDinput.grabFocus();
				}else if(us.getRank().equals("ADMIN")){
					JOptionPane.showMessageDialog(this, "Page for admin coming soon");
					this.IDinput.setText("");
					this.passwordInput.setText("");
					this.IDinput.grabFocus();
				}else {
					this.frame.dispose();
					new UserFrame(us);
				}
			} else {
				this.IDinput.setText("");
				this.passwordInput.setText("");
				this.IDinput.grabFocus();
				JOptionPane.showMessageDialog(this, "Username Or Password incorrect!", "Message",
						JOptionPane.ERROR_MESSAGE);
			}
		}
	}
    
    private javax.swing.JTextField IDinput;
    private javax.swing.JLabel IDtxt;
    private javax.swing.JLabel bigbackground;
    private javax.swing.JSeparator lineID;
    private javax.swing.JSeparator linepasswotd;
    private javax.swing.JButton loginbtt;
    private javax.swing.JLabel logoTU;
    private javax.swing.JPasswordField passwordInput;
    private javax.swing.JLabel passwordtxt;
    private javax.swing.JButton registerbtt;

	
}
