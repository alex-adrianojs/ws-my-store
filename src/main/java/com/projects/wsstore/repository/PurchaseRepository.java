package com.projects.wsstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projects.wsstore.entity.PurchaseEntity;

public interface PurchaseRepository extends JpaRepository<PurchaseEntity, Integer> {

}
