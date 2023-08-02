package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Product;
import com.example.demo.service.Service_implementation;

@Controller
@RequestMapping("product")
public class ProductController {

	private Service_implementation serImp;
	
	@Autowired
	public ProductController(Service_implementation serImp) {
		
		this.serImp = serImp;
	}
	
	
	@GetMapping("/list")
	public String getAllProduct(Model model){
		List<Product> pd = serImp.displayAll();
		model.addAttribute("PRODUCT",pd);
		
		return "product/product-list";
	}
	
	@GetMapping("/delete")
	public String deleteEmployeeBasedOnId(@RequestParam("employeeId") int id)
	{
		serImp.deleteProduct(id);
		return "redirect:/product/list";
	}
	
	
	

}
