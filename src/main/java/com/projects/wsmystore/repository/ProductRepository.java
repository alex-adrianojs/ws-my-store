package com.projects.wsmystore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projects.wsmystore.entity.ProductEntity;

public interface ProductRepository extends JpaRepository<ProductEntity, Integer> {

}
