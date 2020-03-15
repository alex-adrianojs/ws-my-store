package com.projects.wsstore.mapper;

import org.modelmapper.ModelMapper;

import com.projects.wsstore.entity.PurchaseEntity;
import com.projects.wsstore.entity.UserEntity;
import com.projects.wsstore.model.Purchase;
import com.projects.wsstore.model.User;

public class PurchaseMapper {

	public static Purchase entityToDto(PurchaseEntity entity) {
		
		ModelMapper mapper = new ModelMapper();
		
		Purchase commerce = mapper.map(entity, Purchase.class);
		return commerce;
		
	}
	
	public static PurchaseEntity dtoToEntity(Purchase commerce) {

		ModelMapper mapper = new ModelMapper();

		PurchaseEntity entity = mapper.map(commerce, PurchaseEntity.class);

		return entity;

	}
	
}
