package com.wipro.shopEasy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.shopEasy.model.User;
import com.wipro.shopEasy.service.UserService;

@RestController
@RequestMapping("user")
@CrossOrigin
public class UserController {
	
	@Autowired
	UserService userService;

	@PostMapping("registeruser")
	public ResponseEntity<User> registerUser(@RequestBody User user) {
		
		return new ResponseEntity<User>(userService.registerUser(user),HttpStatus.CREATED);
		
	}
	
	@GetMapping("getuserbyemail")
	public ResponseEntity<?> getUserByEmail(@RequestParam String email){
		
	
		if(userService.getUserByEmail(email)!=null)
			return new ResponseEntity<User>(userService.getUserByEmail(email),HttpStatus.OK);
		else
			return new ResponseEntity<String>("User Not Found",HttpStatus.NOT_FOUND);

	}
	
	@GetMapping("getallusers")
	public ResponseEntity<List<User>> getAllUsers(){
		
		return new ResponseEntity<List<User>>(userService.getAllUsers(),HttpStatus.FOUND);
	}
	
}
