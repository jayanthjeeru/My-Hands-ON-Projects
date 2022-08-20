package com.learn.userprofileservice.repository;

import com.learn.userprofileservice.model.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
@ExtendWith(SpringExtension.class)
class UserProfileRepositoryTest {

    @Autowired
    private UserProfileRepository repository;

    @BeforeEach
    public void setup(){
        User user1 = new User(10, "Charlie", "charlie777@gmail.com", "pass");
        repository.save(user1);
    }

    @Test
    public void givenUserExistsinDBThenShouldReturnTrue(){
        assertTrue(repository.existsByEmail("charlie777@gmail.com"),"User with the email doesn't exist");
        System.out.println("tested");
    }

    @Test
    public void givenUserDoesNoExistsinDBThenShouldReturnFalse(){
        assertFalse(repository.existsByEmail("john@gmail.com"),"Given user exists");
    }

    @Test
    public void  givenUserEmailWhenUserExistsThenReturnOptionalWithUser(){
        Optional<User> userByEmail = repository.getUserByEmail("charlie777@gmail.com");
        assertTrue(userByEmail.isPresent());
        User user = userByEmail.get();
        assertEquals("Charlie",user.getName());


    }



}