package View;

import java.awt.Font;
import java.awt.event.MouseEvent;
import java.util.HashMap;

import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import Controller.SubjectMgnt;
import Model.Student;
import Model.StudentResult;
import Model.Subject;

public class FillScorePage extends javax.swing.JFrame {

	private Subject sub;
	private HashMap<String, String> listName;
	public boolean haveChange;

	public FillScorePage(Subject sub) {
		haveChange = false;
		listName = new HashMap<>();
		for (Student st : sub.getClassList().getClassList()) {
			listName.put(st.getId(), st.getName());
		}
		this.sub = sub;
		initComponents();
		String str = "-------สัดส่วนคะแนน-------\n";
		str += " กลางภาคเต็ม               " + sub.getExamCri().getMidFull() + "\n";
		str += " ปลายภาคเต็ม               " + sub.getExamCri().getFinalFull() + "\n";
		if (sub.getExamCri().getScoreAmount() > 0) {
			for (int i = 0; i < sub.getExamCri().getScoreAmount(); i++) {
				str += " คะแนน" + (i + 1) + "                         " + sub.getExamCri().getScore()[i] + "\n";
			}
		}
		JOptionPane.showMessageDialog(this, str);
		mid.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
		finalS.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
		table.setFont(new Font("", 1, 14));
		table.setRowHeight(25);
		DefaultTableModel model = (DefaultTableModel) table.getModel();
		for (StudentResult sr : sub.getExResult().getList()) {
			model.addRow(new Object[0]);
			int row = model.getRowCount() - 1;
			model.setValueAt(sr.getIDStudent(), row, 0);
			model.setValueAt(listName.get(sr.getIDStudent()), row, 1);
		}
		setTitle("กรอกคะแนนของ นศ วิชา" + sub.getNameEng());
		this.setSize(921, 735);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
		this.setVisible(true);
	}

	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		jPanel1 = new javax.swing.JPanel();
		saveBtn = new javax.swing.JButton();
		tableScroll = new javax.swing.JScrollPane();
		table = new javax.swing.JTable();
		jPanel2 = new javax.swing.JPanel();
		q = new JTextField[10];
		for (int i = 0; i < q.length; i++) {
			q[i] = new JTextField();
			q[i].setEditable(false);
			q[i].setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
		}
		backBtn = new javax.swing.JButton();
		finallb = new javax.swing.JLabel();
		jPanel3 = new javax.swing.JPanel();
		mid = new javax.swing.JTextField();
		finalS = new javax.swing.JTextField();
		jLabel7 = new javax.swing.JLabel();
		idShow = new javax.swing.JLabel();
		namelb = new javax.swing.JLabel();
		nameShow = new javax.swing.JLabel();
		lb6 = new javax.swing.JLabel();
		midlb = new javax.swing.JLabel();
		TestScore = new javax.swing.JLabel();
		score = new javax.swing.JLabel();
		lb10 = new javax.swing.JLabel();
		lb1 = new javax.swing.JLabel();
		lb5 = new javax.swing.JLabel();

		jPanel1.setBackground(new java.awt.Color(255, 233, 114));

		saveBtn.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
		saveBtn.setText("Save");
		saveBtn.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				saveBtnActionPerformed(evt);
			}
		});

		table.setModel(new javax.swing.table.DefaultTableModel(new Object[][] {

		}, new String[] { "รหัสนักศึกษา", "ชื่อ" }) {
			Class[] types = new Class[] { java.lang.String.class, java.lang.String.class };
			boolean[] canEdit = new boolean[] { false, false };

			public Class getColumnClass(int columnIndex) {
				return types[columnIndex];
			}

			public boolean isCellEditable(int rowIndex, int columnIndex) {
				return canEdit[columnIndex];
			}
		});
		table.addMouseListener(new java.awt.event.MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				tableMousePressed(e);
			}
		});
		tableScroll.setViewportView(table);

		jPanel2.setBackground(new java.awt.Color(255, 223, 114));
		jPanel2.setLayout(new java.awt.GridLayout(2, 12, 10, 10));
		for (int i = 0; i < q.length; i++) {
			jPanel2.add(q[i]);
		}

		backBtn.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
		backBtn.setText("Back");
		backBtn.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				backBtnActionPerformed(evt);
			}
		});

		finallb.setFont(new java.awt.Font("Tahoma", 0, 28)); // NOI18N
		finallb.setText("ปลายภาค");

		jPanel3.setBackground(new java.awt.Color(255, 223, 114));
		jPanel3.setLayout(new java.awt.GridLayout(2, 0, 10, 10));
		jPanel3.add(mid);
		jPanel3.add(finalS);

		jLabel7.setFont(new java.awt.Font("Tahoma", 0, 28)); // NOI18N
		jLabel7.setText("รหัสนักศึกษา");

		idShow.setFont(new java.awt.Font("Tahoma", 0, 28)); // NOI18N
		idShow.setText("XXXXXXXXXX");

		namelb.setFont(new java.awt.Font("Tahoma", 0, 28)); // NOI18N
		namelb.setText("ชื่อ");

		nameShow.setFont(new java.awt.Font("Tahoma", 0, 28)); // NOI18N
		nameShow.setText("XXXXXX XXXXX");

		lb6.setFont(new java.awt.Font("Tahoma", 0, 28)); // NOI18N
		lb6.setText("6");

		midlb.setFont(new java.awt.Font("Tahoma", 0, 28)); // NOI18N
		midlb.setText("กลางภาค");

		TestScore.setFont(new java.awt.Font("Tahoma", 0, 28)); // NOI18N
		TestScore.setText("คะแนนสอบ");

		score.setFont(new java.awt.Font("Tahoma", 0, 28)); // NOI18N
		score.setText("คะแนนเก็บ");

		lb10.setFont(new java.awt.Font("Tahoma", 0, 28)); // NOI18N
		lb10.setText("10");

		lb1.setFont(new java.awt.Font("Tahoma", 0, 28)); // NOI18N
		lb1.setText("1");

		lb5.setFont(new java.awt.Font("Tahoma", 0, 28)); // NOI18N
		lb5.setText("5");

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout
						.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(jPanel1Layout.createSequentialGroup().addGap(20, 20, 20).addComponent(tableScroll,
								javax.swing.GroupLayout.PREFERRED_SIZE, 880, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGroup(jPanel1Layout.createSequentialGroup().addGap(230, 230, 230)
								.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
										.addComponent(namelb).addComponent(jLabel7))
								.addGap(35, 35, 35)
								.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addComponent(idShow).addComponent(nameShow))))
						.addContainerGap(21, Short.MAX_VALUE))
				.addGroup(jPanel1Layout.createSequentialGroup().addGap(163, 163, 163).addComponent(TestScore)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
								javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(score).addGap(211, 211, 211))
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
						jPanel1Layout.createSequentialGroup()
								.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
										.addGroup(jPanel1Layout.createSequentialGroup()
												.addComponent(saveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 110,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addGap(18, 18, 18).addComponent(backBtn,
														javax.swing.GroupLayout.PREFERRED_SIZE, 110,
														javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
												.addComponent(midlb, javax.swing.GroupLayout.Alignment.TRAILING)
												.addComponent(finallb, javax.swing.GroupLayout.Alignment.TRAILING))
												.addGap(27, 27, 27)
												.addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 110,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addGap(73, 73, 73)
												.addGroup(jPanel1Layout
														.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
														.addComponent(lb1, javax.swing.GroupLayout.Alignment.TRAILING)
														.addComponent(lb6, javax.swing.GroupLayout.Alignment.TRAILING))
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
												.addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 380,
														javax.swing.GroupLayout.PREFERRED_SIZE)))
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addComponent(lb5).addComponent(lb10))
								.addGap(51, 51, 51)));
		jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup().addGap(20, 20, 20)
						.addComponent(tableScroll, javax.swing.GroupLayout.PREFERRED_SIZE, 360,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(18, 18, 18)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(namelb).addComponent(nameShow, javax.swing.GroupLayout.PREFERRED_SIZE, 30,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel7).addComponent(idShow))
						.addGap(1, 1, 1)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(TestScore).addComponent(score))
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(jPanel1Layout.createSequentialGroup().addGap(19, 19, 19).addComponent(lb5)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
										.addComponent(lb10))
								.addGroup(jPanel1Layout.createSequentialGroup()
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(jPanel1Layout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
												.addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 100,
														Short.MAX_VALUE)
												.addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
								.addGroup(jPanel1Layout.createSequentialGroup()
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
										.addComponent(midlb)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
										.addComponent(finallb))
								.addGroup(jPanel1Layout.createSequentialGroup()
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
										.addComponent(lb1).addGap(18, 18, 18).addComponent(lb6)))
						.addGap(18, 18, 18)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(saveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
				javax.swing.GroupLayout.PREFERRED_SIZE));

		pack();
	}// </editor-fold>

	private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {
		if (!idShow.getText().equals("XXXXXXXXXX")) {
			try {
				StudentResult sr = this.sub.getExResult().get(this.table.getSelectedRow());
				double finals = -2;
				if (!finalS.getText().trim().equals("-")) {
					finals = Double.parseDouble(finalS.getText().trim());
				}
				double mids = -2;
				if (!mid.getText().trim().equals("-")) {
					mids = Double.parseDouble(mid.getText().trim());
				}
				double[] score = null;
				if (sr.getScoreAmount() > 0) {
					score = new double[sr.getScoreAmount()];
					for (int i = 0; i < sr.getScoreAmount(); i++) {
						if (!q[i].getText().trim().equals("-")) {
							score[i] = Double.parseDouble(q[i].getText().trim());
						} else {
							score[i] = -2;
						}
					}
				}
				int er = 0;
				if (finals > sub.getExamCri().getFinalFull()) {
					JOptionPane.showMessageDialog(this, "คะแนนเต็ม " + sub.getExamCri().getFinalFull(), "ERROR",
							JOptionPane.ERROR_MESSAGE);
					er++;
				} else if (mids > sub.getExamCri().getMidFull()) {
					JOptionPane.showMessageDialog(this, "คะแนนเต็ม " + sub.getExamCri().getMidFull(), "ERROR",
							JOptionPane.ERROR_MESSAGE);
					er++;
				} else {
					if (sr.getScoreAmount() > 0) {
						for (int i = 0; i < sr.getScoreAmount(); i++) {
							if (score[i] > sub.getExamCri().getScore()[i]) {
								JOptionPane.showMessageDialog(this, "คะแนนเต็ม " + sub.getExamCri().getScore()[i],
										"ERROR", JOptionPane.ERROR_MESSAGE);
								er++;
								break;
							}
						}
					}
				}
				if (er == 0) {
					sr.setFinalScore(finals);
					sr.setMidScore(mids);
					sr.setScore(score);
					JOptionPane.showMessageDialog(this, "บันทึกผลแล้วแต่จะมีผลหลังจากกดปุ่ม back ไปแล้ว");
					this.haveChange = true;
				}
			} catch (NumberFormatException er) {
				JOptionPane.showMessageDialog(this, "ต้องใส่ตัวเลขเท่านั้น", "ERROR", JOptionPane.ERROR_MESSAGE);
			}
		} else {
			JOptionPane.showMessageDialog(this, "ยังไม่ได้เลือกคนที่จะกรอกคะแนน", "ERROR", JOptionPane.ERROR_MESSAGE);
		}
	}

	private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {
		if (haveChange) {
			if (SubjectMgnt.editExamResult(sub.getExResult())) {
				JOptionPane.showMessageDialog(this, "บันทึกผลทั้งหมดลงฐานข้อมูลเรียบร้อย");
			}
		}
		this.dispose();
	}

	private void tableMousePressed(java.awt.event.MouseEvent evt) {
		StudentResult sr = sub.getExResult().get(table.getSelectedRow());
		this.nameShow.setText(listName.get(sr.getIDStudent()));
		this.idShow.setText(sr.getIDStudent());
		double mids = sr.getMidScore();
		double finals = sr.getFinalScore();
		if (mids == -2) {
			this.mid.setText("-");
		} else {
			this.mid.setText(mids + "");
		}
		if (finals == -2) {
			this.finalS.setText("-");
		} else {
			this.finalS.setText(finals + "");
		}
		if (sr.getScoreAmount() > 0) {
			for (int i = 0; i < sr.getScoreAmount(); i++) {
				q[i].setEditable(true);
				if (sr.getScoreByIndex(i) == -2) {
					q[i].setText("-");
				} else {
					q[i].setText(sr.getScoreByIndex(i) + "");
				}
			}
		}
	}

	// Variables declaration - do not modify
	private javax.swing.JLabel TestScore;
	private javax.swing.JButton backBtn;
	private javax.swing.JLabel finallb;
	private javax.swing.JLabel idShow;
	private javax.swing.JLabel jLabel7;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JPanel jPanel2;
	private javax.swing.JPanel jPanel3;
	private javax.swing.JTextField finalS;
	private javax.swing.JLabel lb1;
	private javax.swing.JLabel lb10;
	private javax.swing.JLabel lb5;
	private javax.swing.JLabel lb6;
	private javax.swing.JTextField mid;
	private javax.swing.JLabel midlb;
	private javax.swing.JLabel nameShow;
	private javax.swing.JLabel namelb;
	private JTextField[] q;
	private javax.swing.JButton saveBtn;
	private javax.swing.JLabel score;
	private javax.swing.JTable table;
	private javax.swing.JScrollPane tableScroll;
	// End of variables declaration
}
