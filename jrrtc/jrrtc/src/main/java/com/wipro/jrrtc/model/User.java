package com.wipro.jrrtc.model;

public class User {
	
	private String name;
	private int age;
	private long number;
	
	
	
	public User() {
		
	}

	public User(String name, int age, long number) {
		
		this.name = name;
		this.age = age;
		this.number = number;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getNumber() {
		return number;
	}
	public void setNumber(long number) {
		this.number = number;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + ", number=" + number + "]";
	}
	
	

}
