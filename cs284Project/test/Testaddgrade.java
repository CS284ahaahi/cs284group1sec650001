import static org.junit.Assert.*;

import org.junit.Test;

import Controller.SubjectMgnt;
import Model.GradingCriteria;

public class Testaddgrade {

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
