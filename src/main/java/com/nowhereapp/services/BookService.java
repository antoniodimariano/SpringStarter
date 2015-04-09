package com.nowhereapp.services;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.nowhereapp.domain.Book;


@Service
@Transactional
public interface BookService {

	public void addBook(Book book);
	public void updateBook(Book book);
	public Book getBookById(Integer id);
	public List<Book> listBooks();
	public void removeBook(Integer id);
	
}
