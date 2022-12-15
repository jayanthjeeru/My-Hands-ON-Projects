package com.wipro.jrrtc.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.jrrtc.dao.BookingDao;
import com.wipro.jrrtc.model.Booking;

@Service
public class BookingServiceImpl implements BookingService {

	@Autowired
	BookingDao bookingDao;
	
	@Autowired
	BusService busService;
	
	@Override
	public Booking bookTicket(Booking booking) {
		
		List<Integer> available = booking.getBus().getAvailable();
		List<Integer> booked = booking.getBus().getBooked();
		List<Integer> bookedSeats=new ArrayList<>();
		for(int i=0;i<booking.getQuantity();i++) {
			int seat=available.remove(0);
			booked.add(seat);
			bookedSeats.add(seat);
		}
		
		booking.getBus().setAvailable(available);
		booking.getBus().setBooked(booked);
		booking.setSeats(bookedSeats);
		booking.setPrice(booking.getQuantity()*booking.getBus().getFare());
		System.out.println(booking.getBus());
		busService.updateBus(booking.getBus());
		return bookingDao.save(booking);
		
	}
	
}
