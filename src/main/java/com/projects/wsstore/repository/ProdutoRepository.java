package com.projects.wsstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projects.wsstore.entity.ProdutoEntity;

public interface ProdutoRepository extends JpaRepository<ProdutoEntity, Integer> {

}
