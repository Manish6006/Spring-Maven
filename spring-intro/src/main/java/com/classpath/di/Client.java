package com.classpath.di;

public class Client {

	
	public static void main(String[] args) {
		College college = new College();
		NewCollege newCollege = new NewCollege();
		Student student = new Student(college);
		//student.setCollegeService(newCollege);
		//giving error because we cannot assign new college to 
		//student because we have already tight binded student with old college.
		
		student.applyLeave(10);
	}
	
	
}
