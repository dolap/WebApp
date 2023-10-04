package com.books.bookStore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.books.bookStore.service.MyBookListService;

@Controller
public class MyBookListController {
	@Autowired
	private MyBookListService mbsl;
	@RequestMapping("/deleteMyList/{id}")
	
	public String deleteMylist(@PathVariable("id") int id) {
		
		mbsl.deleteById(id);
		
		return "redirect:/my-books";
	}

}
