package com.example.demo.entity;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;



@Entity
@Table(name="Course")
public class Course {
	@Id
	
	@Column(name="course_id")
	private int id;
	@Column(name="course_name")
	private String c_name;
	
	@Column(name="fees")
	private double fees;

	
	
	@OneToMany(mappedBy = "course")
	
	private Set<Student> student;
	
	
	public Course() {
		
	}


	public Course(int id, String c_name, double fees) {
		super();
		this.id = id;
		this.c_name = c_name;
		this.fees = fees;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getC_name() {
		return c_name;
	}


	public void setC_name(String c_name) {
		this.c_name = c_name;
	}


	public double getFees() {
		return fees;
	}


	public void setFees(double fees) {
		this.fees = fees;
	}


	@Override
	public String toString() {
		return "Course [id=" + id + ", c_name=" + c_name + ", fees=" + fees + "]";
	}
	
	
	

}
