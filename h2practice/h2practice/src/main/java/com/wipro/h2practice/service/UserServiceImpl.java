package com.wipro.h2practice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.h2practice.dao.UserDao;
import com.wipro.h2practice.model.User;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;
	
	@Override
	public List<User> getAllUsers() {
		
		return userDao.findAll();
	}

	@Override
	public User addUser(User user) {
		return userDao.save(user);
	}

}
