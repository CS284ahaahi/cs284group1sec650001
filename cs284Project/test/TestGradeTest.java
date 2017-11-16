import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import Controller.SubjectMgnt;
import Model.GradingCriteria;
import Model.Subject;
import Model.User;

public class TestGradeTest {
	GradingCriteria g;
	Subject s ;
	@Test
	public void testeditrecordgrade()
	{
		g = new GradingCriteria("95,75,70,65,60,55,50");
		s = new Subject("วิศวกรรมซอฟต์แวร์เบื้องต้น", "Intro. to Software Engineering", "CS284", "650001", "Owner", "1","2560", null, null,g, null,null);
		assertTrue("error testnotcorrectgrade",SubjectMgnt.editGradingCriteria(g,s));
	}
	@Test
	public void testeditrecordgradedouble()
	{
		try {
		g = new GradingCriteria("80.5,75.2,70,65,60,55,50");
		s = new Subject("วิศวกรรมซอฟต์แวร์เบื้องต้น", "Intro. to Software Engineering", "CS284", "650001", "Owner", "1","2560", null, null,g, null,null);
		SubjectMgnt.editGradingCriteria(g,s);
		fail("Error");
		}
		catch(NumberFormatException e)
		{
			//success
		}
	}
	@Test
	public void testgrademinus()
	{
		try {
			g = new GradingCriteria("-80,-75,-70,-65,-60,-55,-50");
			s = new Subject("วิศวกรรมซอฟต์แวร์เบื้องต้น", "Intro. to Software Engineering", "CS284", "650001", "Owner", "1","2560", null, null,g, null,null);
			SubjectMgnt.editGradingCriteria(g,s);
			
		} catch (Exception e) {
			fail("fail");
			
		}
	}
	@Test
	public void testnoinputgrade()
	{
		try {
			g = new GradingCriteria("");
			s = new Subject("วิศวกรรมซอฟต์แวร์เบื้องต้น", "Intro. to Software Engineering", "CS284", "650001", "Owner", "1","2560", null, null,g, null,null);
			SubjectMgnt.editGradingCriteria(g,s);
			fail("Error");
		} catch (Exception e) {
			// success
		}
	}
/*	@Test
	public void testsomeinputgrade()
	{
		try {
		g = new GradingCriteria("80,70,65,60,60,55,");
		s = new Subject("วิศวกรรมซอฟต์แวร์เบื้องต้น", "Intro. to Software Engineering", "CS284", "650001", "Owner", "1","2560", null, null,g, null,null);
		SubjectMgnt.editGradingCriteria(g,s);
		fail("Error");
		} catch (Exception e) {
			// success
		}
	}*/

}

