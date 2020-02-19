package com.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class NotificationService implements Service {

	@Autowired
	@Qualifier("h2Connection")
	private Connection connection;
	
	@Override
	public void all() {
		connection.connectionType();
		System.out.println("Read all Notifications");

	}

}
