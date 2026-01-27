package com.klu.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component

public class Library {
	
	private int libraryid;
	private String libraryName;
	private Book book;
	
	public Library() {
		this.libraryid=526;
		this.libraryName="KLU";
	}
	
	@Autowired
	public  void setBook(Book book) {
		this.book=book;
		
	}
	
	public void display() {
		System.out.println("Library Id: "+libraryid);
		System.out.println("Library Name: "+libraryName);
		System.out.println("Book Details: ");
		System.out.println(book);
	}
	

}
