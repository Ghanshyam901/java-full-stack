package com.example.demo.service;

import java.util.List;

import com.example.demo.enity.Employee;

public interface Service_Decelaration {

		// student
	
		public List<Employee> getEmpByDeptId(int deptId);
		public List<Employee> getEmpByName(String fname,String lname);
		public void addEmployee(Employee emp);
		public void updateEmployee(Employee emp);
		public List<Employee> getallEmp();
		
		// course
		
//		public void addCourse(Course cs);
		
		
}
