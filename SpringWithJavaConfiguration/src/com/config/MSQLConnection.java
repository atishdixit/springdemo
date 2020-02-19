package com.config;

import org.springframework.stereotype.Component;

@Component("mysql")
public class MSQLConnection implements Connection {

	@Override
	public void connectionType() {
		System.out.println("MYSQL COnnection is connecting");
	}

}
