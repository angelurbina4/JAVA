package com.codingdojo.mvc.controllers;


import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.codingdojo.mvc.models.Book;
import com.codingdojo.mvc.services.BookService;
@RestController
public class BooksApi {
	private final BookService bookService;
	public BooksApi(BookService bookService){
		this.bookService = bookService;
	}
	// otros métodos eliminados por brevedad
	@RequestMapping(value="/api/books/{id}", method=RequestMethod.PUT)
	public List<Book> update(@PathVariable("id") Long id, @RequestParam(value="title") String title, @RequestParam(value="description") String desc, @RequestParam(value="language") String lang, @RequestParam(value="pages") Integer numOfPages) {
		List<Book> book = bookService.updateBook(id, title, desc, lang, numOfPages);
     		return book;
 }
 
	@RequestMapping(value="/api/books/{id}", method=RequestMethod.DELETE)
	public void destroy(@PathVariable("id") Long id) {
		bookService.deleteBook(id);
	}
}