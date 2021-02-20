package com.projects.wsmystore.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projects.wsmystore.entity.UserEntity;
import com.projects.wsmystore.mapper.UserMapper;
import com.projects.wsmystore.model.User;
import com.projects.wsmystore.repository.UserRepository;

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
