package com.wipro.h2practice.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wipro.h2practice.model.User;

@Repository
public interface UserDao extends JpaRepository<User, Integer> {

	
}
