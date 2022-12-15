package com.wipro.jrrtc.service;

import org.springframework.stereotype.Service;

import com.wipro.jrrtc.model.Booking;

@Service
public interface BookingService {

	public Booking bookTicket(Booking booking);
}
