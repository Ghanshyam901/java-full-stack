package com.example.demo.persistance;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Student;


@Repository
public class Student_Implementation implements Student_Deceleration {

	
	private EntityManager entitymanager;
	
	
	@Autowired
	public Student_Implementation(EntityManager entitymanager) {
//		super();
		this.entitymanager = entitymanager;
		// TODO Auto-generated constructor stub
	}
	
	
	
	@Override
	public List<Student> showAllStudent() {
		
		Session session = entitymanager.unwrap(Session.class);
		Query<Student> query = session.createQuery("from Student",Student.class);
		List<Student> list = query.getResultList();
		
		return list;
	}

	@Override
	public void AddStudentDetails(Student s) {
		
		Session session=entitymanager.unwrap(Session.class);
		session.saveOrUpdate(s);
		
	}

	@Override
	public void updateStudentDetails(Student s) {
		
		Session session=entitymanager.unwrap(Session.class);
		session.saveOrUpdate(s);
		
	}

	@Override
	public Student searchById(int id) {
		
		Session session=entitymanager.unwrap(Session.class);
		Student st=session.find(Student.class,id);
		return st;
		
	}

	@Override
	public void DeleteStudentById(int id) {
		Session session=entitymanager.unwrap(Session.class);
		Student st =session.find(Student.class,id);
		
		session.delete(st);
		System.out.print("deleted...");
		
	}



	@Override
	public List<Student> searchByCourse(String course) {
		
		Session session=entitymanager.unwrap(Session.class);	
		//creation of query
		Query<Student> query=session.createQuery("from Student where course=course",Student.class);
		//executing query
		List<Student> st=query.getResultList();
		//returning the result
		return st;
		
	}

}
