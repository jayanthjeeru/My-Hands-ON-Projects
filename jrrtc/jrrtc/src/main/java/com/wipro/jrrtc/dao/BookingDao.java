package com.wipro.jrrtc.dao;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.wipro.jrrtc.model.Booking;

public interface BookingDao extends MongoRepository<Booking, String>{

}
