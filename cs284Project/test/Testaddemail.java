

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import Controller.SubjectMgnt;
import Model.ClassList;
import Model.EmailList;
import Model.ExamResult;
import Model.GradingCriteria;
import Model.Student;
import Model.StudentResult;
import Model.Subject;
import Model.User;

public class Testaddemail {
	EmailList el;
	ClassList cl ;
	Subject s;
	ExamResult ex;
	@Before
	public void setUp() throws Exception {
	el =new EmailList();
	cl = new ClassList();
	cl.add(new Student(1,"5909650609", "j","potsathon20@gmail.com" ));
	el.addEmail("5909650609","potsathon20@gmail.com");
	ex = new  ExamResult(1);
	ex.addStudentResult(new StudentResult(1, "5909650609",25.2, 50.5, new double[] {10,10,10,10,10},"a", "N"));
	s = new Subject(1,"วิศวกรรมซอฟต์แวร์เบื้องต้น","Intro. to Software Engineering","CS284", "650001", "owner", "1", "2560", cl,ex, new GradingCriteria(1,80,75,70,65,60,55,50),null, null);
	}
	
	@Test
	public void test() {
		assertTrue(SubjectMgnt.addEmailToClassList(el, cl));
	}
	@Test
	public void testsentemail()
	{
		assertTrue(SubjectMgnt.sendEmailAll(s));
	}

}
