package com.annotation;

import org.springframework.stereotype.Component;

@Component("color")
public class ColorFormatter implements Format {

	@Override
	public void format() {
		System.out.println("Color format is done");
	}

}
