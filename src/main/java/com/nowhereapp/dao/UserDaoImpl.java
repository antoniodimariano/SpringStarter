package com.nowhereapp.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.nowhereapp.domain.User;

@Repository("loginDao")
public class UserDaoImpl implements UserDao {

	@Autowired
	private SessionFactory sessionFactory;

	Session session = null;  
	Transaction tx = null;  
	 
	@Override
	public User findByUserName(String username) {
		/*
		List<User> users = new ArrayList<User>();
		users = sessionFactory.getCurrentSession()
				.createQuery("from User where usernane=?")
				.setParameter(0, username)
				.list();
		if (users.size() > 0 ) {
			return users.get(0);
		} else {
			return null;
		}
		*/
		session = sessionFactory.openSession();  
		  tx = session.getTransaction();  
		  session.beginTransaction();  
		  User user = (User) session.load(User.class, new String(username));  
		  tx.commit();  
		  return user;  
		
	
	}

}
