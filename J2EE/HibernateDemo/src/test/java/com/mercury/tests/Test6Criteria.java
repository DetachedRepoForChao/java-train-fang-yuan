package com.mercury.tests;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import com.mercury.beans.User;
import com.mercury.util.HibernateUtil;

public class Test6Criteria {

	public static void main(String[] args) {
		Session session = HibernateUtil.currentSession();
		Transaction t = session.beginTransaction();
		
		Criteria c = session.createCriteria(User.class);
		c.add(Restrictions.eq("age", 35)).add(Restrictions.not(Restrictions.like("name", "%2%")));
		
		User u = (User)c.uniqueResult();
		
		System.out.println(u);
		
		t.commit();
		HibernateUtil.closeSession();
	}
}
