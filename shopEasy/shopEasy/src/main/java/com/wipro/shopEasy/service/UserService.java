package com.wipro.shopEasy.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.wipro.shopEasy.model.User;

@Service
public interface UserService {
	
	public User registerUser(User user);
	
	public User getUserByEmail(String email);
	
	public List<User> getAllUsers();

}
