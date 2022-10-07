package com.wipro.eurekaclientteacher.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.wipro.eurekaclientteacher.model.Student;

@RestController
@RequestMapping("teacher")
public class TeacherController {

	@Autowired
	private RestTemplate restTemplate;
	
	@GetMapping("gettopstudentfromteacher")
	public ResponseEntity<Student> getTopStudent(){
		
		Student student=restTemplate.getForObject("http://STUDENT/topstudent", Student.class);
		
		return new ResponseEntity<Student>(student,HttpStatus.OK);
		
	}
	
	@GetMapping("getallstudentsfromteacher")
	public ResponseEntity<List<Student>> getallStudents(){
		
		List<Student> students=restTemplate.getForObject("http://STUDENT/students", List.class);
		
		return new ResponseEntity<List<Student>>(students,HttpStatus.OK);
		
	}
	
	@GetMapping("getportinfoofstudentsfromteacher")
	public ResponseEntity<String> getPortInfo(){
		
		String res=restTemplate.getForObject("http://STUDENT/portinfo", String.class);
		
		return new ResponseEntity<String>(res,HttpStatus.OK);
		
	}
}
