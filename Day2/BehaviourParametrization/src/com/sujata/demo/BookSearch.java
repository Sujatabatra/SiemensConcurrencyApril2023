package com.sujata.demo;

import java.util.ArrayList;
import java.util.List;

public class BookSearch {

	private static List<Book> books=new ArrayList<Book>();
	
	static {
		books.add(new Book(101, "AAAA", "Mr. X", 1200, 780));
		books.add(new Book(102, "BBBB", "Mr. X", 1500, 1780));
		books.add(new Book(103, "CCCC", "Mr. Y", 4500, 8890));
		books.add(new Book(104, "DDDD", "Mr. Z", 1000, 7800));
		books.add(new Book(105, "EEEE", "Mr. Y", 2200, 7180));
		books.add(new Book(106, "FFFF", "Mr. X", 500, 8100));
	}
	
	public List<Book> getAllBooks(){
		return books;
	}
	
	public List<Book> getBooksWrittenByAuthorX(){
		List<Book> bookList=new ArrayList<Book>();
		for(Book book:books) {
			if(book.getAuthorName().equals("Mr. X"))
				bookList.add(book);
		}
		return bookList;
	}
	
	public List<Book> getExpensiveBook(){
		List<Book> bookList=new ArrayList<Book>();
		for(Book book:books) {
			if(book.getPrice()>5100)
				bookList.add(book);
		}
		return bookList;
	}
	
	public List<Book> bookSearchMethod(BookPredicate bookPredicate){
		List<Book> bookList=new ArrayList<Book>();
		for(Book book:books) {
			if(bookPredicate.test(book))
				bookList.add(book);
		}
		return bookList;
	}
}
