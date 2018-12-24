package com.rokin.spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

	@GetMapping("/users")
	public String getUsers() {
		return "Users";
	}
	
	
	@GetMapping("/")
	public String getUser() {
		return "asdas";
	}
}
