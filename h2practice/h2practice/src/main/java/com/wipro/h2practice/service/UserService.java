package com.wipro.h2practice.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.wipro.h2practice.model.User;

@Service
public interface UserService {
	
	public List<User> getAllUsers();
	
	public User addUser(User user);

}
