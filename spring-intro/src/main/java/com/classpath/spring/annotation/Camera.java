package com.classpath.spring.annotation;

import org.springframework.stereotype.Component;

@Component
public class Camera {

	
	private String type;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
		System.out.println( "Camera [type=" + type + "]");
	}

	@Override
	public String toString() {
	return "Camera [type=" + type + "]";
	}
	
	
	
	
	
}
