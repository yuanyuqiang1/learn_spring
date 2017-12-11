package com.yyq.ioc;

public class Student {
	private String name;
	
	public Student() {
		System.out.println("use student method");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
