package Controller;

import java.util.ArrayList;

import Model.ClassList;
import Model.GradingCriteria;
import Model.StudentResult;
import Model.Subject;
import Model.User;

public class SubjectMgnt {

	public static ArrayList<StudentResult> checkGrading() { // return นักศึกษาที่คะแนนยังไม่ครบ
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
			for (Subject subject : mySub) {
				if (subject.getOwnerUser().equals(user.getUserName())) {
					mySub.add(subject);
				}
			}
			if (mySub.size() > 0) {
				return mySub;
			}
		}
		return null;
	}

	public static boolean editGradingCriteria(GradingCriteria grade, String tableName) {
		// Database
		return false;
	}

	public static ClassList getClassList(String tableName) {
		return null;
	}
}
