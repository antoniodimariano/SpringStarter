package com.nowhereapp.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.nowhereapp.domain.Author;

@Repository
public class AuthorDaoImpl implements AuthorDao{
	
	@Autowired
	SessionFactory sessionFactory;
	
	@Override
	public List<Author> getAuthorList() {
		
		Session session = sessionFactory.openSession();
		@SuppressWarnings("unchecked")
		List<Author> authorList = session.createQuery("from Author").list();
		session.close();
		return authorList;
	}

	@Override
	public Author getAuthorById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
/*
@SuppressWarnings("unchecked")
@Override
public List<Book> listBooks() {
	//return sessionFactory.getCurrentSession().createQuery("from Book").list();
	
	Session session = sessionFactory.openSession();
	List<Book> bookList = session.createQuery("from Book").list();
	session.close();
	return bookList;
	
}

@Override
@Transactional
public Book getBookById(int id) {
	Session session = sessionFactory.getCurrentSession();
	@SuppressWarnings("unchecked")
	List<Book> list = session.createQuery("from Book b where b.id = :id")
        .setParameter("bookId", id)
        .list();
    return list.size() > 0 ?(Book)list.get(0): null;	}
*/