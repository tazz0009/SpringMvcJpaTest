package com.tistory.tazz009.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tistory.tazz009.dao.UserDao;
import com.tistory.tazz009.model.User;

@Service
public class UserService {

	@Autowired
	private UserDao userDao;
	
	@Transactional
	public User saveUser(User user) {
		return userDao.save(user);
	}
	
	@Transactional
	public List<User> getAllUsers() {
		return (List<User>) userDao.findAll();
	}

	@Transactional
	public User getUser(User user) {
		return userDao.findOne(user.getUserId());
	}
	
}
