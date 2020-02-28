package com.projects.wsstore.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projects.wsstore.entity.ProductEntity;
import com.projects.wsstore.mapper.ProductMapper;
import com.projects.wsstore.model.Product;
import com.projects.wsstore.repository.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	ProductRepository repository;
	
	
	public boolean createProduct(Product product) {
		
		ProductEntity entity = ProductMapper.dtoToEntity(product);
		
		repository.save(entity);
		
		return true;
		
	}
}
