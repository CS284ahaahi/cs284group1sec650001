import static org.junit.Assert.*;

import org.junit.Test;

import Controller.SubjectMgnt;
import Model.ClassList;
import Model.ExamCriteria;
import Model.GradingCriteria;
import Model.Student;
import Model.Subject;
import Model.User;

public class Testaddsub {
	Subject s;
	User us;
	@Test
	public void testadd() throws Exception {
		ClassList cs =new ClassList();
		int row = SubjectMgnt.getRowClassList();
		cs.add(new Student(row++,"5909650158","pcn","pkak2@gmail.com"));
		cs.add(new Student(row++, "5909650029","pot","potsathon20@gmail.com"));
		us = new User("5909650158", "pcn","123456","pcn","h","pkak@gmail.com", "N");
		ExamCriteria ec = new ExamCriteria(0, 5);
		ec.setFinalFull(70);
		ec.setFinalPer(50);
		ec.setMidFull(50);
		ec.setMidPer(25);
		ec.setScore(new int[] {5,5,5,5,5});
		ec.setScorePer(new int[] {5,5,5,5,5});
		s = new Subject(2, "®’¬Ÿ‰Õ", "GUI", "cs211", "650004", "Owner", "1","2560", cs, null, new GradingCriteria(1,95,75,70,65,60,55,50), ec,null);
		assertTrue(SubjectMgnt.addSubject(s));
	}
	@Test
	public void testadd2() throws Exception {
		ClassList cs =new ClassList();
		int row = SubjectMgnt.getRowClassList();
		cs.add(new Student(row++,"5909650158","pcn","pkak2@gmail.com"));
		cs.add(new Student(row++, "5909650029","pot","potsathon20@gmail.com"));
		us = new User("5909650158", "pcn","123456","pcn","h","pkak@gmail.com", "N");
		ExamCriteria ec = new ExamCriteria(0, 5);
		ec.setFinalFull(70);
		ec.setFinalPer(50);
		ec.setMidFull(50);
		ec.setMidPer(25);
		ec.setScore(new int[] {5,5,5,5,5});
		ec.setScorePer(new int[] {5,5,5,5,5});
		s = new Subject(2, "®’¬Ÿ‰Õ", "GUI", "cs211", "650004", "Owner", "1","2560", cs, null, new GradingCriteria(1,95,75,70,65,60,55,50), ec,null);
		assertFalse(SubjectMgnt.addSubject(s));
	}
	
}
