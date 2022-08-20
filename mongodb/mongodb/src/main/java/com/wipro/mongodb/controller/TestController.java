package com.wipro.mongodb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.mongodb.model.Test;
import com.wipro.mongodb.service.TestService;

@RestController
@RequestMapping("testmongo")
public class TestController {
	
	@Autowired
	TestService testservice;
	
	@PostMapping("add")
	public Test add(@RequestBody Test test) {
		
		return testservice.add(test);
		
	}
	
	@GetMapping("getall")
	public List<Test> getAll(){
		return testservice.getall();
	}
	
	@GetMapping
	public List<Test> byName(@RequestParam String name) {
		return testservice.byname(name);
	}
	
	
}
