package com.yyq.beanlife;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class App1 {
	
	public static void main(String[] args) {
		
		//ApplicationContext applicationContext = ApplicationContextUtil.getApplicationContext();
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/yyq/beanlife/beans.xml");
		PersonService pService = (PersonService)applicationContext.getBean("personService");
		pService.sayHi();
		
	}
	

}
