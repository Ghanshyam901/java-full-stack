package com.example.demo.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Product;
import com.example.demo.persistance.ProductJPA;


@Service
public class Service_implementation implements Service_deceleration {

	
	private ProductJPA pdjpa;
	
	@Autowired
	public Service_implementation(ProductJPA pdjpa) {
		
		this.pdjpa = pdjpa;
	}

	@Override
	@Transactional
	public List<Product> displayAll() {
		
		List<Product> allemp = pdjpa.findAll();
		return allemp;
	}

	@Override
	@Transactional
	public void InsertProd(Product p) {
		
		
	}

	@Override
	@Transactional
	public void deleteProduct(int id) {	
		pdjpa.deleteById(id);
	}
	
		
}

