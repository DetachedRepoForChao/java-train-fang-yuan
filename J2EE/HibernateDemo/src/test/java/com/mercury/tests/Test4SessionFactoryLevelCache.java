package com.mercury.tests;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.mercury.beans.User;

public class Test4SessionFactoryLevelCache {

	public static void main(String[] args) {
		SessionFactory sf1 = new Configuration().configure().buildSessionFactory();
		SessionFactory sf2 = new Configuration().configure().buildSessionFactory();
		
		Session s11 = sf1.openSession();
		Transaction t11 = s11.beginTransaction();
		
		User v1 = (User)s11.get(User.class, "Voodoo");
		
		t11.commit();
		s11.close();
		
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		Session s12 = sf1.openSession();
		Transaction t12 = s12.beginTransaction();
		
		User v2 = (User)s12.get(User.class, "Voodoo");
		
		t12.commit();
		s12.close();
		
		/////////////////////////////////////////////////
		
		Session s21 = sf2.openSession();
		Transaction t21 = s21.beginTransaction();
		
		User v3 = (User)s21.get(User.class, "Voodoo");
		
		t21.commit();
		s21.close();

		
		System.out.println(v1);
		System.out.println(v2);
		System.out.println(v3);
		
		System.out.println(v1 == v2);
		System.out.println(v1 == v3);
		System.out.println(v2 == v3);
	}

}
