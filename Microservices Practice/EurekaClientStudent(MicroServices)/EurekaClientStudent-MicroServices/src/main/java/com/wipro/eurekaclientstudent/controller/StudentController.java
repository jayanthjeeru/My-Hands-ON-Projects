package com.wipro.eurekaclientstudent.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.eurekaclientstudent.model.Student;

@RestController
public class StudentController {

	@GetMapping("students")
	public List<Student> getAllStudents(){
		
		List<Student> students =Arrays.asList(new Student("john","a1", 8, 'b', 785.80),new Student("ram","a2", 8, 'b', 885.80),new Student("lam","a3", 8, 'c', 985.80));
		
		return students;
	}
	
	@GetMapping("topstudent")
	public Student getTopStudent(){
		
		Student student = new Student("lam","a3", 8, 'c', 985.80);
		
		return student;
	}
	
	@Value("${server.port}")
	int myServerPort;
	
	@GetMapping("portinfo")
	public String getPortInfo(){
		
		
		String res="port:"+myServerPort;
		return res;
		
	}
	
}
