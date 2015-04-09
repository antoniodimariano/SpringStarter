package com.nowhereapp.dao;

import java.util.List;

import com.nowhereapp.domain.Author;

public interface AuthorDao {

	
	public List<Author> getAuthorList();
	public Author getAuthorById(Long id);
}
