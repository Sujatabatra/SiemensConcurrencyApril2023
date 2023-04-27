package com.sujata.demo;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

public class FirstDemo {

	public static void main(String[] args) {
//		CompletableFuture<String> completableFuture=new CompletableFuture<String>();
//		CompletableFuture<Void> future=CompletableFuture.runAsync(new Runnable() {
//			
//			@Override
//			public void run() {
//				try {
//					TimeUnit.SECONDS.sleep(1);
//				} catch (InterruptedException e) {
//					
//					e.printStackTrace();
//				};
//				System.out.println("I will run in the seperate thread then main thread "+Thread.currentThread().getName());
//				
//			}
//		});

		CompletableFuture<Void> future = CompletableFuture.runAsync(()-> {
				try {
					TimeUnit.SECONDS.sleep(1);
				} catch (InterruptedException e) {

					e.printStackTrace();
				}
				;
				System.out.println(
						"I will run in the seperate thread then main thread " + Thread.currentThread().getName());

		});
		try {
			future.get();
		} catch (InterruptedException | ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
