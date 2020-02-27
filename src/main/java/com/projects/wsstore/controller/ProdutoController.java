package com.projects.wsstore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.projects.wsstore.model.Produto;
import com.projects.wsstore.model.User;
import com.projects.wsstore.service.ProdutoService;

@Controller
@RequestMapping("/ws-store/produto")
public class ProdutoController {
	
	@Autowired
	ProdutoService produtoSv;
	
	@PostMapping("/salvar")
	public ResponseEntity<Produto> createProduto(@RequestBody Produto produto){
		produtoSv.createProduto(produto);
		return ResponseEntity.ok().body(produto);		
	}
	
	
	
}
