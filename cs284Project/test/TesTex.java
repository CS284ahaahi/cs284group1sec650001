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
	 s=new Subject("���ǡ����Ϳ���������ͧ��", "Intro. to Software Engineering","CS284", "650001", "1","1", "2560", null,new GradingCriteria("99,75,70,65,60,55,50"), null);
	}
	@After
	public void tearDown() throws Exception {
	s=null;
	}
	@Test
	public void testexport() {
		
		assertTrue("error cant export",FileMgnt.exportExcelGrade(s.getTableName()));
	}
	@Test
	public void testexportandpresscancel() {
		
		assertFalse("error cant cancel",FileMgnt.exportExcelGrade(s.getTableName()));
	}

}