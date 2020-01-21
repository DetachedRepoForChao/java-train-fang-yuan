package com.mercury.tests;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.mercury.beans.User;
import com.mercury.util.HibernateUtil;

public class Test2Hql {

	// HQL : hibernate query language
	public static void main(String[] args) {
		Session session = HibernateUtil.currentSession();
		Transaction t = session.beginTransaction();
		
		// sql : select * from SAMplE
		// query for class
		String hql = "from User";
		Query query = session.createQuery(hql);
		
		// Both below 2 functions will execute
//		query.uniqueResult();	// exception out if more than 1 row found / no result
		List<User> users = query.list();	// always return a list
		
		users.forEach(u -> System.out.println(u));
		
		t.commit();
		HibernateUtil.closeSession();
	}
}
