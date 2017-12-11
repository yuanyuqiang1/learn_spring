package com.util;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class ApplicationContextUtil {
	private static ApplicationContext applicationContext = null;
	
	static {
		applicationContext = new ClassPathXmlApplicationContext("com/yyq/ioc/beans.xml");
	}
	
	public static ApplicationContext getApplicationContext() {
		return applicationContext;
	}

}
