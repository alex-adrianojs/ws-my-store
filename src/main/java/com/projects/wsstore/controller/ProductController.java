package com.projects.wsstore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.projects.wsstore.model.Product;
import com.projects.wsstore.service.ProductService;

@Controller
@RequestMapping("/ws-store/product")
public class ProductController {
	
	@Autowired
	ProductService productSv;
	
	@PostMapping("/create-product")
	public ResponseEntity<Product> createProduct(@RequestBody Product product){
		productSv.createProduct(product);
		return ResponseEntity.ok().body(product);		
	}
	
	
	
}
