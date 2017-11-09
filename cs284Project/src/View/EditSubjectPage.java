package View;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import Controller.SubjectMgnt;
import Model.GradingCriteria;
import Model.Subject;
import Model.User;

public class EditSubjectPage extends javax.swing.JPanel {
	private JFrame frame;
	private Subject sub;
	private User us;

	public EditSubjectPage(Subject sub, User us) {
		initComponents();
		this.sub = sub;
		this.us = us;
		this.importBtt.setEnabled(false);
		this.addBtt.setEnabled(false);
		idSubjectInput.setEditable(false);
		idSubjectInput.setText(sub.getCode());
		nameSurname.setText(us.getFirstName() + " " + us.getLastName());
		secInput1.setEditable(false);
		secInput1.setText(sub.getSection());
		subjectInput.setEditable(false);
		subjectInput.setText(sub.getNameThai());
		subInput.setEditable(false);
		subInput.setText(sub.getNameEng());
		yearInput.setEnabled(false);
		yearInput.addItem(sub.getSemester());
		yearInput.setSelectedItem(sub.getSemester());
		yearInput1.setEnabled(false);
		yearInput1.addItem(sub.getYear());
		yearInput1.setSelectedItem(sub.getYear());
		GradingCriteria gc = sub.getGradeCri();
		aScore.setText(gc.getA() + "");
		bpScore.setText(gc.getBp() + "");
		bScore.setText(gc.getB() + "");
		cpScore.setText(gc.getCp() + "");
		cScore.setText(gc.getC() + "");
		dpScore.setText(gc.getDp() + "");
		dScore.setText(gc.getD() + "");
		fScore.setText("< "+gc.getD());
		fScore.setEditable(false);
		logoutBtt.setText("Back");
		backBtt.setText("Save");
		frame = new JFrame("CS284 Project");
		frame.add(this);
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null); // center on screen
		frame.setVisible(true);
	}

	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		lineID = new javax.swing.JSeparator();
		PA2 = new javax.swing.JLabel();
		jPanel1 = new javax.swing.JPanel();
		logoTU1 = new javax.swing.JLabel();
		loginNametxt = new javax.swing.JLabel();
		nameSurname = new javax.swing.JLabel();
		logoutBtt = new javax.swing.JButton();
		loginNametxt1 = new javax.swing.JLabel();
		idSubjectInput = new javax.swing.JTextField();
		loginNametxt2 = new javax.swing.JLabel();
		subjectInput = new javax.swing.JTextField();
		subjectTxt = new javax.swing.JLabel();
		tearmTxt = new javax.swing.JLabel();
		subInput = new javax.swing.JTextField();
		Ftxt = new javax.swing.JLabel();
		BPtxt = new javax.swing.JLabel();
		Btxt = new javax.swing.JLabel();
		PA = new javax.swing.JLabel();
		CPtxt = new javax.swing.JLabel();
		Ctxt = new javax.swing.JLabel();
		DPtxt = new javax.swing.JLabel();
		Dtxt = new javax.swing.JLabel();
		Atxt1 = new javax.swing.JLabel();
		uploadTxt = new javax.swing.JLabel();
		importBtt = new javax.swing.JButton();
		addBtt = new javax.swing.JButton();
		bpScore = new javax.swing.JTextField();
		aScore = new javax.swing.JTextField();
		bScore = new javax.swing.JTextField();
		cpScore = new javax.swing.JTextField();
		cScore = new javax.swing.JTextField();
		dpScore = new javax.swing.JTextField();
		dScore = new javax.swing.JTextField();
		fScore = new javax.swing.JTextField();
		uploadTxt1 = new javax.swing.JLabel();
		yearInput = new javax.swing.JComboBox<>();
		subjectTxt1 = new javax.swing.JLabel();
		secInput1 = new javax.swing.JTextField();
		loginNametxt5 = new javax.swing.JLabel();
		yearInput1 = new javax.swing.JComboBox<>();
		backBtt = new javax.swing.JButton();
		PA1 = new javax.swing.JLabel();
		PA3 = new javax.swing.JLabel();
		PA4 = new javax.swing.JLabel();
		PA5 = new javax.swing.JLabel();
		PA6 = new javax.swing.JLabel();
		PA7 = new javax.swing.JLabel();
		PA8 = new javax.swing.JLabel();

		PA2.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
		PA2.setText("point");

		setBackground(new java.awt.Color(255, 233, 114));

		jPanel1.setBackground(new java.awt.Color(255, 153, 0));

		logoTU1.setIcon(new javax.swing.ImageIcon(getClass().getResource("Logo-TU.png"))); // NOI18N
		logoTU1.setPreferredSize(new java.awt.Dimension(150, 150));

		loginNametxt.setFont(new java.awt.Font("Century Gothic", 1, 50)); // NOI18N
		loginNametxt.setText("Login name : ");

		nameSurname.setFont(new java.awt.Font("Century Gothic", 1, 38)); // NOI18N
		nameSurname.setText("NAME + SURNAME");

		logoutBtt.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
		logoutBtt.setForeground(new java.awt.Color(51, 51, 51));
		logoutBtt.setText("logout");
		logoutBtt.setBorder(null);
		logoutBtt.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				logoutBttMouseClicked(evt);
			}
		});

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup().addGap(57, 57, 57)
						.addComponent(logoTU1, javax.swing.GroupLayout.PREFERRED_SIZE, 214,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(41, 41, 41)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(loginNametxt).addComponent(nameSurname))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
								javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(logoutBtt, javax.swing.GroupLayout.PREFERRED_SIZE, 59,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap()));
		jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
						jPanel1Layout.createSequentialGroup().addContainerGap().addComponent(logoutBtt)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(loginNametxt)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(nameSurname).addContainerGap(47, Short.MAX_VALUE))
				.addComponent(logoTU1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE,
						javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));

		loginNametxt1.setFont(new java.awt.Font("AngsanaUPC", 0, 40)); // NOI18N
		loginNametxt1.setText("รหัสวิชา");

		idSubjectInput.setBackground(new java.awt.Color(255, 233, 114));
		idSubjectInput.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
		idSubjectInput.setForeground(new java.awt.Color(255, 153, 0));
		idSubjectInput.setText("XXXXX");
		idSubjectInput.setBorder(null);

		loginNametxt2.setFont(new java.awt.Font("Century Gothic", 0, 31)); // NOI18N
		loginNametxt2.setText("Sec");

		subjectInput.setBackground(new java.awt.Color(255, 233, 114));
		subjectInput.setFont(new java.awt.Font("Angsana New", 1, 32)); // NOI18N
		subjectInput.setForeground(new java.awt.Color(255, 153, 0));
		subjectInput.setText("XXXXXXXXXXXXXXXXXXXXXXXXXXX");
		subjectInput.setBorder(null);

		subjectTxt.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
		subjectTxt.setText("Subject");

		tearmTxt.setFont(new java.awt.Font("AngsanaUPC", 0, 40)); // NOI18N
		tearmTxt.setText("เทอม");

		subInput.setBackground(new java.awt.Color(255, 233, 114));
		subInput.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
		subInput.setForeground(new java.awt.Color(255, 153, 0));
		subInput.setText("XXXXXXXXXXXXXXXXXXXXXXXXX");
		subInput.setBorder(null);

		Ftxt.setFont(new java.awt.Font("Adobe Garamond Pro", 0, 32)); // NOI18N
		Ftxt.setText("F");

		BPtxt.setFont(new java.awt.Font("Adobe Garamond Pro", 0, 32)); // NOI18N
		BPtxt.setText("B+");

		Btxt.setFont(new java.awt.Font("Adobe Garamond Pro", 0, 32)); // NOI18N
		Btxt.setText("B ");

		PA.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
		PA.setText("point");

		CPtxt.setFont(new java.awt.Font("Adobe Garamond Pro", 0, 32)); // NOI18N
		CPtxt.setText("C+");

		Ctxt.setFont(new java.awt.Font("Adobe Garamond Pro", 0, 32)); // NOI18N
		Ctxt.setText("C");

		DPtxt.setFont(new java.awt.Font("Adobe Garamond Pro", 0, 32)); // NOI18N
		DPtxt.setText("D+");

		Dtxt.setFont(new java.awt.Font("Adobe Garamond Pro", 0, 32)); // NOI18N
		Dtxt.setText("D");

		Atxt1.setFont(new java.awt.Font("Adobe Garamond Pro", 0, 32)); // NOI18N
		Atxt1.setText("A");

		uploadTxt.setFont(new java.awt.Font("AngsanaUPC", 0, 40)); // NOI18N
		uploadTxt.setText("อัพโหลดราชชื่อนักศึกษา");

		importBtt.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
		importBtt.setText("import");

		addBtt.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
		addBtt.setText("add");

		bpScore.setBackground(new java.awt.Color(255, 233, 114));
		bpScore.setFont(new java.awt.Font("Tahoma", 0, 26)); // NOI18N
		bpScore.setText("75-79");

		aScore.setBackground(new java.awt.Color(255, 233, 114));
		aScore.setFont(new java.awt.Font("Tahoma", 0, 26)); // NOI18N
		aScore.setText("80-100");

		bScore.setBackground(new java.awt.Color(255, 233, 114));
		bScore.setFont(new java.awt.Font("Tahoma", 0, 26)); // NOI18N
		bScore.setText("70-74");

		cpScore.setBackground(new java.awt.Color(255, 233, 114));
		cpScore.setFont(new java.awt.Font("Tahoma", 0, 26)); // NOI18N
		cpScore.setText("58-69");

		cScore.setBackground(new java.awt.Color(255, 233, 114));
		cScore.setFont(new java.awt.Font("Tahoma", 0, 26)); // NOI18N
		cScore.setText("50-57");

		dpScore.setBackground(new java.awt.Color(255, 233, 114));
		dpScore.setFont(new java.awt.Font("Tahoma", 0, 26)); // NOI18N
		dpScore.setText("45-49");

		dScore.setBackground(new java.awt.Color(255, 233, 114));
		dScore.setFont(new java.awt.Font("Tahoma", 0, 26)); // NOI18N
		dScore.setText("40-44");

		fScore.setBackground(new java.awt.Color(255, 233, 114));
		fScore.setFont(new java.awt.Font("Tahoma", 0, 26)); // NOI18N
		fScore.setText("0-39");

		uploadTxt1.setFont(new java.awt.Font("AngsanaUPC", 0, 40)); // NOI18N
		uploadTxt1.setText("เพิ่มรายวิชา");

		yearInput.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
		yearInput.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "summer", " " }));

		subjectTxt1.setFont(new java.awt.Font("AngsanaUPC", 0, 40)); // NOI18N
		subjectTxt1.setText("ชื่อวิชา");

		secInput1.setBackground(new java.awt.Color(255, 233, 114));
		secInput1.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
		secInput1.setForeground(new java.awt.Color(255, 153, 0));
		secInput1.setText("XXXXXX");
		secInput1.setBorder(null);

		loginNametxt5.setFont(new java.awt.Font("AngsanaUPC", 0, 40)); // NOI18N
		loginNametxt5.setText(" ปีการศึกษา");

		yearInput1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
		yearInput1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "year", " " }));

		backBtt.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
		backBtt.setText("back");
		backBtt.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				backBttActionPerformed(e);
			}
		});

		PA1.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
		PA1.setText("point");

		PA3.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
		PA3.setText("point");

		PA4.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
		PA4.setText("point");

		PA5.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
		PA5.setText("point");

		PA6.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
		PA6.setText("point");

		PA7.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
		PA7.setText("point");

		PA8.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
		PA8.setText("point");

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
		this.setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE,
						javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
				.addGroup(layout.createSequentialGroup().addGap(110, 110, 110).addGroup(layout
						.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(layout.createSequentialGroup().addComponent(loginNametxt1).addGap(18, 18, 18)
								.addComponent(idSubjectInput, javax.swing.GroupLayout.PREFERRED_SIZE, 95,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(55, 55, 55).addComponent(loginNametxt2).addGap(25, 25, 25)
								.addComponent(secInput1, javax.swing.GroupLayout.PREFERRED_SIZE, 95,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(185, 185, 185)
								.addComponent(Atxt1, javax.swing.GroupLayout.PREFERRED_SIZE, 40,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(30, 30, 30)
								.addComponent(aScore, javax.swing.GroupLayout.PREFERRED_SIZE, 90,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(20, 20, 20).addComponent(PA, javax.swing.GroupLayout.PREFERRED_SIZE, 92,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGroup(layout.createSequentialGroup()
								.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addComponent(subjectTxt1).addComponent(subjectTxt))
								.addGap(22, 22, 22)
								.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addComponent(subjectInput, javax.swing.GroupLayout.PREFERRED_SIZE, 410,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addComponent(subInput, javax.swing.GroupLayout.PREFERRED_SIZE, 410,
												javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGap(100, 100, 100)
								.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addComponent(BPtxt).addComponent(Btxt).addComponent(CPtxt,
												javax.swing.GroupLayout.PREFERRED_SIZE, 54,
												javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGap(16, 16, 16)
								.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addComponent(bpScore, javax.swing.GroupLayout.PREFERRED_SIZE, 90,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addComponent(bScore, javax.swing.GroupLayout.PREFERRED_SIZE, 90,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addComponent(cpScore, javax.swing.GroupLayout.PREFERRED_SIZE, 90,
												javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGap(20, 20, 20)
								.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addComponent(PA3, javax.swing.GroupLayout.PREFERRED_SIZE, 92,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addComponent(PA4, javax.swing.GroupLayout.PREFERRED_SIZE, 92,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addComponent(PA1, javax.swing.GroupLayout.PREFERRED_SIZE, 92,
												javax.swing.GroupLayout.PREFERRED_SIZE)))
						.addGroup(layout.createSequentialGroup().addComponent(tearmTxt).addGap(32, 32, 32)
								.addComponent(yearInput, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(24, 24, 24).addComponent(loginNametxt5).addGap(13, 13, 13)
								.addComponent(yearInput1, javax.swing.GroupLayout.PREFERRED_SIZE, 132,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(120, 120, 120)
								.addComponent(Ctxt, javax.swing.GroupLayout.PREFERRED_SIZE, 40,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(30, 30, 30)
								.addComponent(cScore, javax.swing.GroupLayout.PREFERRED_SIZE, 90,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(20, 20, 20).addComponent(PA6, javax.swing.GroupLayout.PREFERRED_SIZE, 92,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGroup(layout.createSequentialGroup()
								.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addComponent(uploadTxt)
										.addGroup(layout.createSequentialGroup().addGap(140, 140, 140)
												.addComponent(uploadTxt1)))
								.addGap(22, 22, 22)
								.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addComponent(addBtt, javax.swing.GroupLayout.PREFERRED_SIZE, 160,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addComponent(importBtt, javax.swing.GroupLayout.PREFERRED_SIZE, 160,
												javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGap(170, 170, 170)
								.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addComponent(DPtxt)
										.addComponent(Dtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addComponent(Ftxt))
								.addGap(28, 28, 28)
								.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addComponent(dpScore, javax.swing.GroupLayout.PREFERRED_SIZE, 90,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addComponent(dScore, javax.swing.GroupLayout.PREFERRED_SIZE, 90,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addComponent(fScore, javax.swing.GroupLayout.PREFERRED_SIZE, 90,
												javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGap(20, 20, 20)
								.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addComponent(PA5, javax.swing.GroupLayout.PREFERRED_SIZE, 92,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addComponent(PA8, javax.swing.GroupLayout.PREFERRED_SIZE, 92,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addComponent(PA7, javax.swing.GroupLayout.PREFERRED_SIZE, 92,
												javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGap(44, 44, 44).addComponent(backBtt, javax.swing.GroupLayout.PREFERRED_SIZE, 121,
										javax.swing.GroupLayout.PREFERRED_SIZE)))));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout
				.createSequentialGroup()
				.addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
						javax.swing.GroupLayout.PREFERRED_SIZE)
				.addGap(46, 46, 46)
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addComponent(loginNametxt1).addComponent(loginNametxt2).addComponent(Atxt1)
						.addComponent(aScore, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGroup(layout.createSequentialGroup().addGap(10, 10, 10).addGroup(layout
								.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(idSubjectInput, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(secInput1, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(PA))))
				.addGap(3, 3, 3)
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(layout.createSequentialGroup().addGap(10, 10, 10).addComponent(subjectTxt1)
								.addGap(23, 23, 23).addComponent(subjectTxt))
						.addGroup(layout.createSequentialGroup().addGap(20, 20, 20)
								.addComponent(subjectInput, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(23, 23, 23).addComponent(subInput, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGroup(layout.createSequentialGroup().addComponent(BPtxt).addGap(8, 8, 8).addComponent(Btxt)
								.addGap(8, 8, 8).addComponent(CPtxt))
						.addGroup(layout.createSequentialGroup()
								.addComponent(bpScore, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(12, 12, 12)
								.addComponent(bScore, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(12, 12, 12).addComponent(cpScore, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGroup(layout.createSequentialGroup().addGap(10, 10, 10).addComponent(PA3).addGap(27, 27, 27)
								.addComponent(PA4).addGap(27, 27, 27).addComponent(PA1)))
				.addGap(8, 8, 8)
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(tearmTxt)
						.addComponent(loginNametxt5).addComponent(Ctxt)
						.addComponent(cScore, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGroup(layout.createSequentialGroup().addGap(10, 10, 10).addGroup(layout
								.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(yearInput, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(yearInput1, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(PA6))))
				.addGap(3, 3, 3)
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(layout.createSequentialGroup().addGap(10, 10, 10).addComponent(uploadTxt)
								.addGap(13, 13, 13).addComponent(uploadTxt1))
						.addGroup(layout.createSequentialGroup().addGap(10, 10, 10).addComponent(addBtt)
								.addGap(33, 33, 33).addComponent(importBtt))
						.addGroup(layout.createSequentialGroup().addComponent(DPtxt).addGap(8, 8, 8).addComponent(Dtxt)
								.addGap(8, 8, 8).addComponent(Ftxt))
						.addGroup(layout.createSequentialGroup()
								.addComponent(dpScore, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(12, 12, 12)
								.addComponent(dScore, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(12, 12, 12).addComponent(fScore, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGroup(layout.createSequentialGroup().addGap(10, 10, 10).addComponent(PA5).addGap(27, 27, 27)
								.addComponent(PA8).addGap(27, 27, 27).addComponent(PA7))
						.addGroup(layout.createSequentialGroup().addGap(117, 117, 117).addComponent(backBtt)))));
	}// </editor-fold>

	private void logoutBttMouseClicked(java.awt.event.MouseEvent evt) {
		frame.dispose();
	}

	private void backBttActionPerformed(ActionEvent e) { // save
		try {
			int A, Bp, B, Cp, C, Dp, D;
			A = Integer.parseInt(aScore.getText());
			Bp = Integer.parseInt(bpScore.getText());
			B = Integer.parseInt(bScore.getText());
			Cp = Integer.parseInt(cpScore.getText());
			C = Integer.parseInt(cScore.getText());
			Dp = Integer.parseInt(dpScore.getText());
			D = Integer.parseInt(dScore.getText());
			if (A > 0 && Bp > 0 && B > 0 && Cp > 0 && C > 0 && Dp > 0 && D > 0) {
				if (A <= 100 && Bp <= 100 && B <= 100 && Cp <= 100 && C <= 100 && Dp <= 100 && D <= 100) {
					if (A > Bp && Bp > B && B > Cp && Cp > C && C > Dp && Dp > D) {

						GradingCriteria gc = new GradingCriteria(A, Bp, B, Cp, C, Dp, D);
						if (SubjectMgnt.editGradingCriteria(gc, sub)) {
							sub.setGradeCri(gc);
							JOptionPane.showMessageDialog(frame, "Save Complete");
							frame.dispose();
							return;
						}
					}
				}
			}
			JOptionPane.showMessageDialog(frame, "Invalid format input", "Error", JOptionPane.ERROR_MESSAGE);

		} catch (NumberFormatException er) {
			JOptionPane.showMessageDialog(frame, "Invalid input", "Error", JOptionPane.ERROR_MESSAGE);
		}
	}

	// Variables declaration - do not modify
	private javax.swing.JLabel Atxt1;
	private javax.swing.JLabel BPtxt;
	private javax.swing.JLabel Btxt;
	private javax.swing.JLabel CPtxt;
	private javax.swing.JLabel Ctxt;
	private javax.swing.JLabel DPtxt;
	private javax.swing.JLabel Dtxt;
	private javax.swing.JLabel Ftxt;
	private javax.swing.JLabel PA;
	private javax.swing.JLabel PA1;
	private javax.swing.JLabel PA2;
	private javax.swing.JLabel PA3;
	private javax.swing.JLabel PA4;
	private javax.swing.JLabel PA5;
	private javax.swing.JLabel PA6;
	private javax.swing.JLabel PA7;
	private javax.swing.JLabel PA8;
	private javax.swing.JTextField aScore;
	private javax.swing.JButton addBtt;
	private javax.swing.JTextField bScore;
	private javax.swing.JButton backBtt;
	private javax.swing.JTextField bpScore;
	private javax.swing.JTextField cScore;
	private javax.swing.JTextField cpScore;
	private javax.swing.JTextField dScore;
	private javax.swing.JTextField dpScore;
	private javax.swing.JTextField fScore;
	private javax.swing.JTextField idSubjectInput;
	private javax.swing.JButton importBtt;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JSeparator lineID;
	private javax.swing.JLabel loginNametxt;
	private javax.swing.JLabel loginNametxt1;
	private javax.swing.JLabel loginNametxt2;
	private javax.swing.JLabel loginNametxt5;
	private javax.swing.JLabel logoTU1;
	private javax.swing.JButton logoutBtt;
	private javax.swing.JLabel nameSurname;
	private javax.swing.JTextField secInput1;
	private javax.swing.JTextField subInput;
	private javax.swing.JTextField subjectInput;
	private javax.swing.JLabel subjectTxt;
	private javax.swing.JLabel subjectTxt1;
	private javax.swing.JLabel tearmTxt;
	private javax.swing.JLabel uploadTxt;
	private javax.swing.JLabel uploadTxt1;
	private javax.swing.JComboBox<String> yearInput;
	private javax.swing.JComboBox<String> yearInput1;
	// End of variables declaration
}
