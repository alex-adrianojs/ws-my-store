package com.projects.wsstore.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projects.wsstore.entity.PurchaseEntity;
import com.projects.wsstore.mapper.PurchaseMapper;
import com.projects.wsstore.model.Purchase;
import com.projects.wsstore.repository.PurchaseRepository;

@Service
public class PurchaseService {
	
	@Autowired
	PurchaseRepository repository;
	
	
	public boolean createPurchase(Purchase purchase) {
		
		PurchaseEntity entity = PurchaseMapper.dtoToEntity(purchase);
		
		repository.save(entity);
		
		return true;
		
	}
}
