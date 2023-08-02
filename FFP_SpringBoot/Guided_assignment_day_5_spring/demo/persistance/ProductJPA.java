package com.example.demo.persistance;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Product;

public interface ProductJPA extends JpaRepository<Product, Integer> {

}
