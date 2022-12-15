package com.wipro.jrrtc.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Booking {

	private int quantity;
	private List<User> users;
	private Bus bus;
	private List<Integer> seats;
	private double price;
	
	
	
	public Booking() {
		
	}

	public Booking(int quantity, List<User> users, Bus bus, List<Integer> seats, double price) {
		
		this.quantity = quantity;
		this.users = users;
		this.bus = bus;
		this.seats = seats;
		this.price = price;
	}
	
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public List<User> getUsers() {
		return users;
	}
	public void setUsers(List<User> users) {
		this.users = users;
	}
	public Bus getBus() {
		return bus;
	}
	public void setBus(Bus bus) {
		this.bus = bus;
	}
	public List<Integer> getSeats() {
		return seats;
	}
	public void setSeats(List<Integer> seats) {
		this.seats = seats;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Booking [quantity=" + quantity + ", users=" + users + ", bus=" + bus + ", seats=" + seats + ", price="
				+ price + "]";
	}
	
	
	
}
