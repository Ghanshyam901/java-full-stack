package com.example.demo.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Product;
import com.example.demo.persistance.Product_Decelaration;
import com.example.demo.persistance.Product_Implementation;

@Service
public class Service_implementation implements Service_deceleration {
	
	private Product_Decelaration prod;
	
	@Autowired
	public Service_implementation(@Qualifier("product_jpa_Implementation") Product_Decelaration prod) {
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

	@Override
	@Transactional
	public List<Product> findByName(String name) {
		// TODO Auto-generated method stub
		List<Product> list = prod.searchProductByName(name);
		return list;
	}
	
	
	
		
}

