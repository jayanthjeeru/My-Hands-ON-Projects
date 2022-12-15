package com.wipro.jrrtc.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document
public class Bus {

	@Id
	private int id;
	private String name;
	private String start;
	private String end;
	private Driver driver;
	private List<Integer> available;
	private List<Integer> booked;
	private double fare;
	
	
	
	public Bus() {
		
	}

	public Bus(int id, String name, String start, String end, Driver driver, List<Integer> available,
			List<Integer> booked, double fare) {
		
		this.id = id;
		this.name = name;
		this.start = start;
		this.end = end;
		this.driver = driver;
		this.available = available;
		this.booked = booked;
		this.fare = fare;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStart() {
		return start;
	}
	public void setStart(String start) {
		this.start = start;
	}
	public String getEnd() {
		return end;
	}
	public void setEnd(String end) {
		this.end = end;
	}
	public Driver getDriver() {
		return driver;
	}
	public void setDriver(Driver driver) {
		this.driver = driver;
	}
	public List<Integer> getAvailable() {
		return available;
	}
	public void setAvailable(List<Integer> available) {
		this.available = available;
	}
	public List<Integer> getBooked() {
		return booked;
	}
	public void setBooked(List<Integer> booked) {
		this.booked = booked;
	}
	public double getFare() {
		return fare;
	}
	public void setFare(double fare) {
		this.fare = fare;
	}

	@Override
	public String toString() {
		return "Bus [id=" + id + ", name=" + name + ", start=" + start + ", end=" + end + ", driver=" + driver
				+ ", available=" + available + ", booked=" + booked + ", fare=" + fare + "]";
	}
	
	
	
}
