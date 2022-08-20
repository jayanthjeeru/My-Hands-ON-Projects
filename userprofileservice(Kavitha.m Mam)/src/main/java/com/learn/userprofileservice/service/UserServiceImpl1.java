package com.learn.userprofileservice.service;

import com.learn.userprofileservice.exception.UserExistsException;
import com.learn.userprofileservice.model.User;
import com.learn.userprofileservice.model.UserCredentials;
import com.learn.userprofileservice.repository.UserProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl1 implements UserService{
    @Autowired
    private UserProfileRepository repository;
    @Override
    public User registerUser(User newUser) throws UserExistsException {
       if (repository.existsByEmail(newUser.getEmail())){
           throw new UserExistsException("User with the email already exists");
       }
        return repository.save(newUser);
    }

    @Override
    public boolean authenticateUser(UserCredentials credentials) {
        Optional<User> userByEmail = repository.getUserByEmail(credentials.getEmail());
        if(userByEmail.isEmpty()){
            throw new RuntimeException("User not found");
        }

        User user = userByEmail.get();
        if (user.getPassword().equals(credentials.getPassword())){
            return true;
        }
        else{
            throw new RuntimeException("Credentials mismatch");
        }
    }
}
