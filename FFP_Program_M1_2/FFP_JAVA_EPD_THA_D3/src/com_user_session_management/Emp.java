package com_user_session_management;

public class Emp {
	private int id;
	private double salary;
	private String name,email,password;
	
	
	public Emp(){
		
	}


	public Emp(int id, double salary, String name, String email, String password) {
		super();
		this.id = id;
		this.salary = salary;
		this.name = name;
		this.email = email;
		this.password = password;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public double getSalary() {
		return salary;
	}


	public void setSalary(double salary) {
		this.salary = salary;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	@Override
	public String toString() {
		return "Emp [id=" + id + ", salary=" + salary + ", name=" + name + ", email=" + email + ", password=" + password
				+ "]";
	}
	
	
	
}
