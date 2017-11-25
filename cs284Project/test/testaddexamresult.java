import static org.junit.Assert.*;

import org.junit.Test;

import Controller.SubjectMgnt;
import Model.ExamCriteria;

public class testaddexamresult {

	@Test
	public void test() {

		ExamCriteria ec = new ExamCriteria(0, 5);
		ec.setFinalFull(70);
		ec.setFinalPer(50);
		ec.setMidFull(50);
		ec.setMidPer(25);
		ec.setScore(new int[] {5,5,5,5,5});
		ec.setScorePer(new int[] {5,5,5,5,5});
		assertFalse(SubjectMgnt.checkExamCri(ec));
		
	}
	@Test
	public void test2() {

		ExamCriteria ec = new ExamCriteria(0, 5);
		ec.setFinalFull(70);
		ec.setFinalPer(-50);
		ec.setMidFull(50);
		ec.setMidPer(-25);
		ec.setScore(new int[] {5,5,5,5,5});
		ec.setScorePer(new int[] {-5,5,5,5,5});
		assertFalse(SubjectMgnt.checkExamCri(ec));
		assertTrue(SubjectMgnt.addExamCriToDB(ec));
	}
	@Test
	public void test3() {

		ExamCriteria ec = new ExamCriteria(0, 5);
		ec.setFinalFull(70);
		ec.setFinalPer(10);
		ec.setMidFull(50);
		ec.setMidPer(15);
		ec.setScore(new int[] {5,5,5,5,5});
		ec.setScorePer(new int[] {5,5,5,5,5});
		assertFalse(SubjectMgnt.checkExamCri(ec));		
		assertTrue(SubjectMgnt.addExamCriToDB(ec));
	}

	
	
	
}
