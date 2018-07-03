package com.classpath.spring.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Mobile {

	
	private Screen screen;
	private Camera camera;
	
	
	public Screen getScreen() {
		return screen;
	}
	
	@Autowired
	public void setScreen(Screen screen) {
		System.out.println("Setting Screen " + screen);
		this.screen = screen;
	}
	public Camera getCamera() {
		return camera;
	}
	
	@Autowired
	public void setCamera(Camera camera) {
		System.out.println("Setting Camera " + camera);
		this.camera = camera;
	}

	@Override
	public String toString() {
		return "Mobile [screen=" + screen + ", camera=" + camera + "]";
	}
	
	
	
}
