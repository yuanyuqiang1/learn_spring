package com.yyq.collection;


import java.util.Enumeration;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App1 {

	public static void main(String[] args) {
		
		//ApplicationContext applicationContext = ApplicationContextUtil.getApplicationContext();
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/yyq/collection/beans.xml");
		Department department = (Department)applicationContext.getBean("department");
		System.out.println(department.getName() + "   "  +department.getEmpNames());
		for (int i = 0; i < department.getEmpNames().length; i++) {
			System.out.println(department.getEmpNames()[i]);
		}
		
		
		//list
		for (int i = 0; i < department.getEmplist().size(); i++) {
			System.out.println((department.getEmplist().get(i)).getName());
		}
		
		//set
		for (Employee employee : department.getEmpset()) {
			System.out.println(employee.getName());
			
		}
		
		//map   1.entry
		for (Entry<String,Employee> employee : department.getEmpmap().entrySet()){
			System.out.println(employee.getKey() + employee.getValue().getName());
		}
		
		//2.迭代器
//		Iterator iterator = department.getEmpmap().entrySet().iterator();
//		while (iterator.hasNext()) {
//			Entry dMap =  (Entry) iterator.next();
//			System.out.println("" + dMap.getKey() + ((Employee)dMap.getValue()).getName());
//		}
		
		//get properties
		//Properties properties = department.getPp();
		for(Entry<Object, Object> entry : department.getPp().entrySet()) {
			System.out.println("" + entry.getKey() + entry.getValue());
			
		}
		
	}
}
