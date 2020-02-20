package com.projects.wsstore.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "USER")
public class UserEntity {
	
	private Integer id;
	private String name;
	private String email;
	private String password;
	private Date birthday;
	private Integer fone;

}
