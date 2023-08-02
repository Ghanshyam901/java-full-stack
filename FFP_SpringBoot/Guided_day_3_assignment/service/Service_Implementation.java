package com.example.demo.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Student;
import com.example.demo.persistance.StudentRepo;

@Service
public class Service_Implementation implements StudentDecelaration{
	
	
	private StudentRepo srepo;
	
	@Autowired
	public Service_Implementation(StudentRepo srepo) {
		this.srepo=srepo;
	}
	
	

	@Override
	@Transactional
	public List<Student> showAllStudent() {
		
		return srepo.findAll();
	}

	@Override
	@Transactional
	public void AddStudent(Student s) {
		// TODO Auto-generated method stub
		srepo.save(s);
	}

	@Override
	@Transactional
	public void updateStudent(Student s) {
		// TODO Auto-generated method stub
		srepo.save(s);
	}

	@Override
	@Transactional
	public Student searchStudentById(int id) {
		// TODO Auto-generated method stub
		return srepo.findById(id).get();
	}

	@Override
	@Transactional
	public void DeleteById(int id) {
		
		srepo.deleteById(id);
		
	}

//	@Override
//	@Transactional
//	public List<Student> searchBasedOnCourse(String course) {
//		
//		List<Student> st = srepo.findByCourse(course);
//		
//			
//		return st;
//		
//
//	}
	
	
	
	
}
