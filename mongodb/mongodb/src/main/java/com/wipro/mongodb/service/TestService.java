package com.wipro.mongodb.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.wipro.mongodb.model.Test;

@Service
public interface TestService {
	

	public Test add(Test test);
	
	public List<Test> getall();
	
	public List<Test> byname(String name); 
	
}
