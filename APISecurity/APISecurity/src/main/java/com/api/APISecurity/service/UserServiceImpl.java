package com.api.APISecurity.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.api.APISecurity.bean.User;

@Component
public class UserServiceImpl implements UserService {

	private static List<User> users = new ArrayList<>();

	static {
		User admin = new User(1, "Admin", "admin@gmail.com");
		User support = new User(2, "Support", "support@gmail.com");
		User test = new User(3, "Test", "test@gmaill.com");

		users.add(admin);
		users.add(support);
		users.add(test);
	}

	@Override
	public List<User> getAllUser() {
		return users;
	}

	@Override
	public User getUserById(int id) {
		for (User user : users) {
			if (user.getId() == id) {
				return user;
			}
		}
		return null;
	}

}