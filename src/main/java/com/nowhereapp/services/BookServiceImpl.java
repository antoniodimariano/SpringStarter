package com.nowhereapp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.nowhereapp.dao.BookDao;
import com.nowhereapp.domain.Book;

@Service
@Transactional
public class BookServiceImpl implements BookService {

	@Autowired
	private BookDao bookDao;
	
	
	public BookServiceImpl() {
		System.out.println("BookServiceImpl");
	}
	@Transactional
	public void addBook(Book book) {

		bookDao.addBook(book);
	}

	@Transactional
	public void updateBook(Book book) {

		bookDao.updateBook(book);
	}

	@Transactional
	public Book getBookById(Integer id) {
		return bookDao.getBookById(id);
	}

	@Transactional
	public List<Book> listBooks() {
		return bookDao.listBooks();
	}

	@Transactional
	public void removeBook(Integer id) {
		bookDao.removeBook(id);
	}
}

