package com.mercury.tests;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.mercury.beans.User;
import com.mercury.util.HibernateUtil;

public class Test3SessionCache {

	// 1st level cache, provided by Hibernate itself.
	// Session cache : object are cached in session.
	public static void main(String[] args) {
		Session session = HibernateUtil.currentSession();
		Transaction t = session.beginTransaction();
		
		User v = (User)session.get(User.class, "Voodoo");
		User v2 = (User)session.get(User.class, "Voodoo");
		
		System.out.println(v);
		System.out.println(v2);
		
		System.out.println(v == v2);
		
		t.commit();
		/////////////////////////////////////////////////////
		Transaction t2 = session.beginTransaction();
		
		User v3= (User)session.get(User.class, "Voodoo");
		System.out.println(v == v3);
		
		t2.commit();
		
		HibernateUtil.closeSession();
	}
}
