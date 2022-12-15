package com.wipro.jrrtc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.jrrtc.model.Booking;
import com.wipro.jrrtc.service.BookingService;

@RestController
public class BookingController {

	@Autowired
	private BookingService bookingService;
	
	@PostMapping("bookticket")
	public Booking bookTicket(@RequestBody Booking booking) {
		
	
		return bookingService.bookTicket(booking);
		
	}
	
}
