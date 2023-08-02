package com.example.demo.persistance;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.query.Query;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Product;

@Repository
public class Product_Implementation implements Product_Decelaration {

	private EntityManager entitymanager;
	
	
	@Autowired
	public Product_Implementation(EntityManager entitymanager) {
//		super();
		this.entitymanager = entitymanager;
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<Product> displayAll() {
		
		Session session = entitymanager.unwrap(Session.class);
		Query<Product> query = session.createQuery("from Product",Product.class);
		List<Product> list = query.getResultList();
		
		return list;
	}

	@Override
	public void insertProduct(Product p) {
		
		Session session=entitymanager.unwrap(Session.class);
		session.saveOrUpdate(p);
	}

	@Override
	public void updateProduct(Product p) {
		Session session=entitymanager.unwrap(Session.class);
		session.saveOrUpdate(p);
	}

	@Override
	public void deleteEmp(int id) {
		
		Session session=entitymanager.unwrap(Session.class);
		Product pd =session.find(Product.class,id);
		
		session.delete(pd);
		System.out.print("deleted...");
		

	}

	@Override
	public List<Product> searchProductByName(String name) {
		
		Session session = entitymanager.unwrap(Session.class);
		Query<Product> query = session.createQuery("from Product where name=:name",Product.class);
		query.setParameter("name", name);
		List<Product> list = query.getResultList();
		
		return list;
	}

}
