package com.example.demo.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Course;
import com.example.demo.entity.Student;
import com.example.demo.persistance.CourseJpa;
import com.example.demo.persistance.StudentJPA;

@Service
public class Service_implementation implements Service_decelaration {

	
	private CourseJpa cjpa;
	private StudentJPA sjpa;
	
	
	
	@Autowired
	public Service_implementation(CourseJpa cjpa, StudentJPA sjpa) {
		
		this.cjpa = cjpa;
		this.sjpa = sjpa;
	}




	@Override
	@Transactional
	public List<Student> getAllStudent() {
		
		List<Student> list = sjpa.findAll();
		
		return list;
	}




	@Override
	public List<Student> getAllStudentByCourseId(int id) {
		
		List<Student> allStudent = sjpa.findEmpByCourseId(id);
		
		return allStudent;
	}




	@Override
	public List<Student> getRecordByStudentName(String name) {
		
		List<Student> list = sjpa.searchStudentByName(name);
		return list;
	}




	@Override
	public void insertStudent(Student s) {
		
		s.setId(0);
		sjpa.save(s);
		
	}




	@Override
	@Transactional
	public void AddCourse(Course cs) {
//		cs.setId(0);
		cjpa.save(cs);
		
		
	}




	@Override
	public List<Course> getAllCourse() {
		
		List<Course> list = cjpa.findAll();
		return list;
	}




	@Override
	@Transactional
	public Course getCourseByCourseId(int c_id) {
		
		return cjpa.findCourseByCourseId(c_id);
	}




	@Override
	@Transactional
	public Course getCourseByCourseName(String name) {
		
		return cjpa.searchCourseByName(name);
	}
	
	
}
