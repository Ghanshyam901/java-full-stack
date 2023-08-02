package com.example.demo.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Student;

import com.example.demo.persistance.Student_Implementation;

@Service
public class Service_Implementation implements StudentDecelaration{
	
	
	private Student_Implementation srepo;
	
	@Autowired
	public Service_Implementation(Student_Implementation srepo) {
		super();
		this.srepo=srepo;
	}
	
	

	@Override
	@Transactional
	public List<Student> showAllStudents() {
		
		return srepo.showAllStudent();
	}

	@Override
	@Transactional
	public void AddStudent(Student s) {
		// TODO Auto-generated method stub
		srepo.AddStudentDetails(s);;
	}

	@Override
	@Transactional
	public void updateStudent(Student s) {
		// TODO Auto-generated method stub
		srepo.updateStudentDetails(s);
	}

	@Override
	@Transactional
	public Student searchStudentById(int id) {
		// TODO Auto-generated method stub
		return srepo.searchById(id);
	}

	@Override
	@Transactional
	public void DeleteById(int id) {
		
		srepo.DeleteStudentById(id);
		
	}


	@Override
	@Transactional
	public List<Student> searchBasedOnCourse(String course) {
		
		return srepo.searchByCourse(course);
	}
	
	
}
