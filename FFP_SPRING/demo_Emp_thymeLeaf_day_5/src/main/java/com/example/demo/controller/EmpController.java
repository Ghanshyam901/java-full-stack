package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.enity.Employee;
import com.example.demo.service.Service_implementation;

@RestController
@RequestMapping("/employees")
public class EmpController {
	

	private Service_implementation service;
	@Autowired
	public EmpController(Service_implementation service) {
	
		this.service = service;
	}
	
	@GetMapping("/list/{deptid}")
	public List<Employee> getEmpByDeptIds(@PathVariable("deptid") int id){
		
		return service.getEmpByDeptId(id);
	}
	


	@GetMapping("/list2/{name}")
	public List<Employee> getEmpByDeptName(@PathVariable("name") String name){
		
		return service.getEmpByName(name,name);
		
	}
	
	@PostMapping("/list")
	public void addEmployees(@RequestBody Employee emp) {
		emp.setId(0);
		service.addEmployee(emp);
		
	}
	@PutMapping("/list")
	public void updateEmployeeDetails(@RequestBody Employee emp) {
		
		service.updateEmployee(emp);
	}
	@GetMapping("/list")
	public List<Employee> getAllEmp(){
		
		return service.getallEmp();
	}
	
}
