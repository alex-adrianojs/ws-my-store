package com.projects.wsstore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.projects.wsstore.model.User;
import com.projects.wsstore.service.UserService;

@Controller
@RequestMapping("/ws-store/user")
public class UserController {
	
	@Autowired
	UserService userSv;
	
	@PostMapping("create-user")
	public ResponseEntity<User> createUuser(@RequestBody User user){
		userSv.createUser(user);
		return ResponseEntity.ok().body(user);		
	}
	
	@GetMapping("get-users")
	public ResponseEntity<User> getUsers(){
		return null;
	} 
	
	@GetMapping("get-user/{id}")
	public ResponseEntity<User> getUser(){
		return null;
		
	}
	
	@PutMapping("update-ser")
	public ResponseEntity<User> updateUser(){
		return null;
	}
	
	@DeleteMapping("delete-user")
	public ResponseEntity<User> deleteUser(){
		return null;
	}
	
}
