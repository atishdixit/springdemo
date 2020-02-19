package com.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("dbLogger")
public class BDLogger implements Logger {

	@Autowired
	@Qualifier("color")
	private Format format;
	
	public BDLogger(){
		
	}
	
	
	@Override
	public void log() {
	
		this.format.format();
		System.out.println("Data base logger");
	}

	public Format getFormat() {
		return format;
	}

//	@Autowired
//	public void setFormat(Format format) {
//		System.out.println("setFormat");
//		this.format = format;
//	}


//	@Autowired
//	public void settFormat(Format format) {
//		System.out.println("settFormatsettFormat");
//		this.format = format;
//	}

	
}
