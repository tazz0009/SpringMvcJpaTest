package com.tistory.tazz009.service;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.tistory.tazz009.model.User;

@RunWith(SpringJUnit4ClassRunner.class)  
@ContextConfiguration(locations="classpath:spring/applicationContext.xml")
public class UserServiceTest {

	@Autowired
	private UserService userService;
	
	@Test
	public void test001_saveUser() {
		User user1 = new User();
		user1.setUserId("tazz001");
		user1.setName("Á¤µµÀü");
		user1.setEmail("tazz001@gmail.com");
		user1.setPassword("123456");
		User saveUser = userService.saveUser(user1);
		
		System.out.println("saveUser : " + saveUser.toString());
	}
	
	@Test
	public void test002_getAllUsers() throws Exception {
		List<User> allUsers = userService.getAllUsers();
		for (User user : allUsers) {
			System.out.println("user : " + user.toString());
		}
	}
	
	@Test
	public void test003_getUser() throws Exception {
		User user1 = new User();
		user1.setUserId("tazz001");
		User getUser = userService.getUser(user1);
		
		System.out.println("getUser : " + getUser.toString());
	}

	@Test
	public void test004_updateUser() throws Exception {
		User user1 = new User();
		user1.setUserId("tazz001");
		User getUser = userService.getUser(user1);
		getUser.setEmail("tazz0011@gmail.com");
		User saveUser = userService.saveUser(getUser);

		System.out.println("saveUser : " + saveUser.toString());
	}
}
