package com.classpath.aop.annotation;

public class Student {

	private Integer age;
	private String names;

	public void setAge(Integer age) {
		this.age = age;
	}

	public Integer getAge() {
		System.out.println("Age : " + age);
		return age;
	}

	public void setName(String names) {
		this.names = names;
	}

	public String getName() {
		System.out.println("Name : " + names);
		return names;
	}

	public void printThrowException() {
		System.out.println("Exception raised");
		throw new IllegalArgumentException();
	}
	
	
}
