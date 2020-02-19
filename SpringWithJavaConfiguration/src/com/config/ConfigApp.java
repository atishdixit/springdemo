package com.config;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ConfigApp {

	public static void main(String[] args) {
		 	AnnotationConfigApplicationContext applicationContext =  
		 			new AnnotationConfigApplicationContext(configuration.class);
		 	
		 	Service service = applicationContext.getBean("userService", Service.class);
		 	service.all();
		 	
		 	System.out.println(applicationContext.getBean("map"));

		 	System.out.println(applicationContext.getBean("date"));
		 	System.out.println(applicationContext.getBeanDefinitionCount());
		 	
		 	
		 	System.out.println(applicationContext.getBean("email"));
		 	

	}

}
