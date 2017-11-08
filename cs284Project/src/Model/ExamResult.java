package Model;

import java.util.ArrayList;

public class ExamResult {
	private Subject subj;
	private ArrayList<StudentResult> list;

	public ExamResult(Subject subj) {
		this.subj = subj;
		this.list = new ArrayList<>();
	}

	public boolean addStudentResult(StudentResult stuRes) {
		return this.addStudentResult(stuRes);
	}

	public StudentResult get(int index) {
		return this.list.get(index);
	}

	public StudentResult getById(int id) {
		return null;
	}

	public ArrayList<StudentResult> getList() {
		return list;
	}
}
