package com.wipro.mongodb.dao;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.wipro.mongodb.model.Test;

@Repository
public interface TestDao extends MongoRepository<Test, String>{
	
	public List<Test> findByName(String name);

}
