package com.wipro.h2crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wipro.h2crud.model.Employee;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Integer>{

	
	
}
