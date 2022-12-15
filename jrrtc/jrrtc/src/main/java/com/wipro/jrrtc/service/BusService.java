package com.wipro.jrrtc.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.wipro.jrrtc.model.Booking;
import com.wipro.jrrtc.model.Bus;

@Service
public interface BusService {

	public List<Bus> findBus(String from,String to);
	
	public Bus addBus(Bus bus);

	public Bus updateBus(Bus bus);
	

	
	
}
