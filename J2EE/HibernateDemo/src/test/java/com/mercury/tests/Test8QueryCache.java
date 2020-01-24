package com.mercury.tests;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.mercury.beans.User;
import com.mercury.util.HibernateUtil;

public class Test8QueryCache {

	public static void main(String[] args) {
		Session session = HibernateUtil.currentSession();
		Transaction t = session.beginTransaction();
		
		Query query = session.getNamedQuery("userQuery");
		query.setInteger("age", 20);
		
		query.setCacheable(true);
		
		List<User> users = query.list();
		users.forEach(e -> System.out.println(e));
		
		System.out.println("**********");
		
		List<User> users2 = query.list();
		users2.forEach(e -> System.out.println(e));
		
		t.commit();
		HibernateUtil.closeSession();
	}

}
