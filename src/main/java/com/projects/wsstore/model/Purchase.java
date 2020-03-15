package com.projects.wsstore.model;

import java.util.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.projects.wsstore.entity.UserEntity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Purchase {

	
	private Integer    id;
	private Date       instant;
	private UserEntity user;
	
}
