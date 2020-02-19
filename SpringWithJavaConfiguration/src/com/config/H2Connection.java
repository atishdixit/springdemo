package com.config;

import org.springframework.stereotype.Component;

@Component
public class H2Connection implements Connection {

	@Override
	public void connectionType() {
		System.out.println("H2 Connection is connecting");
	}

}
