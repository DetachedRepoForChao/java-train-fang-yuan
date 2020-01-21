package com.mercury.daos;

import static org.junit.Assert.fail;

import java.util.List;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import com.mercury.beans.User;

import junit.framework.Assert;

public class TestUserDao {
	
	private UserDao ud;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		// will be invoked before each test case.
		ud = new UserDao();
		System.out.println("********");
	}

	@Ignore
	public void test() {
		fail("Not yet implemented");
	}
	
	
	@Ignore
	public void testGetAll() {
		
		List<User> users = ud.getAll();
		Assert.assertEquals(2, users.size());
		
		User gama = null;
		for(User u : users) {
			if("Gama".equals(u.getName())) {
				gama = u;
				break;
			}
		}
		
		Assert.assertNotNull(gama);
		Assert.assertEquals(12, gama.getAge());
	}

	@Test
	public void testGetUserByName() {
		String name = "Voodoo";
		User vd = ud.getByName(name);
		Assert.assertEquals(1, vd.getAge());
		
		String name2 = "x";
		User x = ud.getByName(name2);
		Assert.assertNull(x);
	}
	
	@Test
	public void testSave() {
		String name = "Raul";
		User raul = new User(name, 35);
		ud.save(raul);
		
		User savedRaul = ud.getByName(name);
		Assert.assertEquals(35, savedRaul.getAge());
	}
}
