package com.mercury.tests;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.mercury.daos.RoomDao;
import com.mercury.daos.UserDao;
import com.mercury.services.TrainingService;

public class SpringIoCTest {

	public static void main(String[] args) {
		// create the spring bean container, by using the specific spring config file
		ApplicationContext actx = new FileSystemXmlApplicationContext("resources/spring-config.xml");
		System.out.println("****************");
		
		UserDao ud = (UserDao)actx.getBean("ud");
		System.out.println(ud);
		
		UserDao ud2 = (UserDao)actx.getBean("ud2");
		System.out.println(ud2);
		
		System.out.println(ud == ud2);
		
		System.out.println("**************");
		
		RoomDao rd = (RoomDao)actx.getBean("rd");
		System.out.println(rd);
		
		RoomDao rd2 = (RoomDao)actx.getBean("rd2");
		System.out.println(rd2);
		
		RoomDao rd3 = (RoomDao)actx.getBean("rd3");
		System.out.println(rd3);
		
		System.out.println("***************");
		
		TrainingService ts = (TrainingService)actx.getBean("ts");
		System.out.println(ts);
		
		
	}

}
