package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Course;
import com.example.demo.entity.Student;
import com.example.demo.service.Service_implementation;

@RestController
@RequestMapping("/students")
public class studentController {

	private Service_implementation simp;

	@Autowired
	public studentController(Service_implementation simp) {
		super();
		this.simp = simp;
	}
	
	@GetMapping("list")
	public List<Student> getAllStudnt(){
		
		return simp.getAllStudent();
	}
	
	@GetMapping("list2/{id}")
	public List<Student> getStudentByCourseIs(@PathVariable("id") int id){
		
		return simp.getAllStudentByCourseId(id);
	}
	
	@GetMapping("list3/{name}")
	public List<Student> getStudentByName(@PathVariable("name") String name){
		
		return simp.getRecordByStudentName(name);
	}
	
	@PostMapping("addstudent")
	public void addStudent(@RequestBody Student s) {
		
		simp.insertStudent(s);
	}
//	-------------------------------- course ------------------------------
	
	@PostMapping("course")
	public void addCourses(@RequestBody Course cs) {
		simp.AddCourse(cs);
	}
	
	@GetMapping("course")
	public List<Course> getAllCourses(){
		return simp.getAllCourse();
	}
	
	@GetMapping("course/{id}")
	public Course getCourseById(@PathVariable("id") int id) {
		return simp.getCourseByCourseId(id);
	}
	
	@GetMapping("coursen/{name}")
	public Course getCourseByName(@PathVariable("name") String name) {
		return simp.getCourseByCourseName(name);
	}
	
}
