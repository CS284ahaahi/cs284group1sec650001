package View;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import Controller.FileMgnt;
import Controller.SubjectMgnt;
import Model.StudentResult;
import Model.Subject;
import Model.User;

public class SubjectMenuPage extends javax.swing.JPanel {

	private JFrame frame;
	private Subject sub;
	private User us;
	private boolean isGrading;

	public SubjectMenuPage(Subject sub, User us) {
		initComponents();
		isGrading = false;
		this.sub = sub;
		this.us = us;
		this.nameLb.setText(us.getFirstName() + " " + us.getLastName());
		this.subjectNamelb.setText(sub.getNameEng());
		this.sectionShowlb.setText(sub.getSection());
		this.termShowlb.setText(sub.getSemester());
		this.yearShowlb.setText(sub.getYear());
		frame = new JFrame("CS284 Project");
		frame.add(this);
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null); // center on screen
		frame.setVisible(true);
	}

	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		HeadPanel = new javax.swing.JPanel();
		jPanel3 = new javax.swing.JPanel();
		logoTU2 = new javax.swing.JLabel();
		loginLb = new javax.swing.JLabel();
		nameLb = new javax.swing.JLabel();
		subjectlb = new javax.swing.JLabel();
		subjectNamelb = new javax.swing.JLabel();
		yearShowlb = new javax.swing.JLabel();
		termShowlb = new javax.swing.JLabel();
		termlb = new javax.swing.JLabel();
		sectionShowlb = new javax.swing.JLabel();
		sectionlb = new javax.swing.JLabel();
		yearlb = new javax.swing.JLabel();
		backBtn = new javax.swing.JButton();
		comingBtn = new javax.swing.JButton();
		FillBtn = new javax.swing.JButton();
		exportBtn = new javax.swing.JButton();
		GradingBtn = new javax.swing.JButton();
		listStudentBtn = new javax.swing.JButton();
		editSubjectBtn = new javax.swing.JButton();

		setBackground(new java.awt.Color(255, 233, 114));

		HeadPanel.setBackground(new java.awt.Color(255, 233, 114));

		jPanel3.setBackground(new java.awt.Color(255, 153, 0));

		logoTU2.setIcon(new javax.swing.ImageIcon(getClass().getResource("Logo-TU.png"))); // NOI18N

		loginLb.setFont(new java.awt.Font("Century Gothic", 0, 33)); // NOI18N
		loginLb.setText("Profressor : ");

		nameLb.setFont(new java.awt.Font("Century Gothic", 0, 33)); // NOI18N
		nameLb.setText("NAME + SURNAME");

		subjectlb.setFont(new java.awt.Font("Century Gothic", 0, 33)); // NOI18N
		subjectlb.setText("Subject : ");

		subjectNamelb.setFont(new java.awt.Font("Century Gothic", 0, 33)); // NOI18N
		subjectNamelb.setText("NAME");

		yearShowlb.setFont(new java.awt.Font("Century Gothic", 0, 33)); // NOI18N
		yearShowlb.setText("xxxx");

		termShowlb.setFont(new java.awt.Font("Century Gothic", 0, 33)); // NOI18N
		termShowlb.setText("x");

		termlb.setFont(new java.awt.Font("Century Gothic", 0, 33)); // NOI18N
		termlb.setText("Term : ");

		sectionShowlb.setFont(new java.awt.Font("Century Gothic", 0, 33)); // NOI18N
		sectionShowlb.setText("xxxxxx");

		sectionlb.setFont(new java.awt.Font("Century Gothic", 0, 33)); // NOI18N
		sectionlb.setText("Section : ");

		yearlb.setFont(new java.awt.Font("Century Gothic", 0, 33)); // NOI18N
		yearlb.setText("Year : ");

		backBtn.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
		backBtn.setText("back");
		backBtn.setBackground(new Color(204, 204, 204));
		backBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				backBtnActionPerformed(e);
			}
		});

		javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
		jPanel3.setLayout(jPanel3Layout);
		jPanel3Layout.setHorizontalGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel3Layout.createSequentialGroup().addContainerGap().addComponent(logoTU2)
						.addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(jPanel3Layout.createSequentialGroup().addGap(34, 34, 34).addComponent(loginLb)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
										.addComponent(nameLb)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
												javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 121,
												javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGroup(
										jPanel3Layout.createSequentialGroup().addGap(52, 52, 52)
												.addGroup(jPanel3Layout
														.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
														.addComponent(subjectlb).addComponent(sectionlb))
												.addGap(32, 32, 32)
												.addGroup(jPanel3Layout
														.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
														.addComponent(subjectNamelb)
														.addGroup(jPanel3Layout.createSequentialGroup()
																.addComponent(sectionShowlb).addGap(35, 35, 35)
																.addComponent(termlb)
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																.addComponent(termShowlb).addGap(41, 41, 41)
																.addComponent(yearlb)
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
																.addComponent(yearShowlb)))
												.addGap(0, 345, Short.MAX_VALUE)))
						.addContainerGap()));
		jPanel3Layout.setVerticalGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
						jPanel3Layout.createSequentialGroup().addGap(42, 42, 42)
								.addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
										.addComponent(loginLb).addComponent(nameLb))
								.addGap(18, 18, 18)
								.addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
										.addComponent(subjectlb).addComponent(subjectNamelb))
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
								.addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
										.addComponent(yearShowlb).addComponent(termShowlb).addComponent(termlb)
										.addComponent(sectionShowlb).addComponent(sectionlb).addComponent(yearlb))
								.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
						jPanel3Layout.createSequentialGroup()
								.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addComponent(backBtn).addComponent(logoTU2))
								.addContainerGap()));

		javax.swing.GroupLayout HeadPanelLayout = new javax.swing.GroupLayout(HeadPanel);
		HeadPanel.setLayout(HeadPanelLayout);
		HeadPanelLayout.setHorizontalGroup(
				HeadPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jPanel3,
						javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
						javax.swing.GroupLayout.PREFERRED_SIZE));
		HeadPanelLayout.setVerticalGroup(
				HeadPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jPanel3,
						javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE));

		comingBtn.setBackground(new java.awt.Color(255, 153, 0));
		comingBtn.setFont(new java.awt.Font("Century Gothic", 0, 30)); // NOI18N
		comingBtn.setText("Coming soon");
		comingBtn.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				comingBtnActionPerformed(evt);
			}
		});

		FillBtn.setBackground(new java.awt.Color(255, 153, 0));
		FillBtn.setFont(new java.awt.Font("Century Gothic", 0, 30)); // NOI18N
		FillBtn.setText("Fill Score");
		FillBtn.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				FillBtnActionPerformed(evt);
			}
		});

		exportBtn.setBackground(new java.awt.Color(255, 153, 0));
		exportBtn.setFont(new java.awt.Font("Century Gothic", 0, 30)); // NOI18N
		exportBtn.setText("Export file");
		exportBtn.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				exportBtnActionPerformed(evt);
			}
		});

		GradingBtn.setBackground(new java.awt.Color(255, 153, 0));
		GradingBtn.setFont(new java.awt.Font("Century Gothic", 0, 30)); // NOI18N
		GradingBtn.setText("Grading");
		GradingBtn.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				GradingBtnActionPerformed(evt);
			}
		});

		listStudentBtn.setBackground(new java.awt.Color(255, 153, 0));
		listStudentBtn.setFont(new java.awt.Font("Century Gothic", 0, 30)); // NOI18N
		listStudentBtn.setText("List student");
		listStudentBtn.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				listStudentBtnActionPerformed(evt);
			}
		});

		editSubjectBtn.setBackground(new java.awt.Color(255, 153, 0));
		editSubjectBtn.setFont(new java.awt.Font("Century Gothic", 0, 30)); // NOI18N
		editSubjectBtn.setText("Edit Subject");
		editSubjectBtn.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				editSubjectBtnActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
		this.setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup().addGap(82, 82, 82)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
								.addComponent(FillBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
								.addComponent(editSubjectBtn, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
						.addGap(146, 146, 146)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(GradingBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 280,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(listStudentBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 280,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(137, 137, 137)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
								.addComponent(exportBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 280,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(comingBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 280,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
				.addGroup(layout.createSequentialGroup()
						.addComponent(HeadPanel, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(0, 0, Short.MAX_VALUE)));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup()
						.addComponent(HeadPanel, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(79, 79, 79)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(FillBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 120,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(comingBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 120,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(listStudentBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 120,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 87, Short.MAX_VALUE)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(exportBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 120,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(GradingBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 120,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(editSubjectBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 120,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(55, 55, 55)));
	}// </editor-fold>

	private void comingBtnActionPerformed(ActionEvent evt) {
		JOptionPane.showMessageDialog(frame, "Coming Soon");
	}

	private void GradingBtnActionPerformed(ActionEvent evt) {
		gradingFn();
	}

	private void backBtnActionPerformed(ActionEvent e) {
		JOptionPane.showMessageDialog(this, "HomePage Coming Soon / goto Login");
		this.frame.dispose();
		LoginPage lp = new LoginPage();
	}

	private void FillBtnActionPerformed(ActionEvent evt) {
		JOptionPane.showMessageDialog(frame, "Coming Soon");
	}

	private void listStudentBtnActionPerformed(ActionEvent evt) {
		JOptionPane.showMessageDialog(frame, "Coming Soon");
	}

	private void editSubjectBtnActionPerformed(ActionEvent evt) {
		new EditSubjectPage(sub, us);
	}

	private void validateFn() {
		ArrayList<StudentResult> str = SubjectMgnt.checkGrading(sub.getId());
		if (str != null) {
			String strList = "";
			for (StudentResult sr : str) {
				strList += sr.getID() + "\n";
			}
			strList += "ยังไม่มีคะแนนในบางส่วน โปรดเช็คการให้คะแนน";
			JOptionPane.showMessageDialog(frame, strList, "Warning!!", JOptionPane.ERROR_MESSAGE);
		} else {
			JOptionPane.showMessageDialog(frame, "ตรวจสอบเสร็จสิ้น ท่านสามารถ export ได้แล้วขณะนี้");
			this.isGrading = true;
		}
	}

	private void gradingFn() {
		JOptionPane.showMessageDialog(frame,
				"ตอนนี้ระบบยังไม่มีระบบการตัดเกรด สามารถทำได้แค่ตรวจสอบความถูกต้องของคะแนนเท่านั้น");
		validateFn();
	}

	private void exportBtnActionPerformed(ActionEvent evt) {
		if (this.isGrading) {
			if (FileMgnt.exportGrade(sub.getExResult())) {
				JOptionPane.showMessageDialog(null, "Export เสร็จสิ้น");
			}
		} else {
			int check = JOptionPane.showConfirmDialog(frame,
					"ท่านยังไม่ได้ตรวจสอบความถูกต้องของคะแนน/ตัดเกรด  ต้องการ ตรวจสอบ/ตัดเกรด หรือไม่", "Message",
					JOptionPane.YES_NO_OPTION);
			if (check == JOptionPane.YES_OPTION) {
				gradingFn();
			}
		}
	}

	// Variables declaration - do not modify
	private javax.swing.JButton FillBtn;
	private javax.swing.JButton GradingBtn;
	private javax.swing.JPanel HeadPanel;
	private javax.swing.JButton backBtn;
	private javax.swing.JButton comingBtn;
	private javax.swing.JButton editSubjectBtn;
	private javax.swing.JButton exportBtn;
	private javax.swing.JPanel jPanel3;
	private javax.swing.JButton listStudentBtn;
	private javax.swing.JLabel loginLb;
	private javax.swing.JLabel logoTU2;
	private javax.swing.JLabel nameLb;
	private javax.swing.JLabel sectionShowlb;
	private javax.swing.JLabel sectionlb;
	private javax.swing.JLabel subjectNamelb;
	private javax.swing.JLabel subjectlb;
	private javax.swing.JLabel termShowlb;
	private javax.swing.JLabel termlb;
	private javax.swing.JLabel yearShowlb;
	private javax.swing.JLabel yearlb;
	// End of variables declaration
}
