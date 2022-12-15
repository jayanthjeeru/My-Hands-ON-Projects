package com.wipro.h2crud.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.h2crud.exception.EmployeeNotFoundException;
import com.wipro.h2crud.model.Employee;
import com.wipro.h2crud.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;
	
	@GetMapping("getallemployees")
	public ResponseEntity<List<Employee>> getAllEmployees() {
		// TODO Auto-generated method stub
		return new ResponseEntity<List<Employee>> (employeeService.getAllEmployees(),HttpStatus.OK);
	}

	@GetMapping("getemployeebyid/{id}")
	public ResponseEntity<Employee> getEmployeeById(@PathVariable(name = "id") int id) {
		if(employeeService.getEmployeeById(id).isPresent())
		return new ResponseEntity<Employee>(employeeService.getEmployeeById(id).get(),HttpStatus.OK);
		else
			return new ResponseEntity<Employee>(HttpStatus.NOT_FOUND);
	}

	@PostMapping("addemployee")
	public Employee addEmployee(@RequestBody Employee employee) {
		// TODO Auto-generated method stub
		return employeeService.addEmployee(employee);
	}

	@PutMapping("updateemployee/{id}/{email}")
	public Employee updateEmployeeById(@PathVariable int id,@PathVariable String email) {
		// TODO Auto-generated method stub
		
		return employeeService.updateEmployeeById(id, email);
		
		
	}

	@DeleteMapping("deleteemployee/{id}")
	public ResponseEntity<String> deleteEmployeeById(@PathVariable("id") int id) throws EmployeeNotFoundException {
		// TODO Auto-generated method stub
		System.out.println(id);
		return new ResponseEntity<String>(employeeService.deleteEmployeeById(id),HttpStatus.OK);
		
		
	}

	
}
