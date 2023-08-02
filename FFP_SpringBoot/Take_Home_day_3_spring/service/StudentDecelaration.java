package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Student;

public interface StudentDecelaration {
	
	public List<Student> showAllStudents();
	public void AddStudent(Student s);
	public void updateStudent(Student s);
	public Student searchStudentById(int id);
	public void DeleteById(int id);
	public List<Student> searchBasedOnCourse(String course); 
	
	
}
