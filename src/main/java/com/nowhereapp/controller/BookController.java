package com.nowhereapp.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.nowhereapp.services.BookService;
import com.nowhereapp.services.DataService;
import com.nowhereapp.domain.Book;

@Controller
public class BookController {
	@Autowired
	private BookService bookService;
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/book", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		System.out.print("Welcome Book!");
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "book";
	}
	@RequestMapping(value="/bookslist", method = RequestMethod.GET)
	public String booksList(Model model) {
		System.out.println("Controller bookslist");
		
		List<Book> bookLists = bookService.listBooks();
		model.addAttribute("booksList",bookLists);
		
		return "booksList";
		
	}
	
}
