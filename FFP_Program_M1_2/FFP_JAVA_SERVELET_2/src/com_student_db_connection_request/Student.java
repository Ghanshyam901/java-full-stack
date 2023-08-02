package com_student_db_connection_request;

public class Student {
 
	private int id;
	private String name,city;
	private int age , courseId;
	
	
	public Student(){
		
	}


	public Student(int id, String name, String city, int age, int courseId) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		this.age = age;
		this.courseId = courseId;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public int getAge() {
		return age;
	}

	

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", city=" + city + ", age=" + age + ", courseId=" + courseId
				+ "]";
	}


	public void setAge(int age) {
		this.age = age;
	}


	public int getCourseId() {
		return courseId;
	}


	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
	
	
}
