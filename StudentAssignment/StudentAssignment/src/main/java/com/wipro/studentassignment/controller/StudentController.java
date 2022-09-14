package com.wipro.studentassignment.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.studentassignment.model.Student;

@RestController
@CrossOrigin()
public class StudentController {
	
//	 -> add new stud to list of studs
//	  -> delete student based on name 
//	  -> delete stud based on sem
//	  -> get stud by div
//	  -> get stud by sem
//	  -> get stud with marks greater dan d given marks
//	  -> update student
	
	List<Student> s=new ArrayList<>();
	
	public StudentController() {
		s.add(new Student(1, "jay", 21, 'B', 8, 867.0));
		s.add(new Student(2, "rev", 24, 'A', 8, 900.0));
		s.add(new Student(3, "yas", 26, 'C', 8, 940.0));
	}
	

	
	@PostMapping
	public ResponseEntity<Student> addStudent(@RequestBody Student student){
		
		
		s.add(student);
		
		System.out.println(student);
		
		return new ResponseEntity<Student>(student,HttpStatus.CREATED);
		
	}
	
	@DeleteMapping("byname/{name}")
	public ResponseEntity<Student> deleteByStudentName(@PathVariable String name){
		
		System.out.println(name);
		Student ds=new Student();
		
		for(Student i:s){
			if(i.getName()==name) {
				System.out.println(i.getName()==name);
				ds=i;
				s.remove(ds);
				return new ResponseEntity<Student>(ds,HttpStatus.CREATED);
			}
		}
//		ds.setName("not found");
		return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		
	}
	
	@DeleteMapping("bysem/{sem}")
	public ResponseEntity<List<Student>> deleteByStudentSem(@PathVariable int sem){
		
		Student ds=new Student();
		List<Student> dsl=new ArrayList<>();
		for(Student i:s){
			if(i.getSem()==sem) {
				ds=i;
				s.remove(ds);
				dsl.add(ds);
				//return new ResponseEntity<Student>(ds,HttpStatus.CREATED);
			}
		}
		
		return new ResponseEntity<List<Student>>(dsl,HttpStatus.GONE);
		
	}
	
	@GetMapping("bydiv/{div}")
	public ResponseEntity<List<Student>> getStudentbydiv(@PathVariable char div){
		
		
		Student as=new Student();
		List<Student> asl=new ArrayList<>();
		for(Student i:s){
			if(i.getDivision()==div) {
				as=i;
				asl.add(as);
				//return new ResponseEntity<Student>(ds,HttpStatus.CREATED);
			}
		}
		
		return new ResponseEntity<List<Student>>(asl,HttpStatus.FOUND);
		
	} 
	
	@GetMapping("bysem/{sem}")
	public ResponseEntity<List<Student>> getStudentbysem(@PathVariable int sem){
		
		
		Student as=new Student();
		List<Student> asl=new ArrayList<>();
		for(Student i:s){
			if(i.getSem()==sem) {
				as=i;
				asl.add(as);
				//return new ResponseEntity<Student>(ds,HttpStatus.CREATED);
			}
		}
		
		return new ResponseEntity<List<Student>>(asl,HttpStatus.FOUND);
		
	}
	
	@GetMapping("bymarks/{marks}")
	public ResponseEntity<List<Student>> getStudentbymarks(@PathVariable double marks){
		
		
		Student as=new Student();
		List<Student> asl=new ArrayList<>();
		for(Student i:s){
			if(i.getMarks()>=marks) {
				as=i;
				asl.add(as);
				//return new ResponseEntity<Student>(ds,HttpStatus.CREATED);
			}
		}
		
		return new ResponseEntity<List<Student>>(asl,HttpStatus.FOUND);
		
	}
	
	@GetMapping("getallstudents")
	public ResponseEntity<List<Student>> getAllStudens(){
		
		
		
		
		return new ResponseEntity<List<Student>>(s,HttpStatus.OK);
		
	}
	
//	@PutMapping
//	public ResponseEntity<Student> updateStudent(@RequestBody Student student){
//		
//		
//		s.
//		s.add(student);
//		
//		return new ResponseEntity<Student>(student,HttpStatus.CREATED);
//		
//	}

}
