package View;

import java.awt.Cursor;
import java.awt.Font;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;
import Controller.SubjectMgnt;
import Model.Subject;
import Model.User;

public class SelectSubPage extends javax.swing.JPanel {

	private User us;
	private JFrame frame;
	private ArrayList<Subject> mySubList;
	private Cursor waitCursor = new Cursor(Cursor.WAIT_CURSOR);
	private Cursor defaultCursor = new Cursor(Cursor.DEFAULT_CURSOR);

	public SelectSubPage(User us) {
		this.frame = new JFrame();
		frame.setCursor(waitCursor);
		this.us = us;
		initComponents();
		this.nameSurname.setText(us.getFirstName() + " " + us.getLastName());
		table.setFont(new Font("", 1, 14));
		table.setRowHeight(25);
		DefaultTableModel model = (DefaultTableModel) table.getModel();
		this.mySubList = SubjectMgnt.getMySubject(us);
		for (Subject st : mySubList) {
			model.addRow(new Object[0]);
			int row = model.getRowCount() - 1;
			model.setValueAt(st.getCode(), row, 0);
			model.setValueAt(st.getNameEng(), row, 1);
			model.setValueAt(st.getSection(), row, 2);
			model.setValueAt(st.getSemester(), row, 3);
			model.setValueAt(st.getYear(), row, 4);
		}
		this.frame.add(this);
		frame.setCursor(defaultCursor);
		this.frame.setTitle("เลือกวิชา");
		this.frame.setSize(984, 715);
		this.frame.setResizable(false);
		this.frame.setLocationRelativeTo(null);
		this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.frame.setVisible(true);

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
		logoutBtn = new javax.swing.JButton();
		backBtn = new javax.swing.JButton();
		jScrollPane1 = new javax.swing.JScrollPane();
		table = new javax.swing.JTable();
		newBtn = new javax.swing.JButton();

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

		logoutBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
		logoutBtn.setForeground(new java.awt.Color(51, 51, 51));
		logoutBtn.setText("logout");
		logoutBtn.setBorder(null);
		logoutBtn.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				logoutBtnMouseClicked(evt);
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
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 267, Short.MAX_VALUE)
						.addComponent(logoutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 59,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap()));
		jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
						jPanel1Layout.createSequentialGroup().addContainerGap().addComponent(logoutBtn)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(loginNametxt)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(nameSurname).addContainerGap(47, Short.MAX_VALUE))
				.addComponent(logoTU1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE,
						javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));

		backBtn.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
		backBtn.setText("Back");
		backBtn.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				backBtnActionPerformed(evt);
			}
		});

		table.setModel(new javax.swing.table.DefaultTableModel(new Object[][] {},
				new String[] { "รหัสวิชา", "ชื่อ", "เซคชั่น", "เทอม", "ปี" }) {
			Class[] types = new Class[] { java.lang.String.class, java.lang.String.class, java.lang.String.class,
					java.lang.String.class, java.lang.String.class };
			boolean[] canEdit = new boolean[] { false, false, false, false, false };

			public Class getColumnClass(int columnIndex) {
				return types[columnIndex];
			}

			public boolean isCellEditable(int rowIndex, int columnIndex) {
				return canEdit[columnIndex];
			}
		});
		table.setColumnSelectionAllowed(true);
		table.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mousePressed(java.awt.event.MouseEvent evt) {
				tableMousePressed(evt);
			}
		});
		jScrollPane1.setViewportView(table);
		table.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

		newBtn.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
		newBtn.setText("New");
		newBtn.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				newBtnActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
		this.setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE,
						javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
				.addGroup(layout.createSequentialGroup().addContainerGap()
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(jScrollPane1).addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
										layout.createSequentialGroup().addGap(0, 0, Short.MAX_VALUE)
												.addComponent(newBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 121,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addGap(18, 18, 18).addComponent(backBtn,
														javax.swing.GroupLayout.PREFERRED_SIZE, 121,
														javax.swing.GroupLayout.PREFERRED_SIZE)))
						.addContainerGap()));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup()
						.addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 404,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED,
								javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(backBtn).addComponent(newBtn))
						.addContainerGap()));
	}// </editor-fold>

	private void logoutBtnMouseClicked(java.awt.event.MouseEvent evt) {
		new LoginPage();
		frame.dispose();
	}

	private void newBtnActionPerformed(java.awt.event.ActionEvent evt) {
		new CreateSubjectPage(us, frame);
	}

	private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {
		new LoginPage();
		frame.dispose();
	}

	private void tableMousePressed(java.awt.event.MouseEvent evt) {
		int se = table.getSelectedRow();
		new SubjectMenuPage(mySubList.get(se), us);
	}

	// Variables declaration - do not modify
	private javax.swing.JLabel PA2;
	private javax.swing.JButton backBtn;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JSeparator lineID;
	private javax.swing.JLabel loginNametxt;
	private javax.swing.JLabel logoTU1;
	private javax.swing.JButton logoutBtn;
	private javax.swing.JLabel nameSurname;
	private javax.swing.JButton newBtn;
	private javax.swing.JTable table;
	// End of variables declaration

}
