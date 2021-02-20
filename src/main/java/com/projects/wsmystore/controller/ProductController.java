package com.projects.wsmystore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.projects.wsmystore.model.Product;
import com.projects.wsmystore.service.ProductService;

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
