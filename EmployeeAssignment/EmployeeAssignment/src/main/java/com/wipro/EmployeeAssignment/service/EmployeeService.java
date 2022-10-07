package com.wipro.EmployeeAssignment.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.wipro.EmployeeAssignment.exception.UserNotFoundException;
import com.wipro.EmployeeAssignment.model.Employee;

@Service
public interface EmployeeService {
	
	public Employee addEmployee(Employee employee);
	
	public List<Employee> getAllEmployees();
	
	public List<Employee> getAllEmployeesByDept(String dept) throws UserNotFoundException;
	
	public Employee getEmployeeById(int id) throws UserNotFoundException;
	
	public String deleteEmployee(Employee employee) throws UserNotFoundException;
	
	public List<Employee> getAllEmployessByRatingLessThan3AndItDept();
	
	public void deleteEmployeeById(int id);
}
