package com.learn.userprofileservice.service;

import com.learn.userprofileservice.exception.UserExistsException;
import com.learn.userprofileservice.model.User;
import com.learn.userprofileservice.model.UserCredentials;
import com.learn.userprofileservice.repository.UserProfileRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import static org.mockito.Mockito.*;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class UserServiceImpl1Test {

    @InjectMocks
    private  UserServiceImpl1 service;

    @Mock
    private UserProfileRepository repository;

    private User userOne;

    private UserCredentials credentials;

    @BeforeEach
    public void setup(){
        userOne = new User(1,"testname","test@gmail.com","test");
        credentials= new UserCredentials("test@gmail.com","test");
    }

    @Test
    public void givenUserDetailsWhenUserDoesnotExistThenShouldReturnSavedUser() throws UserExistsException {

 //configure the method response
      when(repository.existsByEmail(userOne.getEmail())).thenReturn(false);
      when(repository.save(any(User.class))).thenReturn(userOne);

        //Actual test case
        User user = service.registerUser(userOne);
        assertAll(
                ()->{assertNotNull(user);},
                ()->{ assertTrue(user.getEmail().equals("test@gmail.com"));},
                ()->{assertTrue(user.getName().equals("testname"));}
        );

        //verify the mock calls
        verify(repository,atLeastOnce()).existsByEmail(anyString());
        verify(repository,times(2)).save(any(User.class));
//        verify(repository).save(any(User.class));
        verifyNoMoreInteractions(repository);

    }

    @Test
    public void givenUserDetailsWhenUserExistThenShouldThrowTheException() {

        when(repository.existsByEmail(userOne.getEmail())).thenReturn(true);

        assertThrows(UserExistsException.class,()->service.registerUser(userOne));

        verify(repository).existsByEmail(anyString());
    }

    @Test
    public void givenUserCredentialsWhenValidThenReturnTrue(){
        when(repository.getUserByEmail(anyString())).thenReturn(Optional.of(userOne));

        assertTrue(service.authenticateUser(credentials));

        verify(repository).getUserByEmail(anyString());
    }

    }