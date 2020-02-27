package com.projects.wsstore.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projects.wsstore.entity.ProdutoEntity;
import com.projects.wsstore.mapper.ProdutoMapper;
import com.projects.wsstore.model.Produto;
import com.projects.wsstore.repository.ProdutoRepository;

@Service
public class ProdutoService {
	
	@Autowired
	ProdutoRepository repository;
	
	
	public boolean createProduto(Produto produto) {
		
		ProdutoEntity entity = ProdutoMapper.dtoToEntity(produto);
		
		repository.save(entity);
		
		return true;
		
	}
}
