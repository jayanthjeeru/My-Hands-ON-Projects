package com.wipro.h2crud.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.wipro.h2crud.exception.EmployeeNotFoundException;
import com.wipro.h2crud.model.Employee;

@Service
public interface EmployeeService {

	public List<Employee> getAllEmployees();
	public Optional<Employee> getEmployeeById(int id);
	public Employee addEmployee(Employee employee);
	public Employee updateEmployeeById(int id,String email);
	public String deleteEmployeeById(int id) throws EmployeeNotFoundException;
	
	
}
