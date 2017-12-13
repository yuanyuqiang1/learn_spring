package com.yyq.parent;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App1 {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/yyq/parent/beans.xml");
		GruateStudent gruateStudent = (GruateStudent)applicationContext.getBean("gruatestudent");
		System.out.println(" " + gruateStudent.getName() + gruateStudent.getAge() + gruateStudent.getDegree());
	}

}
