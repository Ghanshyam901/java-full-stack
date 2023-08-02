package com.example.demo.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.demo.enity.Employee;
import com.example.demo.persistance.DepartmentJpa;
import com.example.demo.persistance.EmployeeJpa;

@Service
public class Service_implementation implements Service_Decelaration {

//	private Service_Decelaration serviced;
	
	private EmployeeJpa empjpa;
	private DepartmentJpa depjpa;
	
	
	@Autowired
	public Service_implementation(EmployeeJpa empjpa, DepartmentJpa depjpa) {
	
		this.empjpa = empjpa;
		this.depjpa = depjpa;
	}
	
	@Override
	@Transactional
	public List<Employee> getEmpByDeptId(int deptId) {
		
		List<Employee> list =  empjpa.findEmpByDeptId(deptId);
		
		return list;
	}


	@Override
	@Transactional
	public List<Employee> getEmpByName(String name ,String lname) {
		
		List<Employee> all = empjpa.searchEmployees(name, lname);
		
		return all;
	}

	@Override
	@Transactional
	public void addEmployee(Employee emp) {
		
		empjpa.save(emp);
		
	}

	@Override
	@Transactional
	public void updateEmployee(Employee emp) {
		
		empjpa.save(emp);
		
	}

	@Override
	@Transactional
	public List<Employee> getallEmp() {
		
		List<Employee> allemp = empjpa.findAll();
		return allemp;
	}

	@Override
	@Transactional
	public void deleteEmp(int id) {
		// TODO Auto-generated method stub
		empjpa.deleteById(id);
	}

	@Override
	@Transactional
	public Employee getEmpByid(int id) {
		return empjpa.findEmpById(id);
	}
	
//	-------------------- course add -------------------------------------------------------------------
	

}
