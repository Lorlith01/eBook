package com.example.dao;

//import org.hibernate.Session;
import org.hibernate.SessionFactory;
//import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.entity.Users;
//import com.example.util.HibernateUtil;

@Repository
public class UserDao {
	
	@Autowired
	SessionFactory sessionFactory;
	
	public void save(Users user) {
		// Hibernate模式
//		Session session = HibernateUtil.getSessionFactory().openSession();
//		Transaction tx = session.beginTransaction();
//		
//		session.save(user);
//		
//		tx.commit();
//		session.close();
		
		// Spring模式
		sessionFactory.getCurrentSession().save(user);
	}
}
