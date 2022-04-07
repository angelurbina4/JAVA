package com.codingdojo.mvc.services;


import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.codingdojo.mvc.models.Book;
import com.codingdojo.mvc.repositories.BookRepository;

@Service
public class BookService {
	// agregar el repositorio de libros como una dependencia
	private final BookRepository bookRepository;
 
	public BookService(BookRepository bookRepository) {
    this.bookRepository = bookRepository;
	}
	// devuelve todos los libros
	public List<Book> allBooks() {
     return bookRepository.findAll();
 	}
	// crea un libro
	public Book createBook(Book b) {
     return bookRepository.save(b);
	}
	// recupera un libro
	public Book findBook(Long id) {
		Optional<Book> optionalBook = bookRepository.findById(id);
		if(optionalBook.isPresent()) {
			return optionalBook.get();
     } else {
         	return null;
     	}
	}
	
	public void deleteBook(Long id) {
		bookRepository.deleteById(id);
	}
	
	public List<Book> updateBook(Long id,
						   String title, 
						   String description, 
						   String language, 
						   Integer numberOfPages) {
	     return bookRepository.save(id, title, description, language, numberOfPages);
	}
}
