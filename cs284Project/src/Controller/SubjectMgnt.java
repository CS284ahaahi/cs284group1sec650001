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

	public static ArrayList<StudentResult> checkGrading(Subject sub) { // return นักศึกษาที่คะแนนยังไม่ครบ
		ArrayList<StudentResult> noneGrade = new ArrayList<>();
		// String sql = "select * from " + sub.getTableName();
		// ResultSet rs;
		// try {
		// Connection con = ConnectMgnt.getConnect();
		// Statement st = con.createStatement();
		// rs = st.executeQuery(sql);
		// while (rs.next()) {
		// String id = rs.getString("ID_STUDENT");
		// double midScore = Double.parseDouble(rs.getString("SCORE_MID"));
		// double finalScore = Double.parseDouble(rs.getString("SCORE_FINAL"));
		// double score[] = new double[sub.getExamCri().getScoreAmount()];
		// for (int i = 1; i <= score.length; i++) {
		// String index = "SCORE_" + i;
		// score[i - 1] = Double.parseDouble(rs.getString(index));
		// }
		// StudentResult str = new StudentResult(id, midScore, finalScore, score);
		// if (midScore == -2 || finalScore == -2) {
		// noneGrade.add(str);
		// continue;
		// }
		// for (int i = 0; i < score.length; i++) {
		// if (score[i] == -2) {
		// noneGrade.add(str);
		// break;
		// }
		// }
		// }
		// if (noneGrade.size() > 0) {
		// return noneGrade;
		// }
		// } catch (SQLException e) {
		// JOptionPane.showMessageDialog(null, "Database Error.!!!" + e.getMessage(),
		// "ERROR",
		// JOptionPane.ERROR_MESSAGE);
		// }

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
					int id = Integer.parseInt(rs.getString("ID"));
					String nameThai = rs.getString("NAME");
					String nameEng = rs.getString("NAME_ENG");
					String code = rs.getString("CODE");
					String section = rs.getString("SECTION");
					String ownerUser = rs.getString("OWNER_USER");
					String semester = rs.getString("SEMESTER");
					String year = rs.getString("YEAR");
					ClassList classList = getClassListBySubjectID(Integer.parseInt(rs.getString("ID")));
					GradingCriteria gradeCri = getGradingCriBySubjectID(
							Integer.parseInt(rs.getString("GRADING_CRI_ID")));
					ExamCriteria examCri = getExamCriBySubjectID(Integer.parseInt(rs.getString("EXAM_CRI_ID")));
					ExamResult exResult = getExamResultBySubjectID(Integer.parseInt(rs.getString("ID")));
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
				int ID = Integer.parseInt(rs.getString("ID"));
				String ids = rs.getString("USER_ID");
				String name = rs.getString("NAME");
				String email = rs.getString("EMAIL");
				Student student = new Student(ID, ids, name, email);
				// System.out.println(ID + " " + ids + " " + name + " " + email);
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
				int ID = Integer.parseInt(rs.getString("ID"));
				int a = Integer.parseInt(rs.getString("GRADING_A"));
				int bp = Integer.parseInt(rs.getString("GRADING_B+"));
				int b = Integer.parseInt(rs.getString("GRADING_B"));
				int cp = Integer.parseInt(rs.getString("GRADING_C+"));
				int c = Integer.parseInt(rs.getString("GRADING_C"));
				int dp = Integer.parseInt(rs.getString("GRADING_D+"));
				int d = Integer.parseInt(rs.getString("GRADING_D"));
				GradingCriteria gc = new GradingCriteria(ID, a, bp, b, cp, c, dp, d);
				return gc;
			}
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Database Error.!!!" + e.getMessage(), "ERROR",
					JOptionPane.ERROR_MESSAGE);
		}
		return null;
	}

	public static ExamCriteria getExamCriBySubjectID(int id) {
		return null;
	}

	public static ExamResult getExamResultBySubjectID(int id) {
		return null;
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
}
