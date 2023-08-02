package com.example.demo.persistance;

import java.util.List;

import com.example.demo.entity.Student;

public interface Student_Deceleration {
	
	public List<Student> showAllStudent();
	public void AddStudentDetails(Student s);
	public void updateStudentDetails(Student s);
	public Student searchById(int id);
	public void DeleteStudentById(int id);
	
	public List<Student> searchByCourse(String course);
}
