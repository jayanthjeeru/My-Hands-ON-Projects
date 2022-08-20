package com.wipro.shopEasy.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wipro.shopEasy.model.User;

@Repository
public interface UserDao extends JpaRepository<User, Integer>{
	

	public User findByEmail(String email);  

}
