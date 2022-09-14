package com.wipro.EmployeeAssignment.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.wipro.EmployeeAssignment.model.Employee;

@Repository
public interface EmployeeDao extends JpaRepository<Employee, Integer>{


//--> find all empls by dept

	@Query("select e from Employee e where upper(e.dept)=upper(:dept)")
	public List<Employee> findAllEmployeesByDept(@Param("dept") String dept);
	
//->  find all empls by dept  and city
//
//
//->  find all empls having rating > 4
//
//->  find all empls having rating > 4 and are post grads 
//
//->  find all empls who r under grads 
//
//
//->  find all empls having rating > 4 and city
//
//->  find all empls having rating < 3 in IT dept 
	
	@Query("select e from Employee e where rating<3 and upper(dept)='IT'")
	public List<Employee> findAllEmployessByRatingLessThan3AndItDept();
//
//->  find all empls having rating < 3 
//
//->  find all empls having rating < 3  and dept 
	
}
