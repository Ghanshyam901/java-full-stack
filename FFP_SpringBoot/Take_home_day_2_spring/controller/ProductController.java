package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Product;
import com.example.demo.service.Service_implementation;

@RestController
@RequestMapping("product")
public class ProductController {

	private Service_implementation serImp;
	
	@Autowired
	public ProductController(Service_implementation serImp) {
		super();
		this.serImp = serImp;
	}
	
	@GetMapping("list")
	public List<Product> getAllProduct(){
		List<Product> product = serImp.displayAll();
		
		return product;
	}
	
	@PostMapping("list")
	public void insertProduct(@RequestBody Product pr) {
		pr.setId(0);
		serImp.InsertProd(pr);
	}
	
	@PutMapping("list")
	public void UpdateProduct(@RequestBody Product pr) {
		
		serImp.UpdateProd(pr);
	}
	
	@DeleteMapping("/delete/{id}")
	
	public void deleteById(@PathVariable("id") int id) {
		serImp.deleteProductById(id);
	}
	
	

}
