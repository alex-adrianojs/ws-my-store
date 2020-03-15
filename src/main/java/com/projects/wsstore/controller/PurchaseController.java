package com.projects.wsstore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.projects.wsstore.model.Purchase;
import com.projects.wsstore.service.PurchaseService;

@Controller
@RequestMapping("/ws-store/purchase")
public class PurchaseController {
	
	@Autowired
	PurchaseService purchaseSv;
	
	@PostMapping("/create-product")
	public ResponseEntity<Purchase> createProduct(@RequestBody Purchase purchase){
		purchaseSv.createPurchase(purchase);
		return ResponseEntity.ok().body(purchase);		
	}
	
	
	
}
