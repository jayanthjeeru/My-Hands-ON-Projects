package com.wipro.mongoassignment.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.wipro.mongoassignment.model.Player;

@Repository
public interface PlayerDao extends MongoRepository<Player,Integer> {

}
