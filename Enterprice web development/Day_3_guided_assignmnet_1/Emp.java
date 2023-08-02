package com_day_3_java;

public class Emp {

	private int Id;
	private String Name;
	private double salary;
	private String loginId , loginPassword;
	
	public Emp(){
		
		
		
	}

	public Emp(int id, String name, double salary, String loginId, String loginPassword) {
		super();
		Id = id;
		Name = name;
		this.salary = salary;
		this.loginId = loginId;
		this.loginPassword = loginPassword;
	}
	



	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getLoginId() {
		return loginId;
	}

	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}

	public String getLoginPassword() {
		return loginPassword;
	}

	public void setLoginPassword(String loginPassword) {
		this.loginPassword = loginPassword;
	}

	@Override
	public String toString() {
		return "Emp [Id=" + Id + ", Name=" + Name + ", salary=" + salary + ", loginId=" + loginId + ", loginPassword="
				+ loginPassword + "]";
	}
	
	
	
}
