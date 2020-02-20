package com.projects.wsstore.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.projects.wsstore.model.User;

@Controller
@RequestMapping("/ws-store/user")
public class UserController {
	
	@PostMapping("create-user")
	public ResponseEntity<User> createUuser(){
		return null;		
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
