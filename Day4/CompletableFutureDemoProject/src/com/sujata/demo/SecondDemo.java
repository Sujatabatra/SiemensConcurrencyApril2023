package com.sujata.demo;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.function.Supplier;
/*
 * Functional Interface
 * Predicate : T -> boolean
 * Function : V->R
 * Consumer : V->void
 * Supplier : ()->R
 */
public class SecondDemo {

	public static void main(String[] args) {
		CompletableFuture<String> future=CompletableFuture.supplyAsync(new Supplier<String>() {

			@Override
			public String get() {
				try {
					TimeUnit.SECONDS.sleep(1);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				return "Result of asynchronous computation from "+Thread.currentThread().getName();
			}
		});

		String result;
		try {
			result = future.get();
			System.out.println(result);
		} catch (InterruptedException | ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
