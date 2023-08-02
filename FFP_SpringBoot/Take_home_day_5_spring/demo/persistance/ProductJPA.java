package com.example.demo.persistance;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.entity.Product;


public interface ProductJPA extends JpaRepository<Product, Integer> {

	
	 @Query("from Product where name=?1")
	    public List<Product> searchProductByName(String name);
}
