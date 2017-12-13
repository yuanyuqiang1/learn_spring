package com.yyq.construct;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App1 {
	public static void main(String[] args) {
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/yyq/construct/beans.xml");
		Employee employee = (Employee)applicationContext.getBean("employee");
		System.out.println(employee.getName() + employee.getAge());
	}

}
