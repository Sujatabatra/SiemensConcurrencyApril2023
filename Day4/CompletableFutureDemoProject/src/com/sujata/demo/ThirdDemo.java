package com.sujata.demo;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

public class ThirdDemo {

	public static void main(String[] args) {
//		CompletableFuture<String> future=CompletableFuture.supplyAsync(()->{
//			try {
//				TimeUnit.SECONDS.sleep(1);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			return "Abhishek";
//		});
//
//		CompletableFuture<String> greetingFuture=future.thenApply(name->{return "Hello "+name;});
//		
		CompletableFuture<String> future=CompletableFuture.supplyAsync(()->{
			try {
				TimeUnit.SECONDS.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return "Abhishek";
		}).thenApply(name->{return "Hello "+name;})
				.thenApply(greetName->"Welcome "+greetName);

//		CompletableFuture<String> greetingFuture=future.thenApply(name->{return "Hello "+name;});
	
		try {
//			System.out.println(greetingFuture.get());
			System.out.println(future.get());
		} catch (InterruptedException | ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
