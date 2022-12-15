package com.wipro.jrrtc.dao;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.wipro.jrrtc.model.Bus;

@Repository
public interface BusDao extends MongoRepository<Bus,Integer> {
	
	public List<Bus> findAllByStartAndEnd(String start, String end);

	
}
