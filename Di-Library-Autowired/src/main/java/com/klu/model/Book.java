package com.klu.model;

import org.springframework.stereotype.Component;
@Component

public class Book {
	
	private String isbn;
	private String title;
	private String author;
	private double price;
	

	
	public Book() {
		this.isbn="Isbn -112";
		this.title="The Wings Of Fire";
		this.author="A.P.J.ABDUL KALAM";
		this.price=599.00;
	}
		
		public String getIsbn() {
			return isbn;
		}
		
		public String getTitle() {
			return title;
		}
		
		public String getAuthor() {
			return author;
		}
		
		public double getPrice() {
			return price;
		}
		
		@Override
		
		public String toString() {
			return "isbn:"+isbn+" Title: "+title+" Author: "+
		author+" Price: "+price;
		}
		
	

}
