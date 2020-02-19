package com.config;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.config")
@PropertySource("classpath:info.properties")
public class configuration {

	@Value("${email}")
	private String email;
	@Bean("map")
	public Map<String, String> getMap() {
		return new HashMap<>();
	}


	@Bean("date")
	public Date getCurrentDate() {
		return new Date();
	}
	
	@Bean("email")
	public String getEmail() {
		return email;
	}
}
