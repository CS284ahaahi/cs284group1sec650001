import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import Controller.UserMgnt;
import Model.User;

public class TestUser {
	User trueUser;

	@Before
	public void setUp() throws Exception {
		trueUser = new User("5909650029", "5909650029", "12345678", "Potsathon", "Treewattanawong",
				"potsathon20@gmail.com", "PROFESSOR");
	}

	@After
	public void tearDown() throws Exception {
		trueUser = null;
	}

	@Test
	public void testUsernamePasswordCorrect() {
		User s = UserMgnt.checkUserPass("5909650029", "12345678");
		assertNotNull(s);
		assertEquals("Error Username not Equal", s.getUserName(), trueUser.getUserName());
		assertEquals("Error ID not Equal", s.getUserID(), trueUser.getUserID());
		assertEquals("Error Password not Equal", s.getPassWord(), trueUser.getPassWord());
		assertEquals("Error Firstname not Equal", s.getFirstName(), trueUser.getFirstName());
		assertEquals("Error Lastname not Equal", s.getLastName(), trueUser.getLastName());
		assertEquals("Error Email not Equal", s.getEmail(), trueUser.getEmail());
		assertEquals("Error Rank not Equal", s.getRank(), trueUser.getRank());
		
	}
	@Test
	public void testUsernameCorrPassBlack() {
		User s = UserMgnt.checkUserPass("5909650029", "");
		assertNull("unknown user must be NULL", s);
	}
	@Test
	public void testUsernameCorrPassWrong() {
		User s = UserMgnt.checkUserPass("5909650029", "asdadgadfaddg");
		assertNull("unknown user must be NULL", s);
	}

	@Test
	public void testUsernamePassWrong() {
		User s = UserMgnt.checkUserPass("59096500299", "asdadgadfaddg");
		assertNull("unknown user must be NULL", s);
	}

	@Test
	public void testUsernameWrongPassCorr() {
		User s = UserMgnt.checkUserPass("59096dsf500299", "12345678");
		assertNull("unknown user must be NULL", s);
	}

	@Test
	public void testUsernamePasswordBlank() {
		User s = UserMgnt.checkUserPass("", "");
		assertNull("unknown user must be NULL", s);
	}

	@Test
	public void testUsernameBlankPassCorr() {
		User s = UserMgnt.checkUserPass("", "12345678");
		assertNull("unknown user must be NULL", s);
	}

	@Test
	public void testUsernameBlankPassWrong() {
		User s = UserMgnt.checkUserPass("", "123456789");
		assertNull("unknown user must be NULL", s);
	}

	@Test
	public void testUsernamewrongpassnull() {
		User s = UserMgnt.checkUserPass("dsfd", "");
		assertNull("unknown user must be NULL", s);
	}

	@Test
	public void testRankcorrect() {
		User s = UserMgnt.checkUserPass("5909650185", "123456");
		assertNotNull("User must not Null", s);
		assertEquals("Error rank not equal", s.getRank(), "ADMIN");
	}

	@Test
	public void testRankcorrect3() {
		User s = UserMgnt.checkUserPass("5909650029", "12345678");
		assertNotNull("User must not Null", s);
		assertEquals("Error rank not equal", s.getRank(), trueUser.getRank());
	}

}
