import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import Controller.FileMgnt;
import Model.GradingCriteria;
import Model.Subject;
import Model.User;

public class TesTex {
	Subject s;

	@Before
	public void setUp() throws Exception {
		s = new Subject("วิศวกรรมซอฟต์แวร์เบื้องต้น", "Intro. to Software Engineering", "CS284", "650001", "Owner", "1",
				"2560", null, null, new GradingCriteria("99,75,70,65,60,55,50"), null, null);
	}

	@After
	public void tearDown() throws Exception {
		s = null;
	}

	@Test
	public void testexport() {

		assertTrue("error cant export", FileMgnt.exportGrade(s.getTableName()));
	}

	@Test
	public void testexportandpresscancel() {

		assertFalse("error cant cancel", FileMgnt.exportGrade(s.getTableName()));
	}

}
