package com.learn.userprofileservice.controller;

import com.learn.userprofileservice.exception.UserExistsException;
import com.learn.userprofileservice.model.User;
import com.learn.userprofileservice.model.UserCredentials;
import com.learn.userprofileservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/users")
@CrossOrigin(origins = "http://localhost:4200")
public class UserProfileController {

    @Autowired
    private UserService service;

    @PostMapping("/register")
    public ResponseEntity<User> registerUser(@RequestBody User newUser) throws UserExistsException {
        return new ResponseEntity<>(service.registerUser(newUser), HttpStatus.CREATED);
    }

    @PostMapping("/login")
    public ResponseEntity<?> loginUser(@RequestBody UserCredentials credentials){
        boolean b = service.authenticateUser(credentials);
        return new ResponseEntity<>(HttpStatus.OK);

    }

}
