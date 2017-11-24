import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import Controller.SubjectMgnt;
import Model.ExamResult;
import Model.GradingCriteria;
import Model.StudentResult;
import Model.Subject;

public class testcheckgrade {

	SubjectMgnt s = new  SubjectMgnt();
	
	@Before
	public void setUp() throws Exception {
		//s = new Subject(1, "วิศวกรรมซอฟต์แวร์เบื้องต้น", "Intro. to Software Engineering", "CS284", "650001", "Owner", "1","2560", null, null, new GradingCriteria(1,95,75,70,65,60,55,50), null,null);
	}
	
	@Test
	public void test() 
	{
		
		assertNotNull(SubjectMgnt.checkGrading(59));
	}

}
