package com.wipro.shopEasy.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Seller {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int sellerId;
	private String username;
	private String email;
	private long number;
	private String password;
	private String address;
	
	
	
	


	public Seller() {
		
	}


	public Seller(int sellerId, String username, String email, long number, String password, String address) {
	
		this.sellerId = sellerId;
		this.username = username;
		this.email = email;
		this.number=number;
		this.password = password;
		this.address = address;
	}
	
	
	public int getSellerId() {
		return sellerId;
	}
	public void setSellerId(int sellerId) {
		this.sellerId = sellerId;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getNumber() {
		return number;
	}


	public void setNumber(long number) {
		this.number = number;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	

}
