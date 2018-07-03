package com.classpath.spring.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Customer {
public static void main(String[] args) {
	
	ApplicationContext context =new AnnotationConfigApplicationContext(AppConfig.class);
	
	
	Mobile mobile=context.getBean("mobile",Mobile.class);
	
	
	mobile.getCamera();
	mobile.getScreen();
	
	
	
}
}
