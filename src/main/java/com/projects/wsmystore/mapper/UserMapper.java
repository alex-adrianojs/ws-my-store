package com.projects.wsmystore.mapper;

import org.modelmapper.ModelMapper;

import com.projects.wsmystore.entity.UserEntity;
import com.projects.wsmystore.model.User;


public class UserMapper {
	public static User entityToDto(UserEntity entity) {

		ModelMapper mapper = new ModelMapper();

		User commerce = mapper.map(entity, User.class);
		return commerce;

	}

	public static UserEntity dtoToEntity(User commerce) {

		ModelMapper mapper = new ModelMapper();

		UserEntity entity = mapper.map(commerce, UserEntity.class);

		return entity;

	}
}
