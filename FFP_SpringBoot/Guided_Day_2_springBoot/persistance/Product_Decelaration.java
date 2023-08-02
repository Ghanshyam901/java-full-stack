package com.example.demo.persistance;

import java.util.List;

import com.example.demo.entity.Product;

public interface Product_Decelaration {
		
	public List<Product> displayAll();
	public void insertProduct(Product p);
	public void updateProduct(Product p);
}
