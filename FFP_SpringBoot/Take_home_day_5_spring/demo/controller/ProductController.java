package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


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
	
	
//	@GetMapping("/list")
//	public String getAllProduct(Model model){
//		
//		List<Product> pd = serImp.displayAll();
//		model.addAttribute("PRODUCT",pd);
//		return "product/product-list";
//	}
	
	@GetMapping("/delete")
	public String deleteEmployeeBasedOnId(@RequestParam("productId") int id)
	{
		serImp.deleteProduct(id);
		return "redirect:/product/list";
	}
	
	@GetMapping("/list")
	public String searchByname(Model model ,String name) {
		
			if(name != null) {
				List<Product> pd = serImp.findProductByName(name);
				 model.addAttribute("PRODUCT",pd);
				 return "product/searchproduct";
				
			}else {
				List<Product> pd = serImp.displayAll();
				model.addAttribute("PRODUCT",pd);
//				return "product/product-list";
			}
	
		return "product/product-list";
	}
	
	

}
