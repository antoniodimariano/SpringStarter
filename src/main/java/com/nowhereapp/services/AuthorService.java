package com.nowhereapp.services;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.nowhereapp.domain.Author;

@Service
@Transactional
public interface AuthorService {
	public List<Author> getAuthorList();
	public Author getAuthorById(Long id);
			
}
