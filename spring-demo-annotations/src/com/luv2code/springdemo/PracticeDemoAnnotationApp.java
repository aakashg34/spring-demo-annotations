package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PracticeDemoAnnotationApp {

	
			// read spring config file
			ClassPathXmlApplicationContext cont = 
					new ClassPathXmlApplicationContext("applicationContext.xml");
			
			// get the bean from spring container
			Coach theCoach = cont.getBean("tennisCoach",Coach.class);
			

			// call a method on the bean
			
			
			// close the context
			
			
}
