import static org.junit.Assert.*;

import org.junit.Test;

import Controller.SubjectMgnt;
import Model.GradingCriteria;

public class Testadd {

	@Test
	public void  testaddgrading()
	{
		try {
			GradingCriteria gtest2 = new GradingCriteria(1,80,75,70,65,60,55,50);
			assertNotNull(SubjectMgnt.addGradingCriteriaToDB(gtest2));
			assertTrue(SubjectMgnt.getGradingCriBySubjectID(1).getA()==80);
			assertTrue(SubjectMgnt.getGradingCriBySubjectID(1).getBp()==75);
			assertTrue(SubjectMgnt.getGradingCriBySubjectID(1).getB()==70);
			assertTrue(SubjectMgnt.getGradingCriBySubjectID(1).getCp()==65);
			assertTrue(SubjectMgnt.getGradingCriBySubjectID(1).getC()==60);
			assertTrue(SubjectMgnt.getGradingCriBySubjectID(1).getDp()==55);
			assertTrue(SubjectMgnt.getGradingCriBySubjectID(1).getD()==50);
				
		} catch (Exception e) {
			// TODO Auto-generated catch block
			fail("error");
		}
	}
	@Test
	public void testaddgrad2()
	{
		try {
			GradingCriteria gtest2 = new GradingCriteria(1,-80,-75,-70,-65,-60,-55,-50);
			assertNotNull(SubjectMgnt.addGradingCriteriaToDB(gtest2));
			fail("can input minus grade");			
		} catch (Exception e) {
			//success
		}
	}
	@Test
	public void testaddgrad3()
	{
		try {
			GradingCriteria gtest2 = new GradingCriteria(1,80,75,70,65,56,76,70);
			assertNotNull(SubjectMgnt.addGradingCriteriaToDB(gtest2));
			fail("can input grade not");
		}catch (Exception e) {
			// TODO: handle exception
		}
	}
}
