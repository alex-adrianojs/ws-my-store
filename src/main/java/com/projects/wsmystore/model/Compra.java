package com.projects.wsmystore.model;

import java.util.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.projects.wsmystore.entity.UserEntity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Compra {

	
	private Integer id;
	private Date instant;
	private UserEntity user;
	
}
