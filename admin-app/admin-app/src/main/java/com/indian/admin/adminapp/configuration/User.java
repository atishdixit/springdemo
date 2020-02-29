package com.indian.admin.adminapp.configuration;

import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

public class User {
	private String name;

	public User(String username) {
		this.name = username;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
