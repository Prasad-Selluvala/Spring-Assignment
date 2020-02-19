package com.cts.product.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cts.product.entity.Product;
import com.cts.product.service.ProductService;

@Controller
public class ProductController {

	
	@Autowired
	private ProductService service;
	
	@RequestMapping("saveprod")
	public void saveEmployee(@ModelAttribute Product prod) {
		
		service.saveProducts(prod);
	}
	
	@RequestMapping("viewproducts")
	public String viewEmployee(Model model)
	{
		model.addAttribute("prod", new Product());
		model.addAttribute("viewProducts", service.viewProducts());
		return "view";
		
	}
		
		
	
	
	
	
	
	
}
