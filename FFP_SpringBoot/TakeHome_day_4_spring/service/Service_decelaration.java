package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Course;
import com.example.demo.entity.Student;

public interface Service_decelaration {
	
	///// Student
	public void insertStudent(Student s);
	public List<Student> getAllStudent();
	public List<Student> getAllStudentByCourseId(int id);
	public List<Student> getRecordByStudentName(String name);
//	take home---------------------------------------------------------------------
	public void DeleteStudentByStudentId(int id);
	public void UpdateStudent(Student st);
	public void updateCourse(Course cs);
	
//	course
	
	public void AddCourse(Course cs);
	public List<Course> getAllCourse();
	public Course getCourseByCourseId(int c_id);
	public Course getCourseByCourseName(String name);
}
