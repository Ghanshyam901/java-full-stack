package com.example.demo.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Product;
import com.example.demo.persistance.Product_Implementation;

@Service
public class Service_implementation implements Service_deceleration {
	
	private Product_Implementation prod;
	
	@Autowired
	public Service_implementation(Product_Implementation prod) {
		super();
		this.prod=prod;
	}

	@Override
	@Transactional
	public List<Product> displayAll() {
		return prod.displayAll();
	}

	@Override
	@Transactional
	public void InsertProd(Product p) {
		
		prod.insertProduct(p);
		
	}

	@Override
	@Transactional
	public void UpdateProd(Product p) {
		prod.updateProduct(p);
		
	}

	@Override
	@Transactional
	public void deleteProductById(int id) {
		
		prod.deleteEmp(id);
		
	}
	
	
	
		
}

