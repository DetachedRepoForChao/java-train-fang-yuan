package com.mercury.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.mercury.config.IocConfig;
import com.mercury.daos.UserDao;

public class SpringAnnotationTest {

	public static void main(String[] args) {
		ApplicationContext actx = new AnnotationConfigApplicationContext(IocConfig.class);
		
		UserDao ud = (UserDao)actx.getBean("userDao");
		UserDao ud2 = (UserDao)actx.getBean("userDao");
		
		System.out.println(ud);
		System.out.println(ud2);
	}

}
