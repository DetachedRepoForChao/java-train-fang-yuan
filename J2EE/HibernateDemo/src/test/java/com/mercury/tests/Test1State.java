package com.mercury.tests;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.mercury.beans.User;
import com.mercury.util.HibernateUtil;

public class Test1State {

	public static void main(String[] args) {
		Session session = HibernateUtil.currentSession();
		Transaction t = session.beginTransaction();
		
		// Transient State : new created object
//		User gama = new User("Gama", 12);
		
		// Persistence (attached) State : associated with a row in DB
		// update an object will be auto commit
		User gama = (User)session.get(User.class, "Gama");
		gama.setAge(15);
		gama.setAge(17);
//		gama.setAge(15);
		
		System.out.println("**************");
		
		t.commit();
		HibernateUtil.closeSession();
		
		// Detached State : was in session. (Either session closed, or evicted by session)
		gama.setAge(100);
		System.out.println(gama);
	}
}
