package View;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import Controller.FileMgnt;
import Controller.SubjectMgnt;
import Model.ClassList;
import Model.EmailList;
import Model.ExamCriteria;
import Model.GradingCriteria;
import Model.Subject;
import Model.User;

public class CreateSubjectPage extends javax.swing.JPanel {
	private JFrame frame, old;
	private User us;
	private ExamCriteria ec;
	private ClassList cl;
	private EmailList el;
	private GradingCriteria gc;
	private ExamCriteriaPage ecp;

	public CreateSubjectPage(User us, JFrame seframe) {
		this.us = us;
		this.old = seframe;
		initComponents();
		idSubjectInput.setText("code");
		nameSurname.setText(us.getFirstName() + " " + us.getLastName());
		secInput1.setText("section");
		subjectInput.setText("ใส่ชื่อวิชา");
		subInput.setText("input name in english");
		yearInput.addItem("1");
		yearInput.setEnabled(false);
		yearInput.setSelectedItem("1");
		yearInput1.addItem("2560");
		yearInput1.setEnabled(false);
		yearInput1.setSelectedItem("2560");
		aScore.setText("80");
		bpScore.setText("75");
		bScore.setText("70");
		cpScore.setText("65");
		cScore.setText("60");
		dpScore.setText("55");
		dScore.setText("50");
		fScore.setText("< D");
		fScore.setEditable(false);
		frame = new JFrame("CS284 Project");
		frame.add(this);
		frame.setSize(1055, 795);
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
		backBtt = new javax.swing.JButton();
		loginNametxt1 = new javax.swing.JLabel();
		idSubjectInput = new javax.swing.JTextField();
		loginNametxt2 = new javax.swing.JLabel();
		subjectInput = new javax.swing.JTextField();
		subjectTxt = new javax.swing.JLabel();
		tearmTxt = new javax.swing.JLabel();
		subInput = new javax.swing.JTextField();
		uploadTxt = new javax.swing.JLabel();
		criteriaBtn = new javax.swing.JButton();
		addBtt = new javax.swing.JButton();
		uploadTxt1 = new javax.swing.JLabel();
		yearInput = new javax.swing.JComboBox<>();
		subjectTxt1 = new javax.swing.JLabel();
		secInput1 = new javax.swing.JTextField();
		loginNametxt5 = new javax.swing.JLabel();
		yearInput1 = new javax.swing.JComboBox<>();
		jSeparator1 = new javax.swing.JSeparator();
		uploadTxt2 = new javax.swing.JLabel();
		importEmailBtt = new javax.swing.JButton();
		GradeCriPanel = new javax.swing.JPanel();
		Ftxt = new javax.swing.JLabel();
		BPtxt = new javax.swing.JLabel();
		Btxt = new javax.swing.JLabel();
		PA = new javax.swing.JLabel();
		CPtxt = new javax.swing.JLabel();
		Ctxt = new javax.swing.JLabel();
		DPtxt = new javax.swing.JLabel();
		Dtxt = new javax.swing.JLabel();
		bpScore = new javax.swing.JTextField();
		aScore = new javax.swing.JTextField();
		bScore = new javax.swing.JTextField();
		cpScore = new javax.swing.JTextField();
		cScore = new javax.swing.JTextField();
		dpScore = new javax.swing.JTextField();
		dScore = new javax.swing.JTextField();
		fScore = new javax.swing.JTextField();
		PA1 = new javax.swing.JLabel();
		PA3 = new javax.swing.JLabel();
		PA4 = new javax.swing.JLabel();
		PA5 = new javax.swing.JLabel();
		PA6 = new javax.swing.JLabel();
		PA7 = new javax.swing.JLabel();
		PA8 = new javax.swing.JLabel();
		Atxt2 = new javax.swing.JLabel();
		eq1 = new javax.swing.JLabel();
		eq2 = new javax.swing.JLabel();
		eq3 = new javax.swing.JLabel();
		eq4 = new javax.swing.JLabel();
		eq5 = new javax.swing.JLabel();
		eq6 = new javax.swing.JLabel();
		eq7 = new javax.swing.JLabel();
		PA9 = new javax.swing.JLabel();
		uploadTxt3 = new javax.swing.JLabel();
		importBtt2 = new javax.swing.JButton();

		PA2.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
		PA2.setText("point");

		setBackground(new java.awt.Color(255, 233, 114));
		setPreferredSize(new java.awt.Dimension(800, 652));

		jPanel1.setBackground(new java.awt.Color(255, 153, 0));
		jPanel1.setPreferredSize(new java.awt.Dimension(800, 200));

		logoTU1.setIcon(new javax.swing.ImageIcon(getClass().getResource("Logo-TU.png"))); // NOI18N
		logoTU1.setPreferredSize(new java.awt.Dimension(150, 150));

		loginNametxt.setFont(new java.awt.Font("Century Gothic", 0, 36)); // NOI18N
		loginNametxt.setText("Profressor : ");

		nameSurname.setFont(new java.awt.Font("Century Gothic", 1, 38)); // NOI18N
		nameSurname.setText("NAME + SURNAME");

		backBtt.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
		backBtt.setText("back");
		backBtt.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				backBttActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup().addGap(57, 57, 57)
						.addComponent(logoTU1, javax.swing.GroupLayout.PREFERRED_SIZE, 214,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(jPanel1Layout.createSequentialGroup().addGap(41, 41, 41)
										.addComponent(loginNametxt)
										.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
								.addGroup(jPanel1Layout.createSequentialGroup().addGap(85, 85, 85)
										.addComponent(nameSurname).addGap(0, 365, Short.MAX_VALUE))
								.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
										jPanel1Layout.createSequentialGroup()
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
														javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
												.addComponent(backBtt, javax.swing.GroupLayout.PREFERRED_SIZE, 121,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addContainerGap()))));
		jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
						jPanel1Layout.createSequentialGroup().addContainerGap().addComponent(backBtt).addGap(2, 2, 2)
								.addComponent(loginNametxt).addGap(18, 18, 18).addComponent(nameSurname)
								.addContainerGap(34, Short.MAX_VALUE))
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

		uploadTxt.setFont(new java.awt.Font("AngsanaUPC", 0, 40)); // NOI18N
		uploadTxt.setText("อัพโหลดรายชื่อนักศึกษา");

		criteriaBtn.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
		criteriaBtn.setText("Edit");
		criteriaBtn.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				criteriaBtnActionPerformed(evt);
			}
		});

		addBtt.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
		addBtt.setText("add");
		addBtt.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				addBttActionPerformed(evt);
			}
		});

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

		jSeparator1.setBackground(new java.awt.Color(153, 153, 153));

		uploadTxt2.setFont(new java.awt.Font("AngsanaUPC", 0, 40)); // NOI18N
		uploadTxt2.setText("กำหนดเกณฑ์การให้คะแนน");

		importEmailBtt.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
		importEmailBtt.setText("import");
		importEmailBtt.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				importEmailBttActionPerformed(evt);
			}
		});

		GradeCriPanel.setBackground(new java.awt.Color(255, 233, 114));
		GradeCriPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(
				javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), "เกณฑ์การตัดเกรด",
				javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION,
				new java.awt.Font("Tahoma", 1, 20))); // NOI18N

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

		bpScore.setBackground(new java.awt.Color(255, 233, 114));
		bpScore.setFont(new java.awt.Font("Tahoma", 0, 26)); // NOI18N
		bpScore.setText("75");

		aScore.setBackground(new java.awt.Color(255, 233, 114));
		aScore.setFont(new java.awt.Font("Tahoma", 0, 26)); // NOI18N
		aScore.setText("80");

		bScore.setBackground(new java.awt.Color(255, 233, 114));
		bScore.setFont(new java.awt.Font("Tahoma", 0, 26)); // NOI18N
		bScore.setText("70");

		cpScore.setBackground(new java.awt.Color(255, 233, 114));
		cpScore.setFont(new java.awt.Font("Tahoma", 0, 26)); // NOI18N
		cpScore.setText("58");

		cScore.setBackground(new java.awt.Color(255, 233, 114));
		cScore.setFont(new java.awt.Font("Tahoma", 0, 26)); // NOI18N
		cScore.setText("50");

		dpScore.setBackground(new java.awt.Color(255, 233, 114));
		dpScore.setFont(new java.awt.Font("Tahoma", 0, 26)); // NOI18N
		dpScore.setText("45");

		dScore.setBackground(new java.awt.Color(255, 233, 114));
		dScore.setFont(new java.awt.Font("Tahoma", 0, 26)); // NOI18N
		dScore.setText("40");

		fScore.setBackground(new java.awt.Color(255, 233, 114));
		fScore.setFont(new java.awt.Font("Tahoma", 0, 26)); // NOI18N
		fScore.setText("39");

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
		PA7.setText("range");

		PA8.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
		PA8.setText("point");

		Atxt2.setFont(new java.awt.Font("Adobe Garamond Pro", 0, 32)); // NOI18N
		Atxt2.setText("A");

		eq1.setFont(new java.awt.Font("Adobe Garamond Pro", 0, 32)); // NOI18N
		eq1.setText("≥");

		eq2.setFont(new java.awt.Font("Adobe Garamond Pro", 0, 32)); // NOI18N
		eq2.setText("≥");

		eq3.setFont(new java.awt.Font("Adobe Garamond Pro", 0, 32)); // NOI18N
		eq3.setText("≥");

		eq4.setFont(new java.awt.Font("Adobe Garamond Pro", 0, 32)); // NOI18N
		eq4.setText("≥");

		eq5.setFont(new java.awt.Font("Adobe Garamond Pro", 0, 32)); // NOI18N
		eq5.setText("≥");

		eq6.setFont(new java.awt.Font("Adobe Garamond Pro", 0, 32)); // NOI18N
		eq6.setText("≥");

		eq7.setFont(new java.awt.Font("Adobe Garamond Pro", 0, 32)); // NOI18N
		eq7.setText("≥");

		PA9.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
		PA9.setText("point");

		javax.swing.GroupLayout GradeCriPanelLayout = new javax.swing.GroupLayout(GradeCriPanel);
		GradeCriPanel.setLayout(GradeCriPanelLayout);
		GradeCriPanelLayout.setHorizontalGroup(GradeCriPanelLayout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, GradeCriPanelLayout.createSequentialGroup()
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addGroup(GradeCriPanelLayout
								.createParallelGroup(
										javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(GradeCriPanelLayout.createSequentialGroup()
										.addComponent(Atxt2, javax.swing.GroupLayout.PREFERRED_SIZE, 40,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(20, 20, 20)
										.addComponent(eq1, javax.swing.GroupLayout.PREFERRED_SIZE, 40,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(20, 20, 20)
										.addComponent(aScore, javax.swing.GroupLayout.PREFERRED_SIZE, 90,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(20, 20, 20).addComponent(PA, javax.swing.GroupLayout.PREFERRED_SIZE, 92,
												javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGroup(GradeCriPanelLayout.createSequentialGroup().addComponent(BPtxt)
										.addGap(20, 20, 20)
										.addComponent(eq2, javax.swing.GroupLayout.PREFERRED_SIZE, 40,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(20, 20, 20)
										.addComponent(bpScore, javax.swing.GroupLayout.PREFERRED_SIZE, 90,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(20, 20, 20)
										.addComponent(PA3, javax.swing.GroupLayout.PREFERRED_SIZE, 92,
												javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGroup(GradeCriPanelLayout.createSequentialGroup().addComponent(Btxt)
										.addGap(30, 30, 30)
										.addComponent(eq3, javax.swing.GroupLayout.PREFERRED_SIZE, 40,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(20, 20, 20)
										.addComponent(bScore, javax.swing.GroupLayout.PREFERRED_SIZE, 90,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(20, 20, 20)
										.addComponent(PA4, javax.swing.GroupLayout.PREFERRED_SIZE, 92,
												javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGroup(GradeCriPanelLayout.createSequentialGroup()
										.addComponent(CPtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 54,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(6, 6, 6)
										.addComponent(eq4, javax.swing.GroupLayout.PREFERRED_SIZE, 40,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(20, 20, 20)
										.addComponent(cpScore, javax.swing.GroupLayout.PREFERRED_SIZE, 90,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(20, 20, 20)
										.addComponent(PA1, javax.swing.GroupLayout.PREFERRED_SIZE, 92,
												javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGroup(GradeCriPanelLayout.createSequentialGroup()
										.addComponent(Ctxt, javax.swing.GroupLayout.PREFERRED_SIZE, 40,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(20, 20, 20)
										.addComponent(eq5, javax.swing.GroupLayout.PREFERRED_SIZE, 40,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(20, 20, 20)
										.addComponent(cScore, javax.swing.GroupLayout.PREFERRED_SIZE, 90,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(20, 20, 20)
										.addComponent(PA6, javax.swing.GroupLayout.PREFERRED_SIZE, 92,
												javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGroup(GradeCriPanelLayout.createSequentialGroup().addComponent(DPtxt)
										.addGap(18, 18, 18)
										.addComponent(eq6, javax.swing.GroupLayout.PREFERRED_SIZE, 40,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(20, 20, 20)
										.addComponent(dpScore, javax.swing.GroupLayout.PREFERRED_SIZE, 90,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(20, 20, 20)
										.addComponent(PA5, javax.swing.GroupLayout.PREFERRED_SIZE, 92,
												javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGroup(GradeCriPanelLayout.createSequentialGroup()
										.addComponent(Dtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(30, 30, 30)
										.addComponent(eq7, javax.swing.GroupLayout.PREFERRED_SIZE, 40,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(20, 20, 20)
										.addComponent(dScore, javax.swing.GroupLayout.PREFERRED_SIZE, 90,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(20, 20, 20)
										.addComponent(PA8, javax.swing.GroupLayout.PREFERRED_SIZE, 92,
												javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGroup(GradeCriPanelLayout.createSequentialGroup().addComponent(Ftxt)
										.addGap(30, 30, 30)
										.addComponent(PA7, javax.swing.GroupLayout.PREFERRED_SIZE, 60,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(10, 10, 10)
										.addComponent(fScore, javax.swing.GroupLayout.PREFERRED_SIZE, 90,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(20, 20, 20).addComponent(PA9, javax.swing.GroupLayout.PREFERRED_SIZE,
												92, javax.swing.GroupLayout.PREFERRED_SIZE)))
						.addContainerGap()));
		GradeCriPanelLayout.setVerticalGroup(GradeCriPanelLayout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(GradeCriPanelLayout.createSequentialGroup().addContainerGap().addGroup(GradeCriPanelLayout
						.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(Atxt2)
						.addComponent(eq1)
						.addComponent(aScore, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGroup(GradeCriPanelLayout.createSequentialGroup().addGap(10, 10, 10).addComponent(PA)))
						.addGap(3, 3, 3)
						.addGroup(GradeCriPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(BPtxt).addComponent(eq2)
								.addComponent(bpScore, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGroup(GradeCriPanelLayout.createSequentialGroup().addGap(10, 10, 10)
										.addComponent(PA3)))
						.addGap(8, 8, 8)
						.addGroup(GradeCriPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(Btxt).addComponent(eq3)
								.addComponent(bScore, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGroup(GradeCriPanelLayout.createSequentialGroup().addGap(10, 10, 10)
										.addComponent(PA4)))
						.addGap(8, 8, 8)
						.addGroup(GradeCriPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(CPtxt).addComponent(eq4)
								.addComponent(cpScore, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGroup(GradeCriPanelLayout.createSequentialGroup().addGap(10, 10, 10)
										.addComponent(PA1)))
						.addGap(8, 8, 8)
						.addGroup(GradeCriPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(Ctxt).addComponent(eq5)
								.addComponent(cScore, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGroup(GradeCriPanelLayout.createSequentialGroup().addGap(10, 10, 10)
										.addComponent(PA6)))
						.addGap(3, 3, 3)
						.addGroup(GradeCriPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(DPtxt).addComponent(eq6)
								.addComponent(dpScore, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGroup(GradeCriPanelLayout.createSequentialGroup().addGap(10, 10, 10)
										.addComponent(PA5)))
						.addGap(8, 8, 8)
						.addGroup(GradeCriPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(Dtxt).addComponent(eq7)
								.addComponent(dScore, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGroup(GradeCriPanelLayout.createSequentialGroup().addGap(10, 10, 10)
										.addComponent(PA8)))
						.addGap(8, 8, 8)
						.addGroup(GradeCriPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(Ftxt)
								.addComponent(fScore, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGroup(GradeCriPanelLayout.createSequentialGroup().addGap(10, 10, 10)
										.addGroup(GradeCriPanelLayout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
												.addComponent(PA7).addComponent(PA9))))
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

		uploadTxt3.setFont(new java.awt.Font("AngsanaUPC", 0, 40)); // NOI18N
		uploadTxt3.setText("อัพโหลดอีเมลนักศึกษา");

		importBtt2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
		importBtt2.setText("import");
		importBtt2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				importBtt2ActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
		this.setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1052,
						javax.swing.GroupLayout.PREFERRED_SIZE)
				.addGroup(layout.createSequentialGroup().addGap(90, 90, 90).addGroup(layout
						.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(layout.createSequentialGroup().addComponent(loginNametxt1).addGap(18, 18, 18)
								.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addComponent(idSubjectInput, javax.swing.GroupLayout.PREFERRED_SIZE, 95,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 90,
												javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGap(55, 55, 55).addComponent(loginNametxt2).addGap(25, 25, 25)
								.addComponent(secInput1, javax.swing.GroupLayout.PREFERRED_SIZE, 95,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGroup(layout.createSequentialGroup().addComponent(subjectTxt1).addGap(37, 37, 37)
								.addComponent(subjectInput, javax.swing.GroupLayout.PREFERRED_SIZE, 410,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGroup(layout.createSequentialGroup().addComponent(subjectTxt).addGap(22, 22, 22)
								.addComponent(subInput, javax.swing.GroupLayout.PREFERRED_SIZE, 410,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGroup(layout.createSequentialGroup().addComponent(tearmTxt).addGap(32, 32, 32)
								.addComponent(yearInput, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(24, 24, 24).addComponent(loginNametxt5).addGap(13, 13, 13)
								.addComponent(yearInput1, javax.swing.GroupLayout.PREFERRED_SIZE, 120,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGroup(layout.createSequentialGroup().addComponent(uploadTxt2).addGap(22, 22, 22)
								.addComponent(criteriaBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 160,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGroup(layout.createSequentialGroup().addComponent(uploadTxt).addGap(54, 54, 54)
								.addComponent(importBtt2, javax.swing.GroupLayout.PREFERRED_SIZE, 160,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGroup(layout.createSequentialGroup().addComponent(uploadTxt3).addGap(69, 69, 69)
								.addComponent(importEmailBtt, javax.swing.GroupLayout.PREFERRED_SIZE, 160,
										javax.swing.GroupLayout.PREFERRED_SIZE)))
						.addGap(40, 40, 40).addComponent(GradeCriPanel, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
				.addGroup(layout.createSequentialGroup().addGap(390, 390, 390).addComponent(uploadTxt1)
						.addGap(27, 27, 27).addComponent(addBtt, javax.swing.GroupLayout.PREFERRED_SIZE, 160,
								javax.swing.GroupLayout.PREFERRED_SIZE)));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout
				.createSequentialGroup()
				.addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
						javax.swing.GroupLayout.PREFERRED_SIZE)
				.addGap(30, 30, 30)
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout
						.createSequentialGroup().addGap(10, 10, 10)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(loginNametxt1).addComponent(loginNametxt2)
								.addGroup(layout.createSequentialGroup().addGap(10, 10, 10).addGroup(layout
										.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addComponent(idSubjectInput, javax.swing.GroupLayout.PREFERRED_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGroup(layout.createSequentialGroup().addGap(30, 30, 30).addComponent(
												jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.PREFERRED_SIZE))
										.addComponent(secInput1, javax.swing.GroupLayout.PREFERRED_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.PREFERRED_SIZE))))
						.addGap(13, 13, 13)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(subjectTxt1)
								.addGroup(layout.createSequentialGroup().addGap(10, 10, 10).addComponent(subjectInput,
										javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.PREFERRED_SIZE)))
						.addGap(23, 23, 23)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(subjectTxt).addComponent(subInput, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(39, 39, 39)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(tearmTxt).addComponent(loginNametxt5)
								.addGroup(layout.createSequentialGroup().addGap(10, 10, 10)
										.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
												.addComponent(yearInput, javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(yearInput1, javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE))))
						.addGap(13, 13, 13)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(uploadTxt2)
								.addGroup(layout.createSequentialGroup().addGap(10, 10, 10).addComponent(criteriaBtn)))
						.addGap(13, 13, 13)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(uploadTxt)
								.addGroup(layout.createSequentialGroup().addGap(10, 10, 10).addComponent(importBtt2)))
						.addGap(13, 13, 13)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(uploadTxt3)
								.addGroup(layout.createSequentialGroup().addGap(10, 10, 10)
										.addComponent(importEmailBtt))))
						.addComponent(GradeCriPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 430,
								javax.swing.GroupLayout.PREFERRED_SIZE))
				.addGap(13, 13, 13)
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(uploadTxt1)
						.addGroup(layout.createSequentialGroup().addGap(10, 10, 10).addComponent(addBtt)))));
	}// </editor-fold>

	private void addBttActionPerformed(java.awt.event.ActionEvent evt) { // add subject
		if (ecp != null) {
			if (ecp.isSave()) {
				ec = ecp.getExamCri();
			}
		}
		if (ec == null) {
			JOptionPane.showMessageDialog(frame, "ยังไม่ได้กำหนดสัดส่วนคะแนน", "ERROR", JOptionPane.ERROR_MESSAGE);
		} else if (el == null) {
			JOptionPane.showMessageDialog(frame, "ยังไม่ได้อัพโหลด email", "ERROR", JOptionPane.ERROR_MESSAGE);
		} else if (cl == null) {
			JOptionPane.showMessageDialog(frame, "ยังไม่ได้อัพโหลดรายชื่อนักศึกษา", "ERROR", JOptionPane.ERROR_MESSAGE);
		} else {
			String code = idSubjectInput.getText();
			String section = secInput1.getText();
			String nameThai = subjectInput.getText();
			String nameEng = subInput.getText();
			String a = aScore.getText();
			String bp = bpScore.getText();
			String b = bScore.getText();
			String cp = cpScore.getText();
			String c = cScore.getText();
			String dp = dpScore.getText();
			String d = dScore.getText();
			String semester = (String) yearInput.getSelectedItem();
			String year = (String) yearInput1.getSelectedItem();
			if (code.equals("code") || section.equals("section") || nameThai.equals("ใส่ชื่อวิชา")
					|| nameEng.equals("input name in english") || a.equals("") || bp.equals("") || b.equals("")
					|| cp.equals("") || c.equals("") || dp.equals("") || d.equals("")) {
				JOptionPane.showMessageDialog(frame, "ยังไม่ใส่ข้อมูลไม่ครบ", "ERROR", JOptionPane.ERROR_MESSAGE);
			} else {
				if (SubjectMgnt.addEmailToClassList(el, cl)) {
					try {
						int A = Integer.parseInt(a.trim());
						int Bp = Integer.parseInt(bp.trim());
						int B = Integer.parseInt(b.trim());
						int Cp = Integer.parseInt(cp.trim());
						int C = Integer.parseInt(c.trim());
						int Dp = Integer.parseInt(dp.trim());
						int D = Integer.parseInt(d.trim());
						gc = new GradingCriteria(0, A, Bp, B, Cp, C, Dp, D);
						Subject sub = new Subject(0, nameThai, nameEng, code, section, us.getUserName(), semester, year,
								cl, null, gc, ec, null);
						if (SubjectMgnt.addSubject(sub)) {
							frame.dispose();
							JOptionPane.showMessageDialog(frame, "สร้างวิชาเรียนสำเร็จ\nกำลังโหลดหน้าเลือกวิชาใหม่");
							old.dispose();
							new SelectSubPage(us);
						}
					} catch (Exception e) {
						JOptionPane.showMessageDialog(frame, "ใส่เกณฑ์คะแนนผิด", "ERROR", JOptionPane.ERROR_MESSAGE);
					}
				}
			}
		}
	}

	private void importEmailBttActionPerformed(java.awt.event.ActionEvent evt) { // import Email
		EmailList el = FileMgnt.readEmailExcelFile();
		if (el != null) {
			this.el = el;
			JOptionPane.showMessageDialog(frame, "อัพโหลดเสร็จสิ้น");
		}
	}

	private void importBtt2ActionPerformed(java.awt.event.ActionEvent evt) { // import Class List
		ClassList cl = FileMgnt.readClassListFile();
		if (cl != null) {
			this.cl = cl;
			JOptionPane.showMessageDialog(frame, "อัพโหลดเสร็จสิ้น");
		}
	}

	private void criteriaBtnActionPerformed(java.awt.event.ActionEvent evt) { // edit Exam Criteria
		if (ecp == null) {
			ecp = new ExamCriteriaPage();
		} else {
			ecp = new ExamCriteriaPage(ecp.getExamCri(), false);
		}
	}

	private void backBttActionPerformed(java.awt.event.ActionEvent evt) { // back
		frame.dispose();
	}

	// Variables declaration - do not modify
	private javax.swing.JLabel Atxt2;
	private javax.swing.JLabel BPtxt;
	private javax.swing.JLabel Btxt;
	private javax.swing.JLabel CPtxt;
	private javax.swing.JLabel Ctxt;
	private javax.swing.JLabel DPtxt;
	private javax.swing.JLabel Dtxt;
	private javax.swing.JLabel Ftxt;
	private javax.swing.JPanel GradeCriPanel;
	private javax.swing.JLabel PA;
	private javax.swing.JLabel PA1;
	private javax.swing.JLabel PA2;
	private javax.swing.JLabel PA3;
	private javax.swing.JLabel PA4;
	private javax.swing.JLabel PA5;
	private javax.swing.JLabel PA6;
	private javax.swing.JLabel PA7;
	private javax.swing.JLabel PA8;
	private javax.swing.JLabel PA9;
	private javax.swing.JTextField aScore;
	private javax.swing.JButton addBtt;
	private javax.swing.JTextField bScore;
	private javax.swing.JButton backBtt;
	private javax.swing.JTextField bpScore;
	private javax.swing.JTextField cScore;
	private javax.swing.JTextField cpScore;
	private javax.swing.JButton criteriaBtn;
	private javax.swing.JTextField dScore;
	private javax.swing.JTextField dpScore;
	private javax.swing.JLabel eq1;
	private javax.swing.JLabel eq2;
	private javax.swing.JLabel eq3;
	private javax.swing.JLabel eq4;
	private javax.swing.JLabel eq5;
	private javax.swing.JLabel eq6;
	private javax.swing.JLabel eq7;
	private javax.swing.JTextField fScore;
	private javax.swing.JTextField idSubjectInput;
	private javax.swing.JButton importBtt2;
	private javax.swing.JButton importEmailBtt;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JSeparator jSeparator1;
	private javax.swing.JSeparator lineID;
	private javax.swing.JLabel loginNametxt;
	private javax.swing.JLabel loginNametxt1;
	private javax.swing.JLabel loginNametxt2;
	private javax.swing.JLabel loginNametxt5;
	private javax.swing.JLabel logoTU1;
	private javax.swing.JLabel nameSurname;
	private javax.swing.JTextField secInput1;
	private javax.swing.JTextField subInput;
	private javax.swing.JTextField subjectInput;
	private javax.swing.JLabel subjectTxt;
	private javax.swing.JLabel subjectTxt1;
	private javax.swing.JLabel tearmTxt;
	private javax.swing.JLabel uploadTxt;
	private javax.swing.JLabel uploadTxt1;
	private javax.swing.JLabel uploadTxt2;
	private javax.swing.JLabel uploadTxt3;
	private javax.swing.JComboBox<String> yearInput;
	private javax.swing.JComboBox<String> yearInput1;
	// End of variables declaration
}
