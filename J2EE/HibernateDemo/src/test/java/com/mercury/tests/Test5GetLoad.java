package com.mercury.tests;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.mercury.beans.User;
import com.mercury.util.HibernateUtil;

public class Test5GetLoad {

	public static void main(String[] args) {
		Session session = HibernateUtil.currentSession();
		Transaction t = session.beginTransaction();
		
		// get() - eager
		// load() - lazy loading
		
		// both get() and load() will use cache, if object found, directly return
		// if not found, get() will directly query from DB, load will create a proxy, wait until use.
		
		// if record not exist in DB, get() return null, load() exception out
		User v1 = (User) session.get(User.class, "Voodoo2");
		User v2 = (User) session.load(User.class, "Voodoo2");
		
		System.out.println("***********");
		
//		System.out.println(v1.getClass().getName());
		System.out.println(v2.getClass().getName());
		
		System.out.println("**********");
		
		System.out.println(v1);
		System.out.println(v2);
		
		t.commit();
		HibernateUtil.closeSession();
	}
}
