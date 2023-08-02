package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Id;


@Entity   //regarding entity details
@Table(name="Product") //table name

public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Column(name="Id")
	private int Id;
	
	@Column(name="Name")
	private String Name;
	
	@Column(name="Price")
	private double Price;
	
	@Column(name="Description")
	private String Description;
	
	
	
	public Product() {
	
		// TODO Auto-generated constructor stub
	}

	public Product(int id, String name, double Price, String description) {
		
		Id = id;
		Name = name;
		this.Price = Price;
		Description = description;
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

	public double getPrice() {
		return Price;
	}

	public void setPrice(double price) {
		this.Price = price;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

	@Override
	public String toString() {
		return "Product [Id=" + Id + ", Name=" + Name + ", price=" + Price + ", Description=" + Description + "]";
	}
	
	
	
	
}
