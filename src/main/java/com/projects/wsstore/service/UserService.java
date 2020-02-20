package com.projects.wsstore.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projects.wsstore.entity.UserEntity;
import com.projects.wsstore.mapper.UserMapper;
import com.projects.wsstore.model.User;
import com.projects.wsstore.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	UserRepository userRp;
	
	/**
	 * Metodo que criar usuario
	 * @param user
	 * @return
	 */
	public boolean createUser(User user) {
		
		UserEntity entity = UserMapper.dtoToEntity(user);
		
		userRp.save(entity);
		
		return true;
		
	}
}
