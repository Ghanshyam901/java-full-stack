package com_Employee;

public class Employee {
	private int empId;
	private String name;
	private double salary;
	private String gender;
	private String loginId;
	private String password;
	public Employee() {
		
	}
	public Employee(int empId, String name, double salary, String gender, String loginId, String password) {
		super();
		this.empId = empId;
		this.name = name;
		this.salary = salary;
		this.gender = gender;
		this.loginId = loginId;
		this.password = password;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getLoginId() {
		return loginId;
	}
	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", salary=" + salary + ", gender=" + gender
				+ ", loginId=" + loginId + ", password=" + password + "]";
	}
	
}