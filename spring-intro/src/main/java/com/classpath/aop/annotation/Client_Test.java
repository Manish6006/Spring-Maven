package com.classpath.aop.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
	      
	      Student student = (Student) context.getBean("studentProxy");
	      student.getName();
		
		
		
	}

}
