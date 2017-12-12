package com.yyq.beanlife;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;



public class App1 {
	
	public static void main(String[] args) {
		
		//ApplicationContext applicationContext = ApplicationContextUtil.getApplicationContext();
//		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/yyq/beanlife/beans.xml");
//		PersonService pService = (PersonService)applicationContext.getBean("personService");
//		pService.sayHi();
		
		//use beanfactory to get bean,
		BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("com/yyq/beanlife/beans.xml"));
		PersonService pService = (PersonService)beanFactory.getBean("personService");
		pService.sayHi();
	}
	

}
