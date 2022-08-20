package com.learn.userprofileservice.service;

import com.learn.userprofileservice.exception.UserExistsException;
import com.learn.userprofileservice.model.User;
import com.learn.userprofileservice.model.UserCredentials;

public interface UserService {

    User registerUser(User newUser) throws UserExistsException;

    boolean authenticateUser(UserCredentials credentials);
}
