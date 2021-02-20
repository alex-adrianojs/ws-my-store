package com.projects.wsmystore.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projects.wsmystore.entity.ProductEntity;
import com.projects.wsmystore.mapper.ProductMapper;
import com.projects.wsmystore.model.Product;
import com.projects.wsmystore.repository.ProductRepository;

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
