package com.mercury.tests;

import java.util.List;
import java.util.stream.Collectors;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.mercury.beans.User;
import com.mercury.util.HibernateUtil;

public class Test7NamedQuery {

	public static void main(String[] args) {
		Session session = HibernateUtil.currentSession();
		Transaction t = session.beginTransaction();
		
		Query query = session.getNamedQuery("userQuery");
		query.setInteger("age", 20);
		
		List<User> users = query.list();
		
		users.parallelStream()
			.peek(e -> System.out.println(e))
			.findAny();
		
		t.commit();
		HibernateUtil.closeSession();
	}
}
