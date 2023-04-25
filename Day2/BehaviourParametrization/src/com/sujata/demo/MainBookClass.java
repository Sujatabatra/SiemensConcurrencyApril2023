package com.sujata.demo;

import java.util.List;

public class MainBookClass {

	public static void main(String args[]) {
		
		BookSearch bookSearch=new BookSearch();
		System.out.println(bookSearch.getAllBooks());
	
		System.out.println(bookSearch.bookSearchMethod(new ExpensiveBookPredicare()));
		
		System.out.println("Thick books are : "+bookSearch.bookSearchMethod(new ThickBookPredicate()));
	
		//Behaviour Parametrization
		List<Book> bookList=bookSearch.bookSearchMethod(new BookPredicate() {
			@Override
			public boolean test(Book book) {
				return book.getAuthorName().equals("Mr. Y");
			}
		});
		/*
		 * Java 1.8 , now u can store functions in a variable
		 * 
		 * datatype variable=value
		 * 
		 * int x=10;
		 * Interface : Functional Interface (just 1 method)
		 * Function Interface x=function(){int y=10;}
		 */
		
		List<Book> newbookList=bookSearch.bookSearchMethod(book-> book.getAuthorName().equals("Mr. Y"));
			
		
	}
	
}
