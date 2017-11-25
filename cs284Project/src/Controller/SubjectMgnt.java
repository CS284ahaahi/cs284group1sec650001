package Controller;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

import Model.ClassList;
import Model.EmailList;
import Model.ExamCriteria;
import Model.ExamResult;
import Model.GradingCriteria;
import Model.Student;
import Model.StudentResult;
import Model.Subject;
import Model.User;

public class SubjectMgnt {

	public static ArrayList<StudentResult> checkGrading(ExamResult er) { // return นักศึกษาที่คะแนนยังไม่ครบ
		ArrayList<StudentResult> noneGrade = new ArrayList<>();
		for (StudentResult sr : er.getList()) {
			if (sr.getFinalScore() == -2) {
				noneGrade.add(sr);
			} else if (sr.getMidScore() == -2) {
				noneGrade.add(sr);
			} else {
				for (int i = 0; i < sr.getScoreAmount(); i++) {
					if (sr.getScore()[i] == -2) {
						noneGrade.add(sr);
						break;
					}
				}
			}
		}
		if (noneGrade.size() > 0) {
			return noneGrade;
		}
		return null;
	}

	public static boolean checkExamCri(ExamCriteria ec) {
		if (ec.getFinalFull() < 0 || ec.getMidFull() < 0) {
			return false;
		}
		if (ec.getFinalPer() + ec.getMidPer() < 50) {
			return false;
		}
		if (ec.getFinalPer() < 0 || ec.getMidPer() < 0) {
			return false;
		}
		if (ec.getScoreAmount() < 0) {
			return false;
		}
		if (ec.getScoreAmount() > 0) {
			for (int i = 0; i < ec.getScoreAmount(); i++) {
				if (ec.getScore()[i] < 0 || ec.getScorePer()[i] < 0) {
					return false;
				}
			}
			int totalPer = ec.getFinalPer() + ec.getMidPer();
			for (int i = 0; i < ec.getScoreAmount(); i++) {
				totalPer += ec.getScorePer()[i];
			}
			if (totalPer != 100) {
				return false;
			}
		}
		return false;
	}

	public static boolean gradingExam(Subject sub) {
		ArrayList<StudentResult> noneGrd = SubjectMgnt.checkGrading(sub.getExResult());
		if (noneGrd != null) {
			String strList = "";
			for (StudentResult sr : noneGrd) {
				strList += sr.getID() + "\n";
			}
			strList += "ยังไม่มีคะแนนในบางส่วน โปรดเช็คการให้คะแนน";
			JOptionPane.showMessageDialog(null, strList, "Warning!!", JOptionPane.ERROR_MESSAGE);
			return false;
		}
		for (StudentResult sr : sub.getExResult().getList()) {
			if (sr.getStatus().equals("W")) {
				continue;
			}
			if (!SubjectMgnt.gradingStudentResult(sr, sub.getGradeCri(), sub.getExamCri())) {
				return false;
			}
		}
		return true;
	}

	public static boolean gradingStudentResult(StudentResult sr, GradingCriteria gc, ExamCriteria ec) {
		if (sr.getStatus().equals("W")) {
			JOptionPane.showMessageDialog(null, "ไม่สามารถตัดเกรดให้คนที่ถอนวิชานี้ไปแล้วได้", "ERROR",
					JOptionPane.ERROR_MESSAGE);
			return false;
		} else {
			double total = 0;
			double midScore = (sr.getMidScore() / ec.getMidFull()) * ec.getMidPer();
			double finalScore = (sr.getFinalScore() / ec.getFinalFull()) * ec.getFinalPer();
			total += midScore + finalScore;
			for (int i = 0; i < sr.getScoreAmount(); i++) {
				total += (sr.getScore()[i] / ec.getScore()[i]) * ec.getScorePer()[i];
			}
			int grading = (int) Math.round(total);
			if (grading >= gc.getA()) {
				sr.setGrade("A");
			} else if (grading >= gc.getBp()) {
				sr.setGrade("B+");
			} else if (grading >= gc.getB()) {
				sr.setGrade("B");
			} else if (grading >= gc.getCp()) {
				sr.setGrade("C+");
			} else if (grading >= gc.getC()) {
				sr.setGrade("C");
			} else if (grading >= gc.getDp()) {
				sr.setGrade("D+");
			} else if (grading >= gc.getD()) {
				sr.setGrade("D");
			} else {
				sr.setGrade("F");
			}
			return true;
		}
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

	public static boolean addGradingCriteriaToDB(GradingCriteria g) {
		String sql = "INSERT INTO GRADING_LIST (`GRADING_A`,`GRADING_B+`,`GRADING_B`,`GRADING_C+`,`GRADING_C`,`GRADING_D+`,`GRADING_D`) VALUES ('"
				+ g.getA() + "','" + g.getBp() + "','" + g.getB() + "','" + g.getCp() + "','" + g.getC() + "','"
				+ g.getDp() + "','" + g.getD() + "')";
		try {
			Connection con = ConnectMgnt.getConnect();
			Statement st = con.createStatement();
			return !st.execute(sql);
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Database Error.!!!" + e.getMessage(), "ERROR",
					JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}

	public static boolean addExamCriToDB(ExamCriteria ec) {
		String sql = "INSERT INTO EXAM_CRITERIA_LIST (MID_FULL,MID_PER,FINAL_FULL,FINAL_PER,SCORE_AMT,";
		try {
			Connection con = ConnectMgnt.getConnect();
			Statement st = con.createStatement();
			for (int i = 0; i < ec.getScoreAmount(); i++) {
				int index = i + 1;
				sql += "SCORE" + index + "_FULL,SCORE" + index + "_PER";
				if (i < ec.getScoreAmount() - 1) {
					sql += ",";
				}
			}
			sql += ") VALUES ('" + ec.getMidFull() + "','" + ec.getMidPer() + "','" + ec.getFinalFull() + "','"
					+ ec.getFinalPer() + "','" + ec.getScoreAmount() + "',";
			for (int i = 0; i < ec.getScoreAmount(); i++) {
				int scoreFull = ec.getScore()[i];
				int scorePer = ec.getScorePer()[i];
				sql += "'" + scoreFull + "','" + scorePer + "'";
				if (i < ec.getScoreAmount() - 1) {
					sql += ",";
				}
			}
			sql += ")";
			return !st.execute(sql);
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Database Error.!!!" + e.getMessage(), "ERROR",
					JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}

	public static boolean addClassListToDB(ClassList cl, int subjectId) {
		try {
			Connection con = ConnectMgnt.getConnect();
			Statement st = con.createStatement();
			int fail = 0;
			for (Student s : cl.getClassList()) {
				String name = s.getName();
				String id = s.getId();
				String email = s.getEmail();
				String sql = "INSERT INTO CLASS_LIST (USER_ID,NAME,EMAIL,SUBJECT_ID) VALUES ('" + id + "','" + name
						+ "','" + email + "','" + subjectId + "')";
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

	public static boolean addExamResultToDB(ClassList cl, int subjectId, int scoreAmount) {
		try {
			Connection con = ConnectMgnt.getConnect();
			Statement st = con.createStatement();
			int fail = 0;
			for (Student s : cl.getClassList()) {
				String id = s.getId();
				String sql = "INSERT INTO SCORE_LIST (USER_ID,SUBJECT_ID,STATUS,GRADE,SCORE_MID,SCORE_FINAL,";
				for (int i = 0; i < scoreAmount; i++) {
					sql += "SCORE_" + (i + 1);
					if (i < scoreAmount - 1) {
						sql += ",";
					}
				}
				sql += ") VALUES ('" + id + "','" + subjectId + "','N','-','-2','-2',";
				for (int i = 0; i < scoreAmount; i++) {
					sql += "'-2'";
					if (i < scoreAmount - 1) {
						sql += ",";
					}
				}
				sql += ")";
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

	public static boolean addEmailToClassList(EmailList el, ClassList cl) {
		for (Student st : cl.getClassList()) {
			String email = el.list.get(st.getId());
			if (email == null) {
				JOptionPane.showMessageDialog(null, st.getId() + " ไม่มี email", "ERROR", JOptionPane.ERROR_MESSAGE);
				return false;
			}
			st.setEmail(email);
		}
		return true;
	}

	public static boolean checkSameSubject(String code, String section, String semester, String year) {
		String sql = "select * from SUBJECTS_LIST Where CODE = '" + code + "' AND SECTION = '" + section
				+ "' AND SEMESTER = '" + semester + "' AND YEAR = '" + year + "'";
		try {
			Connection con = ConnectMgnt.getConnect();
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(sql);
			if (rs.next()) {
				return true;
			}
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Database Error.!!!" + e.getMessage(), "ERROR",
					JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}

	public static boolean addSubject(Subject sub) {
		sub.setId(getRowSubject() + 1);
		sub.getExamCri().setId(getRowExamCri() + 1);
		sub.getGradeCri().setId(getRowGradingCri() + 1);
		if (SubjectMgnt.checkSameSubject(sub.getCode(), sub.getSection(), sub.getSemester(), sub.getYear())) {
			JOptionPane.showMessageDialog(null, "มีวิชา " + sub.getCode() + " section นี้อยู่แล้วในเทอมนี้", "ERROR",
					JOptionPane.ERROR_MESSAGE);
			return false;
		}
		String sql = "INSERT INTO SUBJECTS_LIST (NAME,NAME_ENG,CODE,SECTION,SEMESTER,YEAR,OWNER_USER,GRADING_CRI_ID,EXAM_CRI_ID) VALUES ('"
				+ sub.getNameThai() + "','" + sub.getNameEng() + "','" + sub.getCode() + "','" + sub.getSection()
				+ "','" + sub.getSemester() + "','" + sub.getYear() + "','" + sub.getOwnerUser() + "','"
				+ sub.getGradeCri().getId() + "','" + sub.getExamCri().getId() + "')";
		try {
			Connection con = ConnectMgnt.getConnect();
			Statement st = con.createStatement();
			boolean ex = !st.execute(sql);
			if (ex) {
				int error = 0;
				if (!SubjectMgnt.addClassListToDB(sub.getClassList(), sub.getId())) {
					JOptionPane.showMessageDialog(null, "ไม่สามารถเพิ่มรายชื่อใน class list เข้าสู่ database ได้",
							"ERROR", JOptionPane.ERROR_MESSAGE);
					error++;
				}
				if (!SubjectMgnt.addExamCriToDB(sub.getExamCri())) {
					JOptionPane.showMessageDialog(null, "ไม่สามารถเพิ่มสัดส่วนะแนนเข้าสู่ database ได้", "ERROR",
							JOptionPane.ERROR_MESSAGE);
					error++;
				}
				if (!SubjectMgnt.addExamResultToDB(sub.getClassList(), sub.getId(),
						sub.getExamCri().getScoreAmount())) {
					JOptionPane.showMessageDialog(null, "ไม่สามารถเพิ่ม ExamResult เข้าสู่ database ได้", "ERROR",
							JOptionPane.ERROR_MESSAGE);
					error++;
				}
				if (!SubjectMgnt.addGradingCriteriaToDB(sub.getGradeCri())) {
					JOptionPane.showMessageDialog(null, "ไม่สามารถเพิ่มเกณฑ์การตัดเกรดเข้าสู่ database ได้", "ERROR",
							JOptionPane.ERROR_MESSAGE);
					error++;
				}
				if (error == 0) {
					return true;
				}
			}
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Database Error.!!!" + e.getMessage(), "ERROR",
					JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}

	public static int getRowSubject() {
		String sql = "select count(*) FROM SUBJECTS_LIST";
		Connection con = ConnectMgnt.getConnect();
		Statement st;
		try {
			st = con.createStatement();
			ResultSet rs = st.executeQuery(sql);
			int i = -1;
			if (rs.next()) {
				i = rs.getInt(1);
			}
			return i;
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Database Error.!!!" + e.getMessage(), "ERROR",
					JOptionPane.ERROR_MESSAGE);
		}
		return -1;
	}

	public static int getRowExamCri() {
		String sql = "select count(*) FROM EXAM_CRITERIA_LIST";
		Connection con = ConnectMgnt.getConnect();
		Statement st;
		try {
			st = con.createStatement();
			ResultSet rs = st.executeQuery(sql);
			int i = -1;
			if (rs.next()) {
				i = rs.getInt(1);
			}
			return i;
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Database Error.!!!" + e.getMessage(), "ERROR",
					JOptionPane.ERROR_MESSAGE);
		}
		return -1;
	}

	public static int getRowGradingCri() {
		String sql = "select count(*) FROM GRADING_LIST";
		Connection con = ConnectMgnt.getConnect();
		Statement st;
		try {
			st = con.createStatement();
			ResultSet rs = st.executeQuery(sql);
			int i = -1;
			if (rs.next()) {
				i = rs.getInt(1);
			}
			return i;
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Database Error.!!!" + e.getMessage(), "ERROR",
					JOptionPane.ERROR_MESSAGE);
		}
		return -1;
	}

	public static int getRowClassList() {
		String sql = "select count(*) FROM CLASS_LIST";
		Connection con = ConnectMgnt.getConnect();
		Statement st;
		try {
			st = con.createStatement();
			ResultSet rs = st.executeQuery(sql);
			int i = -1;
			if (rs.next()) {
				i = rs.getInt(1);
			}
			return i;
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Database Error.!!!" + e.getMessage(), "ERROR",
					JOptionPane.ERROR_MESSAGE);
		}
		return -1;
	}
}
