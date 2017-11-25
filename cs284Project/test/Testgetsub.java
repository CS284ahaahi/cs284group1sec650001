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
	ExamResult ex;
	GradingCriteria g;
	@Before
	public void setUp() throws Exception {
		us = new User("5909650029", "5909650029", "12345678", "Potsathon", "Treewattanawong",
				"potsathon20@gmail.com", "PROFESSOR");
		ex = new  ExamResult(1);
		ex.addStudentResult(new StudentResult(1, "5909650219",25.2, 50.5, new double[] {10,10,10,10,10},"a", "N"));
		g = new GradingCriteria(1,80,55,54,52,51,50,45);
		s = new Subject(1,"«‘»«°√√¡´ÕøµÏ·«√Ï‡∫◊ÈÕßµÈπ","Intro. to Software Engineering","CS284", "650001", "owner", "1", "2560", null, null, new GradingCriteria(1,80,75,70,65,60,55,50),null, null);
	}
	@After
	public void teardown()
	{
		us = null;
		GradingCriteria gafter;
		try {
			gafter = new GradingCriteria(1, 80, 75,70,65,60,55,50);
			SubjectMgnt.editGradingCriteria(gafter,s);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
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
		assertTrue(SubjectMgnt.getGradingCriBySubjectID(1).getBp()==55);
		assertTrue(SubjectMgnt.getGradingCriBySubjectID(1).getB()==54);
		assertTrue(SubjectMgnt.getGradingCriBySubjectID(1).getCp()==52);
		assertTrue(SubjectMgnt.getGradingCriBySubjectID(1).getC()==51);
		assertTrue(SubjectMgnt.getGradingCriBySubjectID(1).getDp()==50);
		assertTrue(SubjectMgnt.getGradingCriBySubjectID(1).getD()==45);
	}
	@Test
	public void testEditexamresult()
	{
		assertTrue("can t edit",SubjectMgnt.editExamResult(ex));
	}
	@Test
	public void testeditfromdata()
	{
		ExamResult ex2 =SubjectMgnt.getExamResultBySubjectID(1, 5);
		StudentResult sr =ex2.getById("5909650219");
		StudentResult srDemo = ex.getById("5909650219");
		assertEquals(sr.getID(), srDemo.getID());
		assertEquals(sr.getIDStudent(),srDemo.getIDStudent());
		assertEquals(sr.getScoreAmount(),srDemo.getScoreAmount());
		assertEquals(sr.getStatus(),srDemo.getStatus());
		for (int i = 0; i < 5; i++) {
			assertTrue("fail fuck",sr.getScoreByIndex(i)==srDemo.getScoreByIndex(i));	
		}
		assertTrue(sr.getMidScore()==srDemo.getMidScore());
		assertTrue(sr.getFinalScore()==srDemo.getFinalScore());
		assertArrayEquals(sr.getScore(),srDemo.getScore(),5);
	}
	@Test
	public void testEditgradingciteria()
	{
		assertTrue(SubjectMgnt.editGradingCriteria(g,s));
	}
	@Test
	public void checkEditgradingciteria() throws Exception
	{
		GradingCriteria gchange = new GradingCriteria(1, 60, 55, 45, 44, 43, 42, 41);
		SubjectMgnt.editGradingCriteria(gchange,s);
		assertTrue(SubjectMgnt.getGradingCriBySubjectID(1).getA()==60);
		assertTrue(SubjectMgnt.getGradingCriBySubjectID(1).getBp()==55);
		assertTrue(SubjectMgnt.getGradingCriBySubjectID(1).getB()==45);
		assertTrue(SubjectMgnt.getGradingCriBySubjectID(1).getCp()==44);
		assertTrue(SubjectMgnt.getGradingCriBySubjectID(1).getC()==43);
		assertTrue(SubjectMgnt.getGradingCriBySubjectID(1).getDp()==42);
		assertTrue(SubjectMgnt.getGradingCriBySubjectID(1).getD()==41);
	}
	
}
