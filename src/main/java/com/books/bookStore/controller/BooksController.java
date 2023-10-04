package com.books.bookStore.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.books.bookStore.entity.Book;
import com.books.bookStore.entity.MyBookList;
import com.books.bookStore.service.BookService;
import com.books.bookStore.service.MyBookListService;

@Controller

public class BooksController {
	@Autowired
	private BookService bookService;
	@Autowired
	private MyBookListService myBookListService;
	@GetMapping("/")
	public String home() {
		return "home";
	}
	
	@GetMapping("/add-book")
	public String addBook() {
		return "addBook";
	}
	
	@GetMapping("/new-books")
	public ModelAndView newBooks() {
	List<Book>list = bookService.newBooks();
	ModelAndView mav = new ModelAndView();
	mav.setViewName("newBooks");
	mav.addObject("book", list);
	return mav;
	}
	
	@PostMapping("/save")
	public String addBook(@ModelAttribute Book book) {
		bookService.save(book);
		return "redirect:/new-books";
	}
	
	@GetMapping("/my-books")
	public String GetMyBooks(Model model) {
		
		List<MyBookList> list = myBookListService.listMyBooks();
		model.addAttribute("book", list);
		return "myBooks";
		
	}
	
	@RequestMapping("/mylist/{id}")
	
	public String getMyBooksList(@PathVariable("id") int id){
		
		Book book = bookService.getBookById(id);
		MyBookList mbl = new MyBookList(book.getId(),book.getBookName(),book.getBookAuthor(),book.getDescription(),book.getPrice());
		myBookListService.saveMyBook(mbl);
		
		return "redirect:/my-books";
	}
	
	@RequestMapping("/editBook/{id}")
	public String editBook(@PathVariable("id") int id, Model model) {
		Book book = bookService.getBookById(id);
		model.addAttribute("book", book);
		return "editBook";
	}
	
	@RequestMapping("/deleteBook/{id}")
	
	public String deleteBook(@PathVariable("id") int id) {
		
		bookService.deleteById(id);
		
		return "redirect:/new-books";
	}
	
	
}
