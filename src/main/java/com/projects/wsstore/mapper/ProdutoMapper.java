package com.projects.wsstore.mapper;

import org.modelmapper.ModelMapper;

import com.projects.wsstore.entity.ProdutoEntity;
import com.projects.wsstore.entity.UserEntity;
import com.projects.wsstore.model.Produto;
import com.projects.wsstore.model.User;


public class ProdutoMapper {
	public static Produto entityToDto(ProdutoEntity entity) {

		ModelMapper mapper = new ModelMapper();

		Produto commerce = mapper.map(entity, Produto.class);
		return commerce;

	}

	public static ProdutoEntity dtoToEntity(Produto commerce) {

		ModelMapper mapper = new ModelMapper();

		ProdutoEntity entity = mapper.map(commerce, ProdutoEntity.class);

		return entity;

	}
}
