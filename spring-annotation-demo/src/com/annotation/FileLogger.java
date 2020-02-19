package com.annotation;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("fileLogger")
@Scope("prototype")
public class FileLogger implements Logger {

	@Autowired
	@Qualifier("text")
	private Format format;
	
//	public FileLogger(Format format) {
//		super();
//		this.format = format;
//	}

	@Override
	public void log() {
		this.format.format();
		System.out.println("File logger");

	}
	
	//Life Cycle of Beans
	
	
	@PostConstruct
	public void post() {
		System.out.println("post");
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("Destroyed");
	}

}
