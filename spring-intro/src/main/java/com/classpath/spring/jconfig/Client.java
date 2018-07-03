package com.classpath.spring.jconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.classpath.spring.annotation.AppConfig;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig1.class);
		Customer customer = context.getBean("customer", Customer.class);
		Pizza pizza = customer.orderPizza();
		System.out.println(pizza);
	}

}
