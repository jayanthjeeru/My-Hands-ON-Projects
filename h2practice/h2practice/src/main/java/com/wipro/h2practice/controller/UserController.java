package com.wipro.h2practice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.h2practice.model.User;
import com.wipro.h2practice.service.UserService;

@RestController
@RequestMapping("user")
public class UserController {

	@Autowired
	private UserService userService;
	
	@GetMapping
	public ResponseEntity<List<User>> getAllUsers(){
		
		return new ResponseEntity<List<User>>(userService.getAllUsers(),HttpStatus.FOUND);
	}
	
	@PostMapping
	public ResponseEntity<User> addUsers(@RequestBody User user){
		
		return new ResponseEntity<User>(userService.addUser(user),HttpStatus.CREATED);
	}
	
	
}
