package com.mercury.services;

import java.util.List;

import com.mercury.beans.User;
import com.mercury.daos.UserDao;

public class TrainingService {

	private UserDao ud = new UserDao();
	
	public List<User> train() {
		List<User> users = ud.getAll();
		users.forEach(u -> System.out.println(u.getName() + " is trained"));
		return users;
	}
	
	public User train(String name) {
		User u = ud.getByName(name);
		
		if(u != null) {
			System.out.println(u.getName() + " is trained");
		} else {
			System.out.println(name + " not found");
		}
		
		return u;
	}
	
	public void register(String name, int age) {
		ud.save(new User(name, age));
		System.out.println(name + " is registered with age: " + age);
	}
}
