package com.sujata.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class HelloCallableTaskTwo implements Callable<String>{

	private String name;
	
	public HelloCallableTaskTwo(String name) {
		this.name=name;
	}
	
	@Override
	public String call() throws Exception {
//		if(this.name.equals("Rohan")) {
//			Thread.sleep(1000);
//		}
		Thread.sleep(2000);
		System.out.println(this.name+"is going to return");
		return "Hello from Hello task "+this.name+"executed by "+Thread.currentThread().getName();
	}
	
}
public class ThreadPoolWithCallableDemoTwo {

	public static void main(String[] args) {
		
		ExecutorService threadPool=Executors.newFixedThreadPool(3);
		
		Future<String> result1=threadPool.submit(new HelloCallableTaskTwo("Task1"));
		System.out.println("Hello Everyone");
		Future<String> result2=threadPool.submit(new HelloCallableTaskTwo("Task2"));
		System.out.println("=====================");
		Future<String> result3=threadPool.submit(new HelloCallableTaskTwo("Task3"));
		System.out.println("Hi");
	}

}
