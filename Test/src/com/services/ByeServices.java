package com.services;

public class ByeServices {

	private String age;

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}
	
	public void sayBye() {
		System.out.println("bye " + age);
	}
}
