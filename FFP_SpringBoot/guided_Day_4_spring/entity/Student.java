package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;



@Entity
@Table(name="Student")
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Column(name="student_id")
	private int id;
	
	@Column(name="student_name")
	private String s_name;
	
	@Column(name="age")
	private String s_age;
	
	@Column(name="course_id")
	private Integer s_courseId;
	
	
	@ManyToOne(targetEntity = Course.class,fetch = FetchType.EAGER)
	@JoinColumn(name="course_id",insertable = false,updatable = false)
	private Course course;
	
	public Student() {
	
	}


	public Student(int id, String s_name, String s_age, int s_courseId) {
		super();
		this.id = id;
		this.s_name = s_name;
		this.s_age = s_age;
		this.s_courseId = s_courseId;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getS_name() {
		return s_name;
	}


	public void setS_name(String s_name) {
		this.s_name = s_name;
	}


	public String getS_age() {
		return s_age;
	}


	public void setS_age(String s_age) {
		this.s_age = s_age;
	}


	public int getS_courseId() {
		return s_courseId;
	}


	public void setS_courseId(int s_courseId) {
		this.s_courseId = s_courseId;
	}


	@Override
	public String toString() {
		return "Student [id=" + id + ", s_name=" + s_name + ", s_age=" + s_age + ", s_courseId=" + s_courseId + "]";
	}



	
	
}
