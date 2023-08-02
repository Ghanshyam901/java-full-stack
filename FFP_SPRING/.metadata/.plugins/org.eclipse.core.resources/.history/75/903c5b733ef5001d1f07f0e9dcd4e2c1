package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity   
@Table(name="Appointment") 
public class Appointment
{
@Id               
@GeneratedValue(strategy = GenerationType.IDENTITY) 
@Column(name="id")  
private int id;
@Column(name="name")
private String name; 
@Column(name="age")  
private int age;
@Column (name="mobile_number")
private long mobile_number;
@Column (name="symptoms")
private String symptoms;
@Column (name="lab_test")
private String lab_test;
@Column (name="fees")
private int fees;

public Appointment() {
	
}

public Appointment(int id, String name, int age, long mobile_number, String symptoms, String lab_test, int fees) {
	this.id = id;
	this.name = name;
	this.age = age;
	this.mobile_number = mobile_number;
	this.symptoms = symptoms;
	this.lab_test = lab_test;
	this.fees = fees;
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


public int getAge() {
	return age;
}


public void setAge(int age) {
	this.age = age;
}


public long getMobile_number() {
	return mobile_number;
}


public void setMobile_number(long mobile_number) {
	this.mobile_number = mobile_number;
}


public String getSymptoms() {
	return symptoms;
}


public void setSymptoms(String symptoms) {
	this.symptoms = symptoms;
}


public String getLab_test() {
	return lab_test;
}


public void setLab_test(String lab_test) {
	this.lab_test = lab_test;
}


public int getPrice() {
	return fees;
}


public void setPrice(int price) {
	this.fees = price;
}


@Override
public String toString() {
	return "Appointment [id=" + id + ", name=" + name + ", age=" + age + ", mobile_number=" + mobile_number
			+ ", symptoms=" + symptoms + ", lab_test=" + lab_test + ", fees=" + fees + "]";
}






	

}
