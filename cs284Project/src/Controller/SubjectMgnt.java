package Controller;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

import Model.ClassList;
import Model.ExamCriteria;
import Model.GradingCriteria;
import Model.Student;
import Model.StudentResult;
import Model.Subject;
import Model.User;

public class SubjectMgnt {

	public static ArrayList<StudentResult> checkGrading(String tableName) { // return นักศึกษาที่คะแนนยังไม่ครบ
		ArrayList<StudentResult> noneGrade = new ArrayList<>();
		String sql = "select * from " + tableName + " Where GRADE like '%xx%'";
		ResultSet rs;
		try {
			Connection con = ConnectMgnt.getConnect();
			Statement st = con.createStatement();
			rs = st.executeQuery(sql);
			while (rs.next()) {
				StudentResult str = new StudentResult(rs.getString("ID_STUDENT"), 0);
				noneGrade.add(str);
			}
			if(noneGrade.size()>0) {
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
			String sql = "select * from SUBJECTS_LIST Where S_OWNER_USER like '%" + user.getUserName() + "%'";
			ResultSet rs;
			try {
				Connection con = ConnectMgnt.getConnect();
				Statement st = con.createStatement();
				rs = st.executeQuery(sql);
				while (rs.next()) {
					String nameThai = rs.getString("S_NAME");
					String nameEng = rs.getString("S_NAME_ENG");
					String code = rs.getString("S_CODE");
					String section = rs.getString("S_SECTION");
					String ownerUser = rs.getString("S_OWNER_USER");
					String semester = rs.getString("S_SEMESTER");
					String year = rs.getString("S_YEAR");
					// System.out.println(nameThai);
					ClassList classList = SubjectMgnt.getClassList(rs.getString("S_CLASSLIST_TABLE"));
					GradingCriteria gradeCri = new GradingCriteria(rs.getString("GRADING_CRITERIA"));
					// System.out.println(gradeCri.getA());
					ExamCriteria examCri = new ExamCriteria(rs.getString("EXAM_CRITERIA"));
					Subject sub = new Subject(nameThai, nameEng, code, section, ownerUser, semester, year, classList,
							gradeCri, examCri);
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

	public static boolean editGradingCriteria(GradingCriteria grade, Subject sub) {
		String sql = "UPDATE SUBJECTS_LIST " + "SET GRADING_CRITERIA = '" + grade.toString() + "' "
				+ " WHERE S_CLASSLIST_TABLE = '" + sub.getTableName() + "'";
		try {
			Connection con = ConnectMgnt.getConnect();
			Statement st = con.createStatement();
			return !st.execute(sql);
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Database Error.!!!"+e.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}

	public static ClassList getClassList(String tableName) {
		String sql = "select * from " + tableName;
		ResultSet rs;
		try {
			ClassList classList = new ClassList();
			Connection con = ConnectMgnt.getConnect();
			Statement st = con.createStatement();
			rs = st.executeQuery(sql);
			while (rs.next()) {
				String id = rs.getString("ID_STUDENT");
				String name = rs.getString("FIRST_NAME") + " " + rs.getString("LAST_NAME");
				Student stu = new Student(id, name);
				classList.add(stu);
			}
			return classList;
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Database Error.!!!", "ERROR", JOptionPane.ERROR_MESSAGE);
		}
		return null;
	}
}
