package com.example.demo.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name="Student")
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	
	@Column(name="Id")
	private int Id;
	
	@Column(name="marks")
	private int marks;
	
	@Column(name="name")
	private String name;
	
	@Column(name="course")
	private String course;
	
	@Column(name="date")
	private Date date;
	
	public Student() {
		
	}

	public Student(int id, int marks, String name, String course, Date date) {
		super();
		Id = id;
		this.marks = marks;
		this.name = name;
		this.course = course;
		this.date = date;
	}
	
	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "Student [Id=" + Id + ", marks=" + marks + ", name=" + name + ", course=" + course + ", date=" + date
				+ "]";
	}
	
	
}
