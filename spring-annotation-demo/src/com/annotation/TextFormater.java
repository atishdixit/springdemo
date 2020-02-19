package com.annotation;

import org.springframework.stereotype.Component;

@Component("text")
public class TextFormater implements Format {

	@Override
	public void format() {
		System.out.println("TextFormater");
	}

}
