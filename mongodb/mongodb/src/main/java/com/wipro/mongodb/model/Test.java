package com.wipro.mongodb.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;





@Document(collection = "Test")
public class Test {
	
	@Id
	private String userId;
	@Indexed(unique = true)
	private String name;
	@Indexed(unique = true)
	private int grade;
	private List<String> subjects;
	private List<order> orders;
	
	
	
	
	public Test(String userId, String name, int grade, List<String> subjects, List<order> orders) {
		super();
		this.userId = userId;
		this.name = name;
		this.grade = grade;
		this.subjects = subjects;
		this.orders = orders;
	}
	public List<order> getOrders() {
		return orders;
	}
	public void setOrders(List<order> orders) {
		this.orders = orders;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public List<String> getSubjects() {
		return subjects;
	}
	public void setSubjects(List<String> subjects) {
		this.subjects = subjects;
	}
	
	public Test() {
	
	}
	
	

}
