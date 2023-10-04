package com.books.bookStore.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.books.bookStore.entity.MyBookList;
import com.books.bookStore.repository.MyBookRepository;

@Service
public class MyBookListService {
	@Autowired
	private MyBookRepository myBookListRepo;
	
	public void saveMyBook(MyBookList book) {
		 myBookListRepo.save(book);
	}
	
	public List<MyBookList> listMyBooks(){
		
		return myBookListRepo.findAll();
	}
	
	public void deleteById(int id) {
		
		myBookListRepo.deleteById(id);
	}

}
