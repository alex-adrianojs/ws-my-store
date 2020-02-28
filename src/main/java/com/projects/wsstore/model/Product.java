package com.projects.wsstore.model;

import javax.persistence.Entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Product {

	private Integer id;
	private String  name;
	private Double  price;
	
}
