import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import Controller.FileMgnt;
import Model.ExamResult;
import Model.GradingCriteria;
import Model.StudentResult;
import Model.Subject;
import Model.User;

public class TesTex {
	Subject s;
	ExamResult ex ;
	@Before
	public void setUp() throws Exception {
		s = new Subject(1, "วิศวกรรมซอฟต์แวร์เบื้องต้น", "Intro. to Software Engineering", "CS284", "650001", "Owner", "1","2560", null, null, new GradingCriteria(1,95,75,70,65,60,55,50), null,null);
		ex = new  ExamResult(59);
		ex.addStudentResult(new StudentResult(5, "5909650029",25.2, 50.5, null,"a", "N"));
		ex.addStudentResult(new StudentResult(59, "5909650185",15, 55, null,"c", "W"));
	}

	@After
	public void tearDown() throws Exception {
		s = null;
		ex= null;
	}

	@Test
	public void testexport() {
		assertTrue("error cant export", FileMgnt.exportGrade(ex));
	}
	@Test
	public void testexcel()
	{
		assertTrue("error cant export", FileMgnt.exportGrade(ex));
	}
	@Test
	public void testexportandpresscancelexcel() {
		assertFalse("error cant cancel", FileMgnt.exportGrade(ex));
	}
	@Test
	public void testexportandpresscancel() {
		assertFalse("error cant cancel", FileMgnt.exportGrade(ex));
	}
}
