package com.wipro.shopEasy.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.shopEasy.dao.UserDao;
import com.wipro.shopEasy.model.User;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	UserDao userDao;
	
	@Override
	public User registerUser(User user) {
		
		return userDao.save(user);
	}

	@Override
	public User getUserByEmail(String email) {
		
		return userDao.findByEmail(email);
	}

	@Override
	public List<User> getAllUsers() {
	
		return userDao.findAll();
	}

}
