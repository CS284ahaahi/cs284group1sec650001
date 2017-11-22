package Model;

import java.util.ArrayList;

public class ExamResult {
	private ArrayList<StudentResult> list;
	public ExamResult() {
		this.list = new ArrayList<>();
	}

	public boolean addStudentResult(StudentResult stuRes) {
		return this.addStudentResult(stuRes);
	}

	public StudentResult get(int index) {
		return this.list.get(index);
	}

	public StudentResult getById(String id) {
		for (StudentResult studentResult : list) {
			if (studentResult.getId().equals(id)) {
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
}
