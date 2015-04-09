package com.nowhereapp.dao;

import java.util.List;

import com.nowhereapp.domain.Book;


public interface BookDao {

	public void addBook(Book book);
	public void updateBook(Book book);
	public List<Book> listBooks();
	public Book getBookById(int id);
	public void removeBook(int id);
	
}