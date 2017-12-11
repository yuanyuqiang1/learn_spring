package com.yyq.inter;

import org.springframework.context.ApplicationContext;
import com.util.ApplicationContextUtil;

public class App1 {
public static void main(String[] args) {
	ApplicationContext applicationContext = ApplicationContextUtil.getApplicationContext();
	
	//ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/yyq/inter/beans.xml");
	
	ChangeLetter changeLetter = (ChangeLetter)applicationContext.getBean("changedLetter");
	System.out.println(changeLetter.change());
}
}
