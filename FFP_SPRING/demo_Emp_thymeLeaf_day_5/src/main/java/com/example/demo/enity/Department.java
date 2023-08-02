package com.example.demo.enity;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Department")
public class Department {
	@Id
	
	@Column(name="id")
	private int id;
	@Column(name="name")
	private String name;
	
	@OneToMany(mappedBy = "department")
	
	private Set<Employee> employees;
	
	public Department() {
		
	}

	public Department(int id, String name) {
		super();
		this.id = id;
		this.name = name;
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

	@Override
	public String toString() {
		return "Department [id=" + id + ", name=" + name + "]";
	}
	
	
	
}
