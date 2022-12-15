package com.wipro.jrrtc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.jrrtc.dao.BusDao;
import com.wipro.jrrtc.model.Booking;
import com.wipro.jrrtc.model.Bus;

@Service
public class BusServiceImpl implements BusService {

	@Autowired
	private BusDao busDao;
	
	@Override
	public List<Bus> findBus(String from, String to) {
		
		return busDao.findAllByStartAndEnd(from, to);
	}

	@Override
	public Bus addBus(Bus bus) {
		
		return busDao.save(bus);
	}

	@Override
	public Bus updateBus(Bus bus) {
		
		return busDao.save(bus);
	}

	

}
