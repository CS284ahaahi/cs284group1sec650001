import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import Controller.SubjectMgnt;
import Model.ExamCriteria;
import Model.ExamResult;
import Model.GradingCriteria;
import Model.StudentResult;
import Model.Subject;

public class testcheckgrade {

	Subject s;
	ExamResult er;
	ExamCriteria ec;
	@Before
	public void setUp() throws Exception {
		er = new ExamResult(1);
		er.addStudentResult(new StudentResult(1,"5909650029",20, 35,new double[] {5,5,5,5,5},"-","N"));
		er.addStudentResult(new StudentResult(1,"5909650185", 0, 0,new double[] {0,0,0,0,0},"-", "W"));
		er.addStudentResult(new StudentResult(1,"5909650219", 25, 40,new double[] {5,5,5,5,5},"-", "N"));
		er.addStudentResult(new StudentResult(1,"5909650185", 20, 20,new double[] {5,5,5,5,5},"-", "N"));
		er.addStudentResult(new StudentResult(1,"5909650185", 0, 0,new double[] {0,0,0,0,0},"-", "W"));
		ec = new ExamCriteria(0, 5);
		ec.setFinalFull(50);
		ec.setScorePer(new int[] {5,5,5,5,5 });
		ec.setScore(new int[] {5,5,5,5,5 });
		ec.setFinalPer(50);
		ec.setMidPer(25);
		ec.setMidFull(20);
		s = new Subject(1, "วิศวกรรมซอฟต์แวร์เบื้องต้น", "Intro. to Software Engineering", "CS284", "650001", "Owner", "1","2560", null, er, new GradingCriteria(1,95,75,70,65,60,55,50), ec,null);
	}
	
	@Test
	public void test() 
	{
		assertTrue(SubjectMgnt.gradingExam(s));
	}

}
