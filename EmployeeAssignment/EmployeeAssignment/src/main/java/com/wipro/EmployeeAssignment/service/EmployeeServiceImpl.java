package com.wipro.EmployeeAssignment.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.EmployeeAssignment.dao.EmployeeDao;
import com.wipro.EmployeeAssignment.exception.UserNotFoundException;
import com.wipro.EmployeeAssignment.model.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDao employeeDao;
	
	@Override
	public Employee addEmployee(Employee employee) {
		
		return employeeDao.save(employee);
	}

	@Override
	public List<Employee> getAllEmployees() {
		
		return employeeDao.findAll();
	}

	@Override
	public Employee getEmployeeById(int id) throws UserNotFoundException {
		
		if(!employeeDao.existsById(id)) {
			
			throw new UserNotFoundException();
			
		}
		
		return employeeDao.findById(id).get();
	}

	@Override
	public List<Employee> getAllEmployeesByDept(String dept) throws UserNotFoundException {
		
		if(!employeeDao.findAllEmployeesByDept(dept).isEmpty())
		return employeeDao.findAllEmployeesByDept(dept);
		else
			throw new UserNotFoundException();
	}

	@Override
	public String deleteEmployee(Employee employee) throws UserNotFoundException {
	
		if(employeeDao.existsById(employee.getEmpId())) {
			employeeDao.delete(employee);
			return "Deleted successFul";
		}
		throw new UserNotFoundException();
	}

	@Override
	public List<Employee> getAllEmployessByRatingLessThan3AndItDept() {
		
		return employeeDao.findAllEmployessByRatingLessThan3AndItDept();
	}

}
