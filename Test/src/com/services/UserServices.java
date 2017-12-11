package com.services;

public class UserServices {
	
	private String name;
	private ByeServices byeServices;

	public ByeServices getByeServices() {
		return byeServices;
	}

	public void setByeServices(ByeServices byeServices) {
		this.byeServices = byeServices;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void sayHello() {
		System.out.println("hello " + name);
		byeServices.sayBye();
	}
}
