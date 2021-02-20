package com.projects.wsmystore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projects.wsmystore.entity.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, Integer> {

}
