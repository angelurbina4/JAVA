package com.codingdojo.mvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.codingdojo.mvc.models.Book;
import com.codingdojo.mvc.services.BookService;

@Controller
public class BookController {

	private final BookService bookService;
	
	public BookController(BookService bookService){
		this.bookService = bookService;
	}
	
	@GetMapping("/show/{id_url}")
	public String show(@PathVariable("id_url") Long id, Model model) {
		Book book_show = bookService.findBook(id);
		model.addAttribute("book", book_show);
		return "show.jsp";
	}
	
	
}
