package com.example.demo.persistance;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Product;

@Repository
public class Product_jpa_Implementation implements Product_Decelaration {

	private EntityManager entitymanager;
	
	
	@Autowired
	public Product_jpa_Implementation(EntityManager entitymanager) {

		this.entitymanager = entitymanager;
	
	}

	@Override
	public List<Product> displayAll() {
		
		
		Query query = entitymanager.createQuery("from Product",Product.class);
		List<Product> list = query.getResultList();
		
		return list;
	}

	@Override
	public void insertProduct(Product p) {
		
//		Session session=entitymanager.unwrap(Session.class);
		entitymanager.merge(p);
	}

	@Override
	public void updateProduct(Product p) {
//		Session session=entitymanager.unwrap(Session.class);
		
		entitymanager.merge(p);
	}

	@Override
	public void deleteEmp(int id) {
		
		Query query=entitymanager.createQuery("delete from Employee where id=:id");
		query.setParameter("id",id);
		//executing query
		query.executeUpdate();

	}

	@Override
	public List<Product> searchProductByName(String name) {
		
//		Session session = entitymanager.unwrap(Session.class);
		Query query = entitymanager.createQuery("from Product where name=:name",Product.class);
		query.setParameter("name", name);
		
		List<Product> list = query.getResultList();
		
		return list;
	}

}
