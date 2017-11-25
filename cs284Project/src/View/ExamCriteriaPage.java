package View;

import java.awt.event.ActionEvent;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

import Controller.SubjectMgnt;
import Model.ExamCriteria;

public class ExamCriteriaPage extends javax.swing.JFrame {

	private ExamCriteria ec;
	private boolean save;
	private boolean newSub;

	public ExamCriteriaPage() {
		newSub = true;
		save = false;
		initComponents();
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}

	public ExamCriteriaPage(ExamCriteria ec) {
		this.ec = ec;
		newSub = false;
		save = false;
		initComponents();
		this.finalFull.setText(ec.getFinalFull() + "");
		this.finalPer.setText(ec.getFinalPer() + "");
		this.midFull.setText(ec.getMidFull() + "");
		this.midPer.setText(ec.getMidPer() + "");
		this.amountQuiz.setSelectedIndex(ec.getScoreAmount() - 1);
		for (int i = 0; i < ec.getScoreAmount(); i++) {
			this.scoreFull[i].setEditable(true);
			this.scoreFull[i].setText(ec.getScore()[i] + "");
			this.scorePer[i].setEditable(true);
			this.scorePer[i].setText(ec.getScorePer()[i] + "");
		}
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}

	private void enableBox() {
		int amt = this.amountQuiz.getSelectedIndex();
		for (int i = 0; i < 10; i++) {
			scoreFull[i].setText("");
			scoreFull[i].setEditable(false);
			scorePer[i].setText("");
			scorePer[i].setEditable(false);
		}
		for (int i = 0; i < amt; i++) {
			scoreFull[i].setEditable(true);
		}
		for (int i = 0; i < amt; i++) {
			scorePer[i].setEditable(true);
		}
	}

	public ExamCriteria getExamCri() {
		return ec;
	}

	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		bk = new javax.swing.JPanel();
		saveBtn = new javax.swing.JButton();
		perlb = new javax.swing.JLabel();
		scorelb = new javax.swing.JLabel();
		fulllb = new javax.swing.JLabel();
		backBtn = new javax.swing.JButton();
		midPanel = new javax.swing.JPanel();
		midlb = new javax.swing.JLabel();
		midPer = new javax.swing.JTextField();
		midFull = new javax.swing.JTextField();
		finalPanel = new javax.swing.JPanel();
		finallb = new javax.swing.JLabel();
		finalPer = new javax.swing.JTextField();
		finalFull = new javax.swing.JTextField();
		amtQuiz = new javax.swing.JLabel();
		amountQuiz = new javax.swing.JComboBox<>();
		quizPanel = new javax.swing.JPanel();
		score1Panel = new javax.swing.JPanel();
		score1lb = new javax.swing.JLabel();
		scorePer = new javax.swing.JTextField[10];
		for (int i = 0; i < scorePer.length; i++) {
			scorePer[i] = new JTextField();
			scorePer[i].setEditable(false);
		}
		scoreFull = new javax.swing.JTextField[10];
		for (int i = 0; i < scoreFull.length; i++) {
			scoreFull[i] = new JTextField();
			scoreFull[i].setEditable(false);
		}
		score2Panel = new javax.swing.JPanel();
		score2lb = new javax.swing.JLabel();
		score3Panel = new javax.swing.JPanel();
		score3lb = new javax.swing.JLabel();
		score4Panel = new javax.swing.JPanel();
		score4lb = new javax.swing.JLabel();
		score5Panel = new javax.swing.JPanel();
		score5lb = new javax.swing.JLabel();
		score6Panel = new javax.swing.JPanel();
		score6lb = new javax.swing.JLabel();
		score7Panel = new javax.swing.JPanel();
		score7lb = new javax.swing.JLabel();
		score8Panel = new javax.swing.JPanel();
		score8lb = new javax.swing.JLabel();
		score9Panel = new javax.swing.JPanel();
		score9lb = new javax.swing.JLabel();
		score10Panel = new javax.swing.JPanel();
		score10lb = new javax.swing.JLabel();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setResizable(false);

		bk.setBackground(new java.awt.Color(255, 204, 51));

		saveBtn.setText("Save");
		saveBtn.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				saveBtnActionPerformed(evt);
			}
		});

		amountQuiz.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				amountQuizActionPerformed(evt);
			}
		});

		perlb.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
		perlb.setText("Percent");

		scorelb.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
		scorelb.setText("Score");

		fulllb.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
		fulllb.setText("Full");

		backBtn.setText("Back");
		backBtn.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				backBtnActionPerformed(evt);
			}
		});

		midPanel.setBackground(new java.awt.Color(255, 204, 51));

		midlb.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
		midlb.setText("Midterm");

		javax.swing.GroupLayout midPanelLayout = new javax.swing.GroupLayout(midPanel);
		midPanel.setLayout(midPanelLayout);
		midPanelLayout
				.setHorizontalGroup(midPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(midPanelLayout.createSequentialGroup().addGap(20, 20, 20).addComponent(midlb)
								.addGap(33, 33, 33)
								.addComponent(midFull, javax.swing.GroupLayout.PREFERRED_SIZE, 100,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(20, 20, 20)
								.addComponent(midPer, javax.swing.GroupLayout.PREFERRED_SIZE, 100,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
		midPanelLayout.setVerticalGroup(midPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(midPanelLayout.createSequentialGroup().addGroup(midPanelLayout
						.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(midPanelLayout.createSequentialGroup().addGap(20, 20, 20).addComponent(midlb))
						.addGroup(midPanelLayout.createSequentialGroup().addGap(10, 10, 10).addComponent(midFull,
								javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGroup(midPanelLayout.createSequentialGroup().addGap(10, 10, 10).addComponent(midPer,
								javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

		finalPanel.setBackground(new java.awt.Color(255, 204, 51));

		finallb.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
		finallb.setText("Final");

		javax.swing.GroupLayout finalPanelLayout = new javax.swing.GroupLayout(finalPanel);
		finalPanel.setLayout(finalPanelLayout);
		finalPanelLayout
				.setHorizontalGroup(finalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(finalPanelLayout.createSequentialGroup().addGap(20, 20, 20).addComponent(finallb)
								.addGap(71, 71, 71)
								.addComponent(finalFull, javax.swing.GroupLayout.PREFERRED_SIZE, 100,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(20, 20, 20).addComponent(finalPer, javax.swing.GroupLayout.PREFERRED_SIZE, 100,
										javax.swing.GroupLayout.PREFERRED_SIZE)));
		finalPanelLayout
				.setVerticalGroup(finalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(finalPanelLayout.createSequentialGroup().addGap(20, 20, 20).addComponent(finallb))
						.addGroup(finalPanelLayout.createSequentialGroup().addGap(10, 10, 10).addComponent(finalFull,
								javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGroup(finalPanelLayout.createSequentialGroup().addGap(10, 10, 10).addComponent(finalPer,
								javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)));

		amtQuiz.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
		amtQuiz.setText("amount Quiz");

		amountQuiz.setModel(new javax.swing.DefaultComboBoxModel<>(
				new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));

		quizPanel.setLayout(new java.awt.GridLayout(10, 1));

		score1Panel.setBackground(new java.awt.Color(255, 204, 51));

		score1lb.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
		score1lb.setText("Score 1");

		javax.swing.GroupLayout score1PanelLayout = new javax.swing.GroupLayout(score1Panel);
		score1Panel.setLayout(score1PanelLayout);
		score1PanelLayout
				.setHorizontalGroup(score1PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(score1PanelLayout.createSequentialGroup().addGap(20, 20, 20).addComponent(score1lb)
								.addGap(42, 42, 42)
								.addComponent(scoreFull[0], javax.swing.GroupLayout.PREFERRED_SIZE, 100,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(18, 18, 18).addComponent(scorePer[0], javax.swing.GroupLayout.PREFERRED_SIZE,
										100, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addContainerGap()));
		score1PanelLayout.setVerticalGroup(score1PanelLayout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(score1PanelLayout.createSequentialGroup().addGap(20, 20, 20).addComponent(score1lb))
				.addGroup(score1PanelLayout.createSequentialGroup().addGap(10, 10, 10)
						.addGroup(score1PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(scorePer[0], javax.swing.GroupLayout.PREFERRED_SIZE, 40,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(scoreFull[0], javax.swing.GroupLayout.PREFERRED_SIZE, 40,
										javax.swing.GroupLayout.PREFERRED_SIZE))));

		quizPanel.add(score1Panel);

		score2Panel.setBackground(new java.awt.Color(255, 204, 51));

		score2lb.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
		score2lb.setText("Score 2");

		javax.swing.GroupLayout score2PanelLayout = new javax.swing.GroupLayout(score2Panel);
		score2Panel.setLayout(score2PanelLayout);
		score2PanelLayout
				.setHorizontalGroup(score2PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(score2PanelLayout.createSequentialGroup().addGap(20, 20, 20).addComponent(score2lb)
								.addGap(42, 42, 42)
								.addComponent(scoreFull[1], javax.swing.GroupLayout.PREFERRED_SIZE, 100,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(18, 18, 18).addComponent(scorePer[1], javax.swing.GroupLayout.PREFERRED_SIZE,
										100, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addContainerGap()));
		score2PanelLayout.setVerticalGroup(score2PanelLayout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(score2PanelLayout.createSequentialGroup().addGap(20, 20, 20).addComponent(score2lb))
				.addGroup(score2PanelLayout.createSequentialGroup().addGap(10, 10, 10)
						.addGroup(score2PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(scorePer[1], javax.swing.GroupLayout.PREFERRED_SIZE, 40,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(scoreFull[1], javax.swing.GroupLayout.PREFERRED_SIZE, 40,
										javax.swing.GroupLayout.PREFERRED_SIZE))));

		quizPanel.add(score2Panel);

		score3Panel.setBackground(new java.awt.Color(255, 204, 51));

		score3lb.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
		score3lb.setText("Score 3");

		javax.swing.GroupLayout score3PanelLayout = new javax.swing.GroupLayout(score3Panel);
		score3Panel.setLayout(score3PanelLayout);
		score3PanelLayout
				.setHorizontalGroup(score3PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(score3PanelLayout.createSequentialGroup().addGap(20, 20, 20).addComponent(score3lb)
								.addGap(42, 42, 42)
								.addComponent(scoreFull[2], javax.swing.GroupLayout.PREFERRED_SIZE, 100,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(18, 18, 18).addComponent(scorePer[2], javax.swing.GroupLayout.PREFERRED_SIZE,
										100, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addContainerGap()));
		score3PanelLayout.setVerticalGroup(score3PanelLayout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(score3PanelLayout.createSequentialGroup().addGap(20, 20, 20).addComponent(score3lb))
				.addGroup(score3PanelLayout.createSequentialGroup().addGap(10, 10, 10)
						.addGroup(score3PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(scorePer[2], javax.swing.GroupLayout.PREFERRED_SIZE, 40,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(scoreFull[2], javax.swing.GroupLayout.PREFERRED_SIZE, 40,
										javax.swing.GroupLayout.PREFERRED_SIZE))));

		quizPanel.add(score3Panel);

		score4Panel.setBackground(new java.awt.Color(255, 204, 51));

		score4lb.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
		score4lb.setText("Score 4");

		javax.swing.GroupLayout score4PanelLayout = new javax.swing.GroupLayout(score4Panel);
		score4Panel.setLayout(score4PanelLayout);
		score4PanelLayout
				.setHorizontalGroup(score4PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(score4PanelLayout.createSequentialGroup().addGap(20, 20, 20).addComponent(score4lb)
								.addGap(42, 42, 42)
								.addComponent(scoreFull[3], javax.swing.GroupLayout.PREFERRED_SIZE, 100,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(18, 18, 18).addComponent(scorePer[3], javax.swing.GroupLayout.PREFERRED_SIZE,
										100, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addContainerGap()));
		score4PanelLayout.setVerticalGroup(score4PanelLayout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(score4PanelLayout.createSequentialGroup().addGap(20, 20, 20).addComponent(score4lb))
				.addGroup(score4PanelLayout.createSequentialGroup().addGap(10, 10, 10)
						.addGroup(score4PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(scorePer[3], javax.swing.GroupLayout.PREFERRED_SIZE, 40,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(scoreFull[3], javax.swing.GroupLayout.PREFERRED_SIZE, 40,
										javax.swing.GroupLayout.PREFERRED_SIZE))));

		quizPanel.add(score4Panel);

		score5Panel.setBackground(new java.awt.Color(255, 204, 51));

		score5lb.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
		score5lb.setText("Score 5");

		javax.swing.GroupLayout score5PanelLayout = new javax.swing.GroupLayout(score5Panel);
		score5Panel.setLayout(score5PanelLayout);
		score5PanelLayout
				.setHorizontalGroup(score5PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(score5PanelLayout.createSequentialGroup().addGap(20, 20, 20).addComponent(score5lb)
								.addGap(42, 42, 42)
								.addComponent(scoreFull[4], javax.swing.GroupLayout.PREFERRED_SIZE, 100,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(18, 18, 18).addComponent(scorePer[4], javax.swing.GroupLayout.PREFERRED_SIZE,
										100, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addContainerGap()));
		score5PanelLayout.setVerticalGroup(score5PanelLayout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(score5PanelLayout.createSequentialGroup().addGap(20, 20, 20).addComponent(score5lb))
				.addGroup(score5PanelLayout.createSequentialGroup().addGap(10, 10, 10)
						.addGroup(score5PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(scorePer[4], javax.swing.GroupLayout.PREFERRED_SIZE, 40,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(scoreFull[4], javax.swing.GroupLayout.PREFERRED_SIZE, 40,
										javax.swing.GroupLayout.PREFERRED_SIZE))));

		quizPanel.add(score5Panel);

		score6Panel.setBackground(new java.awt.Color(255, 204, 51));

		score6lb.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
		score6lb.setText("Score 6");

		javax.swing.GroupLayout score6PanelLayout = new javax.swing.GroupLayout(score6Panel);
		score6Panel.setLayout(score6PanelLayout);
		score6PanelLayout
				.setHorizontalGroup(score6PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(score6PanelLayout.createSequentialGroup().addGap(20, 20, 20).addComponent(score6lb)
								.addGap(42, 42, 42)
								.addComponent(scoreFull[5], javax.swing.GroupLayout.PREFERRED_SIZE, 100,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(18, 18, 18).addComponent(scorePer[5], javax.swing.GroupLayout.PREFERRED_SIZE,
										100, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addContainerGap()));
		score6PanelLayout.setVerticalGroup(score6PanelLayout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(score6PanelLayout.createSequentialGroup().addGap(20, 20, 20).addComponent(score6lb))
				.addGroup(score6PanelLayout.createSequentialGroup().addGap(10, 10, 10)
						.addGroup(score6PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(scorePer[5], javax.swing.GroupLayout.PREFERRED_SIZE, 40,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(scoreFull[5], javax.swing.GroupLayout.PREFERRED_SIZE, 40,
										javax.swing.GroupLayout.PREFERRED_SIZE))));

		quizPanel.add(score6Panel);

		score7Panel.setBackground(new java.awt.Color(255, 204, 51));

		score7lb.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
		score7lb.setText("Score 7");

		javax.swing.GroupLayout score7PanelLayout = new javax.swing.GroupLayout(score7Panel);
		score7Panel.setLayout(score7PanelLayout);
		score7PanelLayout
				.setHorizontalGroup(score7PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(score7PanelLayout.createSequentialGroup().addGap(20, 20, 20).addComponent(score7lb)
								.addGap(42, 42, 42)
								.addComponent(scoreFull[6], javax.swing.GroupLayout.PREFERRED_SIZE, 100,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(18, 18, 18).addComponent(scorePer[6], javax.swing.GroupLayout.PREFERRED_SIZE,
										100, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addContainerGap()));
		score7PanelLayout.setVerticalGroup(score7PanelLayout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(score7PanelLayout.createSequentialGroup().addGap(20, 20, 20).addComponent(score7lb))
				.addGroup(score7PanelLayout.createSequentialGroup().addGap(10, 10, 10)
						.addGroup(score7PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(scorePer[6], javax.swing.GroupLayout.PREFERRED_SIZE, 40,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(scoreFull[6], javax.swing.GroupLayout.PREFERRED_SIZE, 40,
										javax.swing.GroupLayout.PREFERRED_SIZE))));

		quizPanel.add(score7Panel);

		score8Panel.setBackground(new java.awt.Color(255, 204, 51));

		score8lb.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
		score8lb.setText("Score 8");

		javax.swing.GroupLayout score8PanelLayout = new javax.swing.GroupLayout(score8Panel);
		score8Panel.setLayout(score8PanelLayout);
		score8PanelLayout
				.setHorizontalGroup(score8PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(score8PanelLayout.createSequentialGroup().addGap(20, 20, 20).addComponent(score8lb)
								.addGap(42, 42, 42)
								.addComponent(scoreFull[7], javax.swing.GroupLayout.PREFERRED_SIZE, 100,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(18, 18, 18).addComponent(scorePer[7], javax.swing.GroupLayout.PREFERRED_SIZE,
										100, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addContainerGap()));
		score8PanelLayout.setVerticalGroup(score8PanelLayout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(score8PanelLayout.createSequentialGroup().addGap(20, 20, 20).addComponent(score8lb))
				.addGroup(score8PanelLayout.createSequentialGroup().addGap(10, 10, 10)
						.addGroup(score8PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(scorePer[7], javax.swing.GroupLayout.PREFERRED_SIZE, 40,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(scoreFull[7], javax.swing.GroupLayout.PREFERRED_SIZE, 40,
										javax.swing.GroupLayout.PREFERRED_SIZE))));

		quizPanel.add(score8Panel);

		score9Panel.setBackground(new java.awt.Color(255, 204, 51));

		score9lb.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
		score9lb.setText("Score 9");

		javax.swing.GroupLayout score9PanelLayout = new javax.swing.GroupLayout(score9Panel);
		score9Panel.setLayout(score9PanelLayout);
		score9PanelLayout
				.setHorizontalGroup(score9PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(score9PanelLayout.createSequentialGroup().addGap(20, 20, 20).addComponent(score9lb)
								.addGap(42, 42, 42)
								.addComponent(scoreFull[8], javax.swing.GroupLayout.PREFERRED_SIZE, 100,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(18, 18, 18).addComponent(scorePer[8], javax.swing.GroupLayout.PREFERRED_SIZE,
										100, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addContainerGap()));
		score9PanelLayout.setVerticalGroup(score9PanelLayout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(score9PanelLayout.createSequentialGroup().addGap(20, 20, 20).addComponent(score9lb))
				.addGroup(score9PanelLayout.createSequentialGroup().addGap(10, 10, 10)
						.addGroup(score9PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(scorePer[8], javax.swing.GroupLayout.PREFERRED_SIZE, 40,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(scoreFull[8], javax.swing.GroupLayout.PREFERRED_SIZE, 40,
										javax.swing.GroupLayout.PREFERRED_SIZE))));

		quizPanel.add(score9Panel);

		score10Panel.setBackground(new java.awt.Color(255, 204, 51));

		score10lb.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
		score10lb.setText("Score 10");

		javax.swing.GroupLayout score10PanelLayout = new javax.swing.GroupLayout(score10Panel);
		score10Panel.setLayout(score10PanelLayout);
		score10PanelLayout
				.setHorizontalGroup(score10PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(score10PanelLayout.createSequentialGroup().addGap(20, 20, 20).addComponent(score10lb)
								.addGap(30, 30, 30)
								.addComponent(scoreFull[9], javax.swing.GroupLayout.PREFERRED_SIZE, 100,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(18, 18, 18).addComponent(scorePer[9], javax.swing.GroupLayout.PREFERRED_SIZE,
										100, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addContainerGap()));
		score10PanelLayout.setVerticalGroup(score10PanelLayout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(score10PanelLayout.createSequentialGroup().addGap(20, 20, 20).addComponent(score10lb))
				.addGroup(score10PanelLayout.createSequentialGroup().addGap(10, 10, 10)
						.addGroup(score10PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(scorePer[9], javax.swing.GroupLayout.PREFERRED_SIZE, 40,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(scoreFull[9], javax.swing.GroupLayout.PREFERRED_SIZE, 40,
										javax.swing.GroupLayout.PREFERRED_SIZE))));

		quizPanel.add(score10Panel);

		javax.swing.GroupLayout bkLayout = new javax.swing.GroupLayout(bk);
		bk.setLayout(bkLayout);
		bkLayout.setHorizontalGroup(bkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(bkLayout.createSequentialGroup().addGroup(bkLayout
						.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(bkLayout.createSequentialGroup().addContainerGap()
								.addGroup(bkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addComponent(midPanel, javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(finalPanel, javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
						.addGroup(bkLayout.createSequentialGroup().addGroup(bkLayout
								.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(bkLayout.createSequentialGroup().addGap(50, 50, 50).addComponent(scorelb)
										.addGap(81, 81, 81).addComponent(fulllb).addGap(54, 54, 54).addComponent(perlb))
								.addGroup(bkLayout.createSequentialGroup().addGap(64, 64, 64).addComponent(amtQuiz)
										.addGap(31, 31, 31).addComponent(amountQuiz,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGroup(bkLayout.createSequentialGroup().addGap(24, 24, 24).addComponent(quizPanel,
										javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGroup(bkLayout.createSequentialGroup().addGap(91, 91, 91)
										.addComponent(saveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 104,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(48, 48, 48).addComponent(backBtn,
												javax.swing.GroupLayout.PREFERRED_SIZE, 104,
												javax.swing.GroupLayout.PREFERRED_SIZE)))
								.addGap(0, 32, Short.MAX_VALUE)))
						.addContainerGap()));
		bkLayout.setVerticalGroup(bkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(bkLayout.createSequentialGroup().addGap(30, 30, 30)
						.addGroup(bkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(scorelb).addComponent(fulllb).addComponent(perlb))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(midPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 60,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(1, 1, 1)
						.addComponent(finalPanel, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(18, 18, 18)
						.addGroup(bkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(amtQuiz).addComponent(amountQuiz, javax.swing.GroupLayout.PREFERRED_SIZE,
										34, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(0, 0, 0)
						.addComponent(quizPanel, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(18, 18, 18)
						.addGroup(bkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(saveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 38,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 38,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(bk,
				javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(bk,
				javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));

		pack();
	}// </editor-fold>

	private void amountQuizActionPerformed(ActionEvent evt) {
		enableBox();
	}

	private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {
		int c = JOptionPane.showConfirmDialog(this, "ท่านยังไม่ได้ save ต้องการ save หรือไม่");
		if (c == JOptionPane.YES_OPTION) {
			save();
		} else if (c == JOptionPane.NO_OPTION) {
			this.dispose();
		}
	}

	private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {
		save();
	}

	public void save() {
		int check = 0;
		ExamCriteria ecNew = new ExamCriteria(0, this.amountQuiz.getSelectedIndex());
		String finalFull = this.finalFull.getText().trim();
		String finalPer = this.finalPer.getText().trim();
		String midFull = this.midFull.getText().trim();
		String midPer = this.midPer.getText().trim();
		String[] scoreFulls = new String[ecNew.getScoreAmount()];
		String[] scorePers = new String[ecNew.getScoreAmount()];
		for (int i = 0; i < ecNew.getScoreAmount(); i++) {
			scoreFulls[i] = scoreFull[i].getText().trim();
			if (scoreFulls[i].equals("")) {
				check++;
			}
			scorePers[i] = scorePer[i].getText().trim();
			if (scorePers[i].equals("")) {
				check++;
			}
		}
		if (finalFull.equals("")) {
			check++;
		} else if (finalPer.equals("")) {
			check++;
		} else if (midFull.equals("")) {
			check++;
		} else if (midPer.equals("")) {
			check++;
		}
		if (check == 0) {
			try {
				ecNew.setFinalFull(Integer.parseInt(finalFull));
				ecNew.setFinalPer(Integer.parseInt(finalPer));
				ecNew.setMidFull(Integer.parseInt(midFull));
				ecNew.setMidPer(Integer.parseInt(midPer));
				if (ecNew.getScoreAmount() > 0) {
					int[] scoreFull = new int[ecNew.getScoreAmount()];
					int[] scorePer = new int[ecNew.getScoreAmount()];
					for (int i = 0; i < ecNew.getScoreAmount(); i++) {
						scoreFull[i] = Integer.parseInt(scoreFulls[i]);
						scorePer[i] = Integer.parseInt(scorePers[i]);
					}
					ecNew.setScore(scoreFull);
					ecNew.setScorePer(scorePer);
				}
				if (SubjectMgnt.checkExamCri(ecNew)) {
					if (newSub) {
						ec = ecNew;
						JOptionPane.showMessageDialog(this, "บันทึกแล้ว");
						this.save = true;
						this.dispose();
					} else {
						ecNew.setId(ec.getId());
						if (SubjectMgnt.editExamCri(ecNew)) {
							JOptionPane.showMessageDialog(this, "บันทึกแล้ว");
							this.save = true;
							ec = ecNew;
							this.dispose();
						}
					}
				} else {
					JOptionPane.showMessageDialog(this, "ใส่สัดส่วนคะแนนไม่ถูกต้อง", "Warning!!",
							JOptionPane.ERROR_MESSAGE);
				}
			}catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(this, "คะแนนต้องเป็นตัวเลข", "Warning!!",
						JOptionPane.ERROR_MESSAGE);
			}
		}else {
			JOptionPane.showMessageDialog(this, "ใส่สัดส่วนคะแนนไม่ครบ", "Warning!!",
					JOptionPane.ERROR_MESSAGE);
		}
	}

	public boolean isSave() {
		return save;
	}

	public void setSave(boolean save) {
		this.save = save;
	}

	public static void main(String args[]) {
		new ExamCriteriaPage();
	}

	// Variables declaration - do not modify
	private javax.swing.JComboBox<String> amountQuiz;
	private javax.swing.JLabel amtQuiz;
	private javax.swing.JButton backBtn;
	private javax.swing.JPanel bk;
	private javax.swing.JTextField finalFull;
	private javax.swing.JPanel finalPanel;
	private javax.swing.JTextField finalPer;
	private javax.swing.JLabel finallb;
	private javax.swing.JLabel fulllb;
	private javax.swing.JTextField midFull;
	private javax.swing.JPanel midPanel;
	private javax.swing.JTextField midPer;
	private javax.swing.JLabel midlb;
	private javax.swing.JLabel perlb;
	private javax.swing.JPanel quizPanel;
	private javax.swing.JButton saveBtn;
	private javax.swing.JTextField[] scoreFull;
	private javax.swing.JPanel score10Panel;
	private javax.swing.JTextField[] scorePer;
	private javax.swing.JLabel score10lb;
	private javax.swing.JPanel score1Panel;
	private javax.swing.JLabel score1lb;
	private javax.swing.JPanel score2Panel;
	private javax.swing.JLabel score2lb;
	private javax.swing.JPanel score3Panel;
	private javax.swing.JLabel score3lb;
	private javax.swing.JPanel score4Panel;
	private javax.swing.JLabel score4lb;
	private javax.swing.JPanel score5Panel;
	private javax.swing.JLabel score5lb;
	private javax.swing.JPanel score6Panel;
	private javax.swing.JLabel score6lb;
	private javax.swing.JPanel score7Panel;
	private javax.swing.JLabel score7lb;
	private javax.swing.JPanel score8Panel;
	private javax.swing.JLabel score8lb;
	private javax.swing.JPanel score9Panel;
	private javax.swing.JLabel score9lb;
	private javax.swing.JLabel scorelb;
	// End of variables declaration
}
