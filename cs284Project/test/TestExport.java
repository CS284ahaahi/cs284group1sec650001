import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import Controller.FileMgnt;
import Model.Subject;
import Model.User;



public class TestExport {

	@Test
	public void testcanExportFile()
	{
			assertTrue(FileMgnt.exportExcelGrade("SJ_CS284_650001_1_2560"));
	}
	@Test
	public void testExporttocancel()
	{
			assertFalse(FileMgnt.exportExcelGrade("SJ_CS284_650001_1_2560"));
	}
	/*@Test
	public void teststudentExporttocancel()
	{
		User student=new User("5909650029", "5909650029", "12345678", "Potsathon", "Treewattanawong","potsathon20@gmail.com", "PROFESSOR");
		Subject s = new Subject("SE INTRO", "CS284", "650001", "Potsathon", "1", "2560");
		assertFalse(fm.exportExcelGrade(s,student));
	}*/
	
}
