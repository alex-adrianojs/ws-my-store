package com.projects.wsstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projects.wsstore.entity.ProductEntity;

public interface ProductRepository extends JpaRepository<ProductEntity, Integer> {

}
