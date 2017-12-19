package com.yyq.dispatch;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App1 {
	public static void main(String[] args) {
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/yyq/dispatch/beans.xml");
		DButil dButil = (DButil)applicationContext.getBean("dbutil1");
		System.out.println(dButil.getName() + dButil.getPasswd());
	
	}

}
