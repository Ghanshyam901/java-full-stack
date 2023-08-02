package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.enity.Employee;
import com.example.demo.service.Service_implementation;

@Controller
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
	
	
	@PutMapping("/list")
	public void updateEmployeeDetails(@RequestBody Employee emp) {
		
		service.updateEmployee(emp);
	}
//	------------------- thyemlaef
	@GetMapping("/lists")
	public String getAllEmp(Model model){
		
		List<Employee> emp = service.getallEmp();
		model.addAttribute("EMPLOYEES",emp);
		
		return "employee/list-employee";
	}
	
	@GetMapping("/showFormForAdd")
	public String displayForm(Model model) {
		
		Employee em = new Employee();
		model.addAttribute("EMPLOYEE",em);
		return "employee/employee-form";
	}
	
	@PostMapping("/save")
	public String addEmployees(@ModelAttribute("EMPLOYEE") Employee emp) {
		
		service.addEmployee(emp);
		return "redirect:/employees/lists";
		
	}
	
	@PutMapping("/save") 
	public String updationEmployee(@ModelAttribute("EMPLOYEE") Employee emp)
	{
		service.updateEmployee(emp);
		return "redirect:/employees/lists";
	}
	
	
	@GetMapping("/showFormForUpdate")
	public String displayFormWithOldData(@RequestParam("employeeId") int id,Model model)
	{
		Employee emp=service.getEmpByid(id);
		model.addAttribute("EMPLOYEE",emp);
		return "employee/employee-form";
	}
	
	
	@GetMapping("/delete")
	public String deleteEmployeeBasedOnId(@RequestParam("employeeId") int id)
	{
		service.deleteEmp(id);
		return "redirect:/employees/lists";
	}
	
}
