package com.sujata.demo;

public class ExpensiveBookPredicare implements BookPredicate {

	@Override
	public boolean test(Book book) {
		
		return book.getPrice()>6000;
	}

}
