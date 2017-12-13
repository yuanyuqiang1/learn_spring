package com.yyq.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App1 {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/yyq/autowire/beans.xml");
		Master master = (Master)applicationContext.getBean("master");
		System.out.println(master.getName() + " " + master.getDog().getName());
	}

}
