package com.mercury.daos;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class UserDao {

	public UserDao() {
		System.out.println("Creating UserDao");
	}

}
