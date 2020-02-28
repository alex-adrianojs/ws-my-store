package com.projects.wsstore.mapper;

import org.modelmapper.ModelMapper;

import com.projects.wsstore.entity.ProductEntity;
import com.projects.wsstore.model.Product;


public class ProductMapper {
	public static Product entityToDto(ProductEntity entity) {

		ModelMapper mapper = new ModelMapper();

		Product commerce = mapper.map(entity, Product.class);
		return commerce;

	}

	public static ProductEntity dtoToEntity(Product commerce) {

		ModelMapper mapper = new ModelMapper();

		ProductEntity entity = mapper.map(commerce, ProductEntity.class);

		return entity;

	}
}
