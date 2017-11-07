import static org.junit.Assert.*;

import javax.swing.JOptionPane;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import Controller.UserMgnt;
import Model.User;

public class test {
	UserMgnt us;
	@Before
	public void setUp() throws Exception {
		us= new UserMgnt();
	}
	@After
	public void tearDown() throws Exception {
		us = null;
	}
	@Test
	public void testusernamecorrect() {
		try
		{
			User s = us.checkUserPass("5909650029", "12345678");
			assertNotNull(s);
			User trueUser = new User("5909650029", "5909650029", "12345678", "Potsathon", "Treewattanawong", "potsathon20@gmail.com", "PROFESSOR");
			assertEquals(s.getFirstName(),trueUser.getFirstName());
			assertEquals(s.getLastName(),trueUser.getLastName());
			assertEquals(s.getUserID(),trueUser.getUserID());
			assertEquals(s.getPassWord(),trueUser.getPassWord());
			assertEquals(s.getEmail(),trueUser.getEmail());
			assertEquals(s.getRank(),trueUser.getRank());
			assertEquals(s.getClass(),trueUser.getClass());
			assertEquals(s.getUserName(),trueUser.getUserName());

		}catch(Exception e)
		{
			fail("error username pass correct");
		}
	}
	
	@Test
	public void testUsernamecorrpassnull()
	{
		try {
			User s = us.checkUserPass("5909650029", "");
			assertNull(s);
		} catch (Exception e) {
			fail("error username pass null!!");
		}
	}
	@Test
	public void testUsernamecorrpasswrong()
	{
		try {
			User s = us.checkUserPass("5909650029", "asdadgadfaddg");
			assertNull(s);
		} catch (Exception e) {
			fail("error username pass null");
		}
	}
	@Test
	public void testUsernamepasswrong()
	{
		try {
			User s = us.checkUserPass("59096500299", "asdadgadfaddg");
			assertNull(s);
		} catch (Exception e) {
			fail("error try to put username pass wrong");
		}
	}
	@Test
	public void testUsernamewrongpasscorr()
	{
		try {
			User s = us.checkUserPass("59096dsf500299", "12345678");
			assertNull(s);
		} catch (Exception e) {
			fail("error try to put username wrong pass correct");
		}
	}
	@Test
	public void testUsernameallnull()
	{
		try {
			User s = us.checkUserPass("", "");
			assertNull(s);
		} catch (Exception e) {
			fail("error try to put username pass null");
		}
	}
	@Test
	public void testUsernamenullpasscorr()
	{
		try {
			User s = us.checkUserPass("", "12345678");
			assertNull(s);
		} catch (Exception e) {
			fail("error try to put username null pass corr");
		}
	}
	@Test
	public void testUsernamenullpasswrong()
	{
		try {
			User s = us.checkUserPass("", "123456789");
			assertNull(s);
		} catch (Exception e) {
			fail("error try to put username null pass wrong");
		}
	}
	@Test
	public void testUsernamewrongpassnull()
	{
		try {
			User s = us.checkUserPass("dsfd", "");
			assertNull(s);
		} catch (Exception e) {
			fail("error try to put username wrong pass null");
		}
	}
	@Test
	public void testRankcorrect()
	{
		try {
			
			User s = us.checkUserPass("5909650185", "123456");
			assertNotNull(s);
			assertEquals(s.getRank(),"STUDENT");
		} catch (Exception e) {
			fail("error try to put username null pass corr!");
		}
	}
	@Test
	public void testRankcorrect3()
	{
		try {
			
			User s = us.checkUserPass("5909650029", "12345678");
			assertNotNull(s);
			assertEquals(s.getRank(),"PROFESSOR");
		} catch (Exception e) {
			fail("error try to put username null pass corr");
		}
	}
	

}
