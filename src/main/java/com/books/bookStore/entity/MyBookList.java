package com.books.bookStore.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="mybookslist")
public class MyBookList {
	
	   @Id
	    private int id;
	    private String bookName; // Match the field name used in your template
	    private String bookAuthor; // Match the field name used in your template
	    private String description; // Match the field name used in your template
	    private double price; // Match the field name used in your template

	    public MyBookList(int id, String bookName, String bookAuthor, String description, double price) {
	        super();
	        this.id = id;
	        this.bookName = bookName;
	        this.bookAuthor = bookAuthor;
	        this.description = description;
	        this.price = price;
	    }

	    public MyBookList() {
	        super();
	        // TODO Auto-generated constructor stub
	    }

	    public int getId() {
	        return id;
	    }

	    public void setId(int id) {
	        this.id = id;
	    }

	    public String getBookName() { // Rename the getter method to match the field name
	        return bookName;
	    }

	    public void setBookName(String bookName) { // Rename the setter method to match the field name
	        this.bookName = bookName;
	    }

	    public String getBookAuthor() { // Rename the getter method to match the field name
	        return bookAuthor;
	    }

	    public void setBookAuthor(String bookAuthor) { // Rename the setter method to match the field name
	        this.bookAuthor = bookAuthor;
	    }

	    public String getDescription() { // Rename the getter method to match the field name
	        return description;
	    }

	    public void setDescription(String description) { // Rename the setter method to match the field name
	        this.description = description;
	    }

	    public double getPrice() { // Rename the getter method to match the field name
	        return price;
	    }

	    public void setPrice(double price) { // Rename the setter method to match the field name
	        this.price = price;
	    }

}
