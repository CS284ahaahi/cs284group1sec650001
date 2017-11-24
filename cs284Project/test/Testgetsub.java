import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import Controller.SubjectMgnt;
import Model.ExamResult;
import Model.GradingCriteria;
import Model.StudentResult;
import Model.Subject;
import Model.User;

public class Testgetsub {
	Subject s ;
	User us;
	SubjectMgnt se;
	@Before
	public void setUp() throws Exception {
		us = new User("5909650029", "5909650029", "12345678", "Potsathon", "Treewattanawong",
				"potsathon20@gmail.com", "PROFESSOR");
		
	}
	@After
	public void teardown()
	{
		us = null;
	}
	@Test
	public void test() {
		assertNotNull(SubjectMgnt.getMySubject(us));
		assertEquals(SubjectMgnt.getMySubject(us).get(0).getNameEng(),"Intro. to Software Engineering");
	}
	@Test
	public void testgetgrade()
	{
		assertNotNull("fail it null",SubjectMgnt.getGradingCriBySubjectID(1));
		assertTrue(SubjectMgnt.getGradingCriBySubjectID(1).getA()==80);
		assertTrue(SubjectMgnt.getGradingCriBySubjectID(1).getBp()==75);
		assertTrue(SubjectMgnt.getGradingCriBySubjectID(1).getB()==70);
		assertTrue(SubjectMgnt.getGradingCriBySubjectID(1).getCp()==65);
		assertTrue(SubjectMgnt.getGradingCriBySubjectID(1).getC()==60);
		assertTrue(SubjectMgnt.getGradingCriBySubjectID(1).getDp()==55);
		assertTrue(SubjectMgnt.getGradingCriBySubjectID(1).getD()==50);
	}
}
