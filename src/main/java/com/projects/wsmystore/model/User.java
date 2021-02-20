package com.projects.wsmystore.model;

import java.util.Date;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class User {
	
	private Integer id;
	private String name;
	private String email;
	private String password;
	private Date birthday;
	private Integer fone;
	private String profile;

}
