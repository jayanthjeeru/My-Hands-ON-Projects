package com.wipro.EmployeeAssignment.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.EmployeeAssignment.exception.UserNotFoundException;
import com.wipro.EmployeeAssignment.model.Employee;
import com.wipro.EmployeeAssignment.service.EmployeeService;

@RestController
@RequestMapping("employees")
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;
	
	@PostMapping("addemployee")
	public ResponseEntity<Employee> addEmployee(@RequestBody Employee employee) {
		
		return new ResponseEntity<Employee>(employeeService.addEmployee(employee),HttpStatus.CREATED);
	}
	
	@DeleteMapping("deleteemployee")
	public ResponseEntity<String> deleteEmployee(@RequestBody Employee employee) throws UserNotFoundException {
		
		return new ResponseEntity<String>(employeeService.deleteEmployee(employee),HttpStatus.GONE);
	}
	
	@GetMapping("getallemployee")
	public ResponseEntity<List<Employee>> getAllEmployee() {
		
		return new ResponseEntity<List<Employee>>(employeeService.getAllEmployees(),HttpStatus.FOUND);
	}
	
	@GetMapping("getallemployeeratinglessthanthreeanditdept")
	public ResponseEntity<List<Employee>> getAllEmployessByRatingLessThan3AndItDept() {
		
		return new ResponseEntity<List<Employee>>(employeeService.getAllEmployessByRatingLessThan3AndItDept(),HttpStatus.FOUND);
	}
	
	@GetMapping("getallemployeebydept/{dept}")
	public ResponseEntity<List<Employee>> getAllEmployeeByDept(@PathVariable("dept") String dept) throws UserNotFoundException {
		
		return new ResponseEntity<List<Employee>>(employeeService.getAllEmployeesByDept(dept),HttpStatus.FOUND);
	}
	
	@GetMapping("getemployeebyid/{id}")
	public ResponseEntity<Employee> getEmployeeById(@PathVariable("id") int id) throws UserNotFoundException {
		
		return new ResponseEntity<Employee>(employeeService.getEmployeeById(id),HttpStatus.FOUND);
	}
}
