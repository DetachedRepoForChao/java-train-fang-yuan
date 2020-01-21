package com.mercury.daos;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.mercury.beans.User;
import com.mercury.util.HibernateUtil;

public class UserDao {

	public void save(User u) {
		Session session = HibernateUtil.currentSession();
		Transaction t = session.beginTransaction();
		
		session.save(u);
		
		t.commit();
		HibernateUtil.closeSession();
	}
	
	public User getByName(String name) {
		User u = null;
		
		Session session = HibernateUtil.currentSession();
		Transaction t = session.beginTransaction();
		
		// select * from sample where name = ?
		u = (User)session.get(User.class, name);
		
		t.commit();
		HibernateUtil.closeSession();
		
		return u;
	}
	
	public List<User> getAll() {
		return null;
	}
}
