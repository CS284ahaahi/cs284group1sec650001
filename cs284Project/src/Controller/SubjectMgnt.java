package Controller;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

import Model.ClassList;
import Model.ExamCriteria;
import Model.ExamResult;
import Model.GradingCriteria;
import Model.Student;
import Model.StudentResult;
import Model.Subject;
import Model.User;

public class SubjectMgnt {

	public static ArrayList<StudentResult> checkGrading(int id) { // return นักศึกษาที่คะแนนยังไม่ครบ
		ArrayList<StudentResult> noneGrade = new ArrayList<>();
		String sql = "select * from SCORE_LIST where SUBJECT_ID = '" + id + "'";
		ResultSet rs;
		try {
			Connection con = ConnectMgnt.getConnect();
			Statement st = con.createStatement();
			rs = st.executeQuery(sql);
			while (rs.next()) {
				// System.out.println(rs.getString("ID"));
			}
			if (noneGrade.size() > 0) {
				return noneGrade;
			}
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Database Error.!!!" + e.getMessage(), "ERROR",
					JOptionPane.ERROR_MESSAGE);
		}

		return null;
	}

	private static boolean dropStudent(String id) {// Coming Soon
		return false;
	}

	public static ArrayList<Subject> getAllSubject() {
		ArrayList<Subject> subList = new ArrayList<>();
		// database
		return null;
	}

	public static ArrayList<Subject> getMySubject(User user) {
		if (user.getRank().equals("PROFESSOR")) {
			ArrayList<Subject> mySub = new ArrayList<>();
			String sql = "select * from SUBJECTS_LIST Where OWNER_USER like '%" + user.getUserName() + "%'";
			ResultSet rs;
			try {
				Connection con = ConnectMgnt.getConnect();
				Statement st = con.createStatement();
				rs = st.executeQuery(sql);
				while (rs.next()) {
					int id = rs.getInt("ID");
					String nameThai = rs.getString("NAME");
					String nameEng = rs.getString("NAME_ENG");
					String code = rs.getString("CODE");
					String section = rs.getString("SECTION");
					String ownerUser = rs.getString("OWNER_USER");
					String semester = rs.getString("SEMESTER");
					String year = rs.getString("YEAR");
					ClassList classList = getClassListBySubjectID(id);
					GradingCriteria gradeCri = getGradingCriBySubjectID(rs.getInt("GRADING_CRI_ID"));
					ExamCriteria examCri = getExamCriBySubjectID(rs.getInt("EXAM_CRI_ID"));
					ExamResult exResult = getExamResultBySubjectID(id, examCri.getScoreAmount());
					Subject sub = new Subject(id, nameThai, nameEng, code, section, ownerUser, semester, year,
							classList, exResult, gradeCri, examCri, null);
					mySub.add(sub);
				}
			} catch (SQLException e) {
				JOptionPane.showMessageDialog(null, "Database Error.!!!" + e.getMessage(), "ERROR",
						JOptionPane.ERROR_MESSAGE);
			}
			if (mySub.size() > 0) {
				return mySub;
			}
		}
		return null;
	}

	public static ClassList getClassListBySubjectID(int id) {
		String sql = "select * from CLASS_LIST Where SUBJECT_ID	 = '" + id + "'";
		try {
			Connection con = ConnectMgnt.getConnect();
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(sql);
			ClassList cl = new ClassList();
			while (rs.next()) {
				int ID = rs.getInt("ID");
				String ids = rs.getString("USER_ID");
				String name = rs.getString("NAME");
				String email = rs.getString("EMAIL");
				Student student = new Student(ID, ids, name, email);
				cl.add(student);
			}
			return cl;
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Database Error.!!!" + e.getMessage(), "ERROR",
					JOptionPane.ERROR_MESSAGE);
		}
		return null;
	}

	public static GradingCriteria getGradingCriBySubjectID(int id) {
		String sql = "select * from GRADING_LIST Where ID = '" + id + "'";
		try {
			Connection con = ConnectMgnt.getConnect();
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(sql);
			if (rs.next()) {
				int ID = rs.getInt("ID");
				int a = rs.getInt("GRADING_A");
				int bp = rs.getInt("GRADING_B+");
				int b = rs.getInt("GRADING_B");
				int cp = rs.getInt("GRADING_C+");
				int c = rs.getInt("GRADING_C");
				int dp = rs.getInt("GRADING_D+");
				int d = rs.getInt("GRADING_D");
				GradingCriteria gc;
				try {
					gc = new GradingCriteria(ID, a, bp, b, cp, c, dp, d);
				} catch (Exception e) {
					return null;
				}
				return gc;
			}
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Database Error.!!!" + e.getMessage(), "ERROR",
					JOptionPane.ERROR_MESSAGE);
		}
		return null;
	}

	public static ExamCriteria getExamCriBySubjectID(int id) {
		String sql = "select * from EXAM_CRITERIA_LIST Where ID = '" + id + "'";
		try {
			Connection con = ConnectMgnt.getConnect();
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(sql);
			if (rs.next()) {
				int scoreAmount = rs.getInt("SCORE_AMT");
				ExamCriteria ec = new ExamCriteria(id, scoreAmount);
				int midFull = rs.getInt("MID_FULL");
				int midPer = rs.getInt("MID_PER");
				int finalFull = rs.getInt("FINAL_FULL");
				int finalPer = rs.getInt("FINAL_PER");
				ec.setMidFull(midFull);
				ec.setMidPer(midPer);
				ec.setFinalFull(finalFull);
				ec.setFinalPer(finalPer);
				int[] scoreFull = new int[scoreAmount];
				int[] scorePer = new int[scoreAmount];
				for (int i = 1; i <= scoreAmount; i++) {
					int score = rs.getInt("SCORE" + i + "_FULL");
					int per = rs.getInt("SCORE" + i + "_PER");
					scoreFull[i - 1] = score;
					scorePer[i - 1] = per;
				}
				ec.setScore(scoreFull);
				ec.setScorePer(scorePer);
				return ec;
			}
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Database Error.!!!" + e.getMessage(), "ERROR",
					JOptionPane.ERROR_MESSAGE);
		}
		return null;
	}

	public static boolean editExamCri(ExamCriteria ec) {
		String sql = "update EXAM_CRITERIA_LIST SET `MID_FULL` = '" + ec.getMidFull() + "',`MID_PER` = '"
				+ ec.getMidPer() + "',`FINAL_FULL` = '" + ec.getFinalFull() + "',`FINAL_PER` = '" + ec.getFinalPer()
				+ "',`SCORE_AMT` = '" + ec.getScoreAmount() + "',";
		try {
			Connection con = ConnectMgnt.getConnect();
			Statement st = con.createStatement();
			for (int i = 0; i < ec.getScoreAmount(); i++) {
				int index = i + 1;
				int scoreFull = ec.getScore()[i];
				int scorePer = ec.getScorePer()[i];
				sql += "`SCORE" + index + "_FULL` = '" + scoreFull + "',`SCORE" + index + "_PER` = '" + scorePer + "'";
				if (i < ec.getScoreAmount() - 1) {
					sql += ",";
				}
			}
			sql += " Where ID = '" + ec.getId() + "'";
			return !st.execute(sql);
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Database Error.!!!" + e.getMessage(), "ERROR",
					JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}

	public static ExamResult getExamResultBySubjectID(int id, int scoreAmount) {
		String sql = "select * from SCORE_LIST Where SUBJECT_ID = '" + id + "'";
		try {
			Connection con = ConnectMgnt.getConnect();
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(sql);
			ExamResult re = new ExamResult(id);
			while (rs.next()) {
				int ID = rs.getInt("ID");
				String ids = rs.getString("USER_ID");
				double midScore = rs.getDouble("SCORE_MID");
				double finalScore = rs.getDouble("SCORE_FINAL");
				String status = rs.getString("STATUS");
				String grade = rs.getString("GRADE");
				double[] score = new double[scoreAmount];
				for (int i = 0; i < score.length; i++) {
					int scoreIndex = i + 1;
					score[i] = rs.getDouble("SCORE_" + scoreIndex);
				}
				StudentResult stuRes = new StudentResult(ID, ids, midScore, finalScore, score, grade, status);
				re.addStudentResult(stuRes);
			}
			return re;
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Database Error.!!!" + e.getMessage(), "ERROR",
					JOptionPane.ERROR_MESSAGE);
		}
		return null;
	}

	public static boolean editExamResult(ExamResult er) {
		try {
			Connection con = ConnectMgnt.getConnect();
			Statement st = con.createStatement();
			int fail = 0;
			for (StudentResult sr : er.getList()) {
				String sql = "UPDATE SCORE_LIST SET `SCORE_MID` = '" + sr.getMidScore() + "',`SCORE_FINAL` = '"
						+ sr.getFinalScore() + "',";
				for (int i = 0; i < sr.getScoreAmount(); i++) {
					double score = sr.getScoreByIndex(i);
					int index = i + 1;
					sql += "`SCORE_" + index + "` = '" + score + "'";
					if (i < sr.getScoreAmount() - 1) {
						sql += ",";
					}
				}
				sql += " where ID = '" + sr.getID() + "'";
				System.out.println(sql);
				boolean check = st.execute(sql);
				if (check) {
					fail++;
				}
			}
			if (fail > 0) {
				return false;
			}
			return true;
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Database Error.!!!" + e.getMessage(), "ERROR",
					JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}

	public static boolean editGradingCriteria(GradingCriteria grade, Subject sub) {
		String sql = "UPDATE GRADING_LIST SET `GRADING_A` = '" + grade.getA() + "',`GRADING_B+` = '" + grade.getBp()
				+ "', `GRADING_B` = '" + grade.getB() + "', `GRADING_C+` = '" + grade.getCp() + "', `GRADING_C` = '"
				+ grade.getC() + "', `GRADING_D+` = '" + grade.getDp() + "', `GRADING_D` = '" + grade.getD()
				+ "' WHERE ID = '" + sub.getGradeCri().getId() + "'";
		try {
			Connection con = ConnectMgnt.getConnect();
			Statement st = con.createStatement();
			grade.setId(sub.getGradeCri().getId());
			sub.setGradeCri(grade);
			return !st.execute(sql);
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Database Error.!!!" + e.getMessage(), "ERROR",
					JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}

	public static void main(String[] args) {

	}
}
