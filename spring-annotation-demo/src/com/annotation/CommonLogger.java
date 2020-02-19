package com.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component
public class CommonLogger implements Logger {

	private Format color;
	private Format text;

	@Autowired
	public CommonLogger(@Qualifier("text") Format color, @Qualifier("color") Format text) {
		super();
		this.color = color;
		this.text = text;
	}

	@Override
	public void log() {
		System.out.println("Common loggre");

	}

}
