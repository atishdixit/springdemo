package com.annotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemo {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Logger logger1 = context.getBean("dbLogger", Logger.class);
		logger1.log();
		
		Logger comlogger = context.getBean("commonLogger", Logger.class);
		comlogger.log();
		
		//Scop test
		Logger logger11 = context.getBean("fileLogger", Logger.class);
		logger11.log();
		
		Logger logger12 = context.getBean("fileLogger", Logger.class);
		logger11.log();
			
		System.out.println(logger11.hashCode());
		System.out.println(logger12.hashCode());
		context.close();
	}

}
