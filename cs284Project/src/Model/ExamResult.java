package Model;

import java.util.ArrayList;

public class ExamResult {
	private ArrayList<StudentResult> list;
	private int subjectID;

	public ExamResult(int subjectID) {
		this.subjectID = subjectID;
		this.list = new ArrayList<>();
	}

	public boolean addStudentResult(StudentResult stuRes) {
		return this.list.add(stuRes);
	}

	public StudentResult getById(String id) {
		for (StudentResult studentResult : list) {
			if (studentResult.getIDStudent().equals(id)) {
				return studentResult;
			}
		}
		return null;
	}

	public ArrayList<StudentResult> getList() {
		return list;
	}

	public int getSize() {
		return this.list.size();
	}

	public int getSubjectID() {
		return subjectID;
	}

	public void setSubjectID(int subjectID) {
		this.subjectID = subjectID;
	}

}
