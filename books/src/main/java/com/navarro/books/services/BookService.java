package com.navarro.books.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.navarro.books.models.Book;
import com.navarro.books.repositories.BookRepository;

@Service
public class BookService {
	private final BookRepository bookRepository;
	
	public BookService(BookRepository bookRepository) {
		this.bookRepository = bookRepository;
	}
    // returns all the books
    public List<Book> allBooks() {
        return bookRepository.findAll();
    }
    // creates a book
    public Book createBook(Book b) {
        return bookRepository.save(b);
    }
    // retrieves a book
    public Book findBook(Long id) {
        Optional<Book> optionalBook = bookRepository.findById(id);
        if(optionalBook.isPresent()) {
            return optionalBook.get();
        } else {
            return null;
        }
    }
    // updates a book api
    public Book updateBooks(Long id, String title, String desc, String lang, Integer numOfPages) {
//    	System.out.println(updateBooks.getClass());		
    	Book updateBook = bookRepository.findById(id).get();
    	updateBook.setTitle(title);
    	updateBook.setDescription(desc);
    	updateBook.setLanguage(lang);
    	updateBook.setNumberOfPages(numOfPages);
    	return bookRepository.save(updateBook);
    }
    // updates a book
    public Book updateBook(Book bo) {
    	return bookRepository.save(bo);
    }
    // deletes a book
    public void delete(Long id) {
        Optional<Book> deleteBook = bookRepository.findById(id);
        if(deleteBook.isPresent()) {
        		bookRepository.deleteById(id);;
        }
    }

}
