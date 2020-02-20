package com.projects.wsstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projects.wsstore.entity.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, Integer> {

}
