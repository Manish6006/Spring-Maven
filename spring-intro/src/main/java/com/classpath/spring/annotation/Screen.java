package com.classpath.spring.annotation;

import org.springframework.stereotype.Component;

@Component
public class Screen {

	private String name;
	private int len;
	private int wid;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getLen() {
		return len;
	}
	public void setLen(int len) {
		this.len = len;
	}
	public int getWid() {
		return wid;
	}
	public void setWid(int wid) {
		this.wid = wid;
	}
	@Override
	public String toString() {
		return "Screen [name=" + name + ", len=" + len + ", wid=" + wid + "]";
	}
	
	



}
