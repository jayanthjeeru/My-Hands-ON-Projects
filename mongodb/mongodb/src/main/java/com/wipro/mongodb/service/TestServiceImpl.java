package com.wipro.mongodb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.mongodb.dao.TestDao;
import com.wipro.mongodb.model.Test;

@Service
public class TestServiceImpl implements TestService{

	@Autowired
	TestDao testdao;
	
	@Override
	public Test add(Test test) {
	
		return testdao.save(test);
	}

	@Override
	public List<Test> getall() {
	
		return testdao.findAll();
	}

	@Override
	public List<Test> byname(String name) {
		
		return testdao.findByName(name);
	}

}
