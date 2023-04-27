package com.sujata.demo;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class FourthDemo {

	public static void main(String[] args) {
		
		CompletableFuture<String> future=CompletableFuture.supplyAsync(()->{
			try {
				TimeUnit.SECONDS.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			return "Abhishek";
		}).thenApply(name->{return "Hello "+name;})
				.thenApply(greetName->"Welcome "+greetName);

//		CompletableFuture<String> greetingFuture=future.thenApply(name->{return "Hello "+name;});
	
		future.thenAccept((value)->System.out.println(value));  //Non Blocking
		
		System.out.println("Hi I am "+Thread.currentThread().getName());
		try {
//			System.out.println(greetingFuture.get());
			future.get();
		} catch (InterruptedException | ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
	}

}
