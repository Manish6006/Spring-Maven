package com.classpath.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context=new ClassPathXmlApplicationContext("applicationcontext.xml");
		
			//College college=(College)context.getBean("college");
			Student student=(Student) context.getBean("student",Student.class);
			//NewCollege newcoll=(NewCollege)context.getBean("NewCollege");
			//Address add=(Address) context.getBean("address", Address.class);
			//student.applyLeave(12);
			System.out.println(student.getAddress());
			
			
			
			
		
		
		
		
	}

}
