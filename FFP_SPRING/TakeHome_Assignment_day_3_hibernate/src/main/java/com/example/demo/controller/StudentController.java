package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Student;
import com.example.demo.service.Service_Implementation;

@RestController
@RequestMapping("student")
public class StudentController {

	private Service_Implementation serviceImp;
	
	@Autowired
	public StudentController (Service_Implementation serviceImp) {
		this.serviceImp = serviceImp;
	}
	
	@GetMapping("list")
	public List<Student> getallStudent(){
		
		List<Student> list = serviceImp.showAllStudents();
		return list;
	}
	
	@GetMapping("list/{id}")
	public Student getStudentById(@PathVariable("id") int id) {
		
		Student s =serviceImp.searchStudentById(id);
		if(s == null) {
			throw new RuntimeException("Student not found with the given id");
		}
		return s;
	}
	
	@PostMapping("list")
	public void addNewStudent(@RequestBody Student s) {
		s.setId(0);
		serviceImp.AddStudent(s);
		
	}
	
	
	@PutMapping("list")
	public void UpdateStudentdetails(@RequestBody Student s) {
		
		serviceImp.updateStudent(s);
		
	}
	
	@DeleteMapping("list/{id}")
	public String deleteEmployeeBasedOnId(@PathVariable("id") int id)
	{
		Student s=serviceImp.searchStudentById(id);
		if(s==null)
			throw new RuntimeException("Student not existed to deleted");
			serviceImp.DeleteById(id);
		return "Deleted Student id is: " + id;
	}
	
	@GetMapping("search/{course}")
	
	public List<Student> SearchStudentByCourse(@PathVariable("course") String course){
		
		List<Student> list =serviceImp.searchBasedOnCourse(course);
		return list;
	}
}
