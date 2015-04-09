package com.nowhereapp.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.nowhereapp.domain.Book;

@Repository
public class BookDaoImpl implements BookDao{

	@Autowired
	SessionFactory sessionFactory;

	@Override
	@Transactional
	public void addBook(Book book) {
		sessionFactory.getCurrentSession().save(book);
			
	}

	@Override
	@Transactional
	public void updateBook(Book book) {
		sessionFactory.getCurrentSession().update(book);
		
	}
	

	@SuppressWarnings("unchecked")
	@Override
	public List<Book> listBooks() {
		//return sessionFactory.getCurrentSession().createQuery("from Book").list();
		
		Session session = sessionFactory.openSession();
		List<Book> bookList = session.createQuery("from Book").list();
		//List<Book> bookList = session.createQuery("from Book inner join Author on Book.id = Author.book_id ").list();
		//String sql = "select * from book inner join author on book.id = author.book_id";

		
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

	@Override
	@Transactional
	public void removeBook(int id) {
		Book book = (Book)sessionFactory.getCurrentSession().load(Book.class, id);
	        if(null != book) {
	            sessionFactory.getCurrentSession().delete(book);
	        }		
	}
}
