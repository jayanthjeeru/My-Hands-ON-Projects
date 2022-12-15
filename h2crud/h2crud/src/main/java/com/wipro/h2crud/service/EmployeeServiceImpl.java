package com.wipro.h2crud.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.h2crud.exception.EmployeeNotFoundException;
import com.wipro.h2crud.model.Employee;
import com.wipro.h2crud.repository.EmployeeRepo;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	EmployeeRepo employeeRepo;
	
	@Override
	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		return employeeRepo.findAll();
	}

	@Override
	public Optional<Employee> getEmployeeById(int id) {
		// TODO Auto-generated method stub
		return employeeRepo.findById(id);
	}

	@Override
	public Employee addEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return employeeRepo.save(employee);
	}

	@Override
	public Employee updateEmployeeById(int id, String email) {
		// TODO Auto-generated method stub
		
		if(employeeRepo.findById(id).isPresent()) {
			Employee e=employeeRepo.findById(id).get();
			e.setEmail(email);
			return employeeRepo.save(e);
		}
		else {
			return null;
		}
		
		
	}

	@Override
	public String deleteEmployeeById(int id) throws EmployeeNotFoundException {
		// TODO Auto-generated method stub
		
		if(employeeRepo.existsById(id)) {
			
			employeeRepo.deleteById(id);
			
			
			
			return "SuccessFully Deleted";
		}
		else {
			throw new EmployeeNotFoundException("Employee Not Found");
		}
		
		
	}

}
