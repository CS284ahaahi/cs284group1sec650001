package Model;

import java.util.ArrayList;

public class ClassList {
	private ArrayList<Student> list;

	public ClassList() {
		list = new ArrayList<>();
	}
	
	public boolean add(Student student) {
		return this.list.add(student);
	}

	public Student get(int index) {
		return list.get(index);
	}

	public ArrayList<Student> getClassList() {
		return this.list;
	}
}
