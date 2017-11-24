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
		 
		try {
			g = new GradingCriteria(1,80,75,70,65,60,55,50);
			s = new Subject(1,"วิศวกรรมซอฟต์แวร์เบื้องต้น","Intro. to Software Engineering","CS284", "650001", "owner", "1", "2560", null, null, new GradingCriteria(1,80,75,70,65,60,55,50),null, null);
			SubjectMgnt.editGradingCriteria(g,s);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			fail("fail");
		}
		
	}
	@Test
	public void testgrademinus()
	{
		try {
			g = new GradingCriteria(1,-80,-75,-70,-65,-60,-55,-50);
			s = new Subject(1,"วิศวกรรมซอฟต์แวร์เบื้องต้น","Intro. to Software Engineering","CS284", "650001", "owner", "1", "2560", null, null, new GradingCriteria(1,-80,-75,-70,-65,-60,-55,-50),null, null);
			SubjectMgnt.editGradingCriteria(g,s);
			fail("grademinus");		
		} catch (Exception e) {
			//success
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

