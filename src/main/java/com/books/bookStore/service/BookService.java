package com.books.bookStore.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.books.bookStore.entity.Book;
import com.books.bookStore.repository.BookRepository;
import java.util.List;


@Service
public class BookService {
	@Autowired
	private BookRepository bookRepository;
	
	 public BookService(BookRepository bookRepository) {
	        this.bookRepository = bookRepository;
	    }
	 
	public void save(Book book) {
		
		bookRepository.save(book);
		
	}
	
	
	public List<Book> newBooks(){
		return bookRepository.findAll();
		
	}
	
	public Book getBookById(int id) {
		
		return bookRepository.findById(id).get();
	}
	
	public void deleteById(int id) {
		
		bookRepository.deleteById(id);
	}

}
