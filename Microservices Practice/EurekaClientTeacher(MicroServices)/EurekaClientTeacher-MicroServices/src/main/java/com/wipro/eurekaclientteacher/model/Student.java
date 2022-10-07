package com.wipro.eurekaclientteacher.model;

import org.springframework.stereotype.Component;

@Component
public class Student {
	
	private String name;
	private String rollNumber;
	private int grade;
	private char section;
	private	double marks;
	
	
	
	public Student() {
		
	}

	public Student(String name, String rollNumber, int grade, char section, double marks) {
		
		this.name = name;
		this.rollNumber = rollNumber;
		this.grade = grade;
		this.section = section;
		this.marks = marks;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRollNumber() {
		return rollNumber;
	}
	public void setRollNumber(String rollNumber) {
		this.rollNumber = rollNumber;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public char getSection() {
		return section;
	}
	public void setSection(char section) {
		this.section = section;
	}
	public double getMarks() {
		return marks;
	}
	public void setMarks(double marks) {
		this.marks = marks;
	}
	
	

}
