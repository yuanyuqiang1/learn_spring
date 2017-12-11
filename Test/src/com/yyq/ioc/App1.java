package com.yyq.ioc;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.core.io.ClassPathResource;

import com.util.ApplicationContextUtil;

public class App1 {
	public static void main(String[] args) {
		
		//use applicationcontext,when we create applicationcontext,object had been new
		ApplicationContext applicationContext = ApplicationContextUtil.getApplicationContext();
		
		Student student = (Student)applicationContext.getBean("student");
		Student student2 = (Student)applicationContext.getBean("student");
		System.out.println(student +  " " + student2);
		
		//System.out.println(((Student)applicationContext.getBean("student")).getName());
		
		//use beanfactory to get bean,
//		BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("com/yyq/ioc/beans.xml"));
//		System.out.println(((Student)beanFactory.getBean("student")).getName());
	}

}
