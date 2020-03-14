package com.api.APISecurity.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.api.APISecurity.bean.User;
import com.api.APISecurity.service.UserServiceImpl;

@RestController
public class UserController {

	@Autowired
	private UserServiceImpl userService;

	@GetMapping("/user/")
	public List<User> getAllUser() {
		return userService.getAllUser();
	}

	@GetMapping("/user/{userId}")
	public User getUser(@PathVariable int userId) {
		return userService.getUserById(userId);
	}
}