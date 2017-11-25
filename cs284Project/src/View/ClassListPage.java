package View;

import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;
import Controller.FileMgnt;
import Controller.SubjectMgnt;
import Model.ClassList;
import Model.Student;

public class ClassListPage extends javax.swing.JFrame {

	public ClassListPage(ClassList cl, String subname) {
		initComponents();
		table.setFont(new Font("", 1, 14));
		table.setRowHeight(25);
		SubjectMgnt.addEmailToClassList(FileMgnt.readEmailExcelFile(), cl);
		DefaultTableModel model = (DefaultTableModel) table.getModel();
		for (Student st : cl.getClassList()) {
			model.addRow(new Object[0]);
			int row = model.getRowCount() - 1;
			model.setValueAt(st.getId(), row, 0);
			model.setValueAt(st.getName(), row, 1);
			model.setValueAt(st.getEmail(), row, 2);
			model.setValueAt("N", row, 3);
		}
		setTitle("รายชื่อนักศึกษาที่ลงทะเบียน " + subname);
		setSize(620, 720);
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setResizable(false);
		setLocationRelativeTo(null); // center on screen
		setVisible(true);
	}

	private void initComponents() {

		jPanel1 = new javax.swing.JPanel();
		backBtt = new javax.swing.JButton();
		tableScroll = new javax.swing.JScrollPane();
		table = new javax.swing.JTable();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		jPanel1.setBackground(new java.awt.Color(255, 233, 114));

		backBtt.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
		backBtt.setText("Back");
		backBtt.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				backBttActionPerformed(evt);
			}
		});

		table.setModel(new javax.swing.table.DefaultTableModel(new Object[][] {

		}, new String[] { "รหัสนักศึกษา", "ชื่อ", "อีเมล", "สถานะ" }) {
			Class[] types = new Class[] { java.lang.String.class, java.lang.String.class, java.lang.String.class,
					java.lang.String.class };
			boolean[] canEdit = new boolean[] { false, false, false, false };

			public Class getColumnClass(int columnIndex) {
				return types[columnIndex];
			}

			public boolean isCellEditable(int rowIndex, int columnIndex) {
				return canEdit[columnIndex];
			}
		});
		tableScroll.setViewportView(table);

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup()
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(jPanel1Layout.createSequentialGroup().addGap(20, 20, 20).addComponent(
										tableScroll, javax.swing.GroupLayout.DEFAULT_SIZE, 1218, Short.MAX_VALUE))
								.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
										jPanel1Layout.createSequentialGroup()
												.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
												.addComponent(backBtt)))
						.addContainerGap()));
		jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup().addGap(20, 20, 20)
						.addComponent(tableScroll, javax.swing.GroupLayout.PREFERRED_SIZE, 600,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
								javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(backBtt).addContainerGap()));

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE,
				javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));

		pack();
	}// </editor-fold>

	private void backBttActionPerformed(java.awt.event.ActionEvent evt) {
		this.dispose();
	}

	public static void main(String args[]) {
		new ClassListPage(FileMgnt.readClassListFile(), "CS284");
	}

	// Variables declaration - do not modify
	private javax.swing.JButton backBtt;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JTable table;
	private javax.swing.JScrollPane tableScroll;
	// End of variables declaration
}
