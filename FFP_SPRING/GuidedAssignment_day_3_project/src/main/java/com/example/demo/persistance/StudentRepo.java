package com.example.demo.persistance;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Student;

public interface StudentRepo extends JpaRepository<Student, Integer> {
		
	public List<Student> findByCourse(String course);
}
