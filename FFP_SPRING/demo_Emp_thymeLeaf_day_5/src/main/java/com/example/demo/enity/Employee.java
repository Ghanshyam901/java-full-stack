package com.example.demo.enity;

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
@Table(name="Employee")
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Column(name="id")
	private int id;
	@Column(name="first_name")
	private String firstName;
	@Column(name="last_name")
	private String lastName;
	@Column(name="email")
	private String email;
	@Column(name="dept_id")
	private Integer dept_id;
	
	
	@ManyToOne(targetEntity = Department.class,fetch = FetchType.EAGER)
	@JoinColumn(name="dept_id",insertable = false,updatable = false)
	private Department department;
	
	
	public Employee() {
		
	}

	public Employee(int id, String firstName, String lastName, String email, Integer dept_id) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.dept_id = dept_id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getDept_id() {
		return dept_id;
	}

	public void setDept_id(Integer dept_id) {
		this.dept_id = dept_id;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", dept_id=" + dept_id + "]";
	}
	
	
	
	
	
}
