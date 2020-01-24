package com.mercury.tests;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.mercury.daos.FacilityDao;
import com.mercury.daos.UserDao;

public class SpringIoCTest2 {

	public static void main(String[] args) {
		ApplicationContext actx = new FileSystemXmlApplicationContext("resources/spring-config.xml");
		System.out.println("***************");
		
		UserDao ud = (UserDao)actx.getBean("ud");
		UserDao ud2 = (UserDao)actx.getBean("ud");
		
		
		FacilityDao fd = (FacilityDao)actx.getBean("fd");
		FacilityDao fd2 = (FacilityDao)actx.getBean("fd");
		
		System.out.println(fd);
		System.out.println(fd2);
		
		System.out.println(fd == fd2);
		
		System.out.println("*************");
		
		
	}

}
