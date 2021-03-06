package com.navarro.books.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.navarro.books.models.Book;
import com.navarro.books.services.BookService;

@RestController
public class BooksApi {
	private final BookService bookService;

	public BooksApi(BookService bookService) {
		this.bookService = bookService;
	}
	// gets all books
    @RequestMapping("/api/books")
    public List<Book> index() {
        return bookService.allBooks();
    }
	//post method creates a book
    @RequestMapping(value="/api/books", method=RequestMethod.POST)
    public Book create(@RequestParam(value="title") String title, 
    					@RequestParam(value="description") String desc, 
    					@RequestParam(value="language") String lang, 
    					@RequestParam(value="pages") Integer numOfPages) {
        Book book = new Book(title, desc, lang, numOfPages);
        return bookService.createBook(book);
    }
    //get book by id
    @RequestMapping("/api/books/{id}")
    public Book show(@PathVariable("id") Long id) {
        Book book = bookService.findBook(id);
        return book;
    }
    // update method
    @RequestMapping(value="/api/books/{id}", method=RequestMethod.PUT)
    public Book update(
    			@PathVariable("id") Long id, 
    			@RequestParam(value="title") String title, 
    			@RequestParam(value="description") String desc, 
    			@RequestParam(value="language") String lang, 
    			@RequestParam(value="pages") Integer numOfPages) {
    	Book book = bookService.updateBooks(id, title, desc, lang, numOfPages);
    	return book;
    }
    // delete method
    @RequestMapping(value="/api/books/{id}", method=RequestMethod.DELETE)
    public void destroy(@PathVariable("id") Long id) {
    	bookService.delete(id);
    }
}
