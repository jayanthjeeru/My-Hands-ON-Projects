package com.wipro.studentassignment.model;


import org.springframework.stereotype.Component;

@Component
public class Student  {
		
	  private int id;	
	  private String name;
	  private int age;
	  private char division;
	  private int sem;
	  private double marks;
	  
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public char getDivision() {
		return division;
	}
	public void setDivision(char division) {
		this.division = division;
	}
	public int getSem() {
		return sem;
	}
	public void setSem(int sem) {
		this.sem = sem;
	}
	public double getMarks() {
		return marks;
	}
	public void setMarks(double marks) {
		this.marks = marks;
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
	public Student(int id, String name, int age, char division, int sem, double d) {
		
		this.id = id;
		this.name = name;
		this.age = age;
		this.division = division;
		this.sem = sem;
		this.marks = d;
	}
	public Student() {
		
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + ", division=" + division + ", sem=" + sem
				+ ", marks=" + marks + "]";
	}
	
	
	  
	  

}
