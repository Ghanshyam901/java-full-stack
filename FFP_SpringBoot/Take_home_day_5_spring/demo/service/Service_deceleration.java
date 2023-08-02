package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Product;

public interface Service_deceleration {
	
	public List<Product> displayAll();
	public void InsertProd(Product p);
	public void deleteProduct(int id);
	
	public List<Product> findProductByName(String name);
	
}
