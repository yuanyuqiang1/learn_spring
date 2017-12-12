package com.yyq.beanlife;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class PersonService implements BeanNameAware,BeanFactoryAware,ApplicationContextAware,InitializingBean{
	
	private int age;
	
	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}

	private String name;
	
	//自己写的方法，配在beans.xml中之后。会自动启动（定制初始化方法）
	
	@PostConstruct
	public void mmm() {
		System.out.println("自己写的bean init—method");
	}
	
	
//	public void sss() {
//		
//	}
//	
	//定制我们的销毁方法
	@PreDestroy
	public void sss() {
		System.out.println("用DisposableBean ,关闭bean，关闭数据库，socket 文件流，释放beans文件");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public PersonService() {
		System.out.println("create method!");
	}
	
	public void sayHi() {
		System.out.println("Hi " + name);
	}

	@Override
	public void setBeanName(String arg0) {
		// TODO Auto-generated method stub
		System.out.println("BeanName id : " +arg0);
		
	}

	@Override
	public void setBeanFactory(BeanFactory arg0) throws BeansException {
		System.out.println("BeanFactory is : " + arg0);
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setApplicationContext(ApplicationContext arg0) throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("applicationcontext " + arg0);
		
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		
		System.out.println("InitializingBean used");
		// TODO Auto-generated method stub
		
	}


}
