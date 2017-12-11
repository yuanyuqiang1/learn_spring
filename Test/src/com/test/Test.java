package com.test;

import org.springframework.context.ApplicationContext;
import com.services.UserServices;
import com.util.ApplicationContextUtil;

public class Test {
	public static void main(String[] args) {
		/*UserServices userServices = new UserServices();
		userServices.setName("ok");
		userServices.sayHello();
		*/
		
		ApplicationContext applicationContext = ApplicationContextUtil.getApplicationContext();
		UserServices services = (UserServices)applicationContext.getBean("userServices");
		services.sayHello();
//		ByeServices byeServices = (ByeServices)applicationContext.getBean("byeServices");
//		byeServices.sayBye();
	}
}
