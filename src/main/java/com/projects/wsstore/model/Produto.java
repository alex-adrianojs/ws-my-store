package com.projects.wsstore.model;

import javax.persistence.Entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Produto {

	private Integer id;
	private String  nome;
	private Double  preco;
	
}
