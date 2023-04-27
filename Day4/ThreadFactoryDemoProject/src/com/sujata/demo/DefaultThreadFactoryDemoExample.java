package com.sujata.demo;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

class ThreadJob implements Runnable{
	@Override
	public void run() {
//		System.out.println(Thread.currentThread().getName()+" executing");
	}
}
public class DefaultThreadFactoryDemoExample {

	public static void main(String[] args) {
		
//		ExecutorService threadPool=Executors.newFixedThreadPool(2, Executors.defaultThreadFactory());
		
//		ThreadFactory threadFactory=Executors.defaultThreadFactory();
		for(int i=1;i<10;i++) {
			ThreadFactory threadFactory=Executors.defaultThreadFactory();
			Thread thread=threadFactory.newThread(new ThreadJob());
			
			System.out.println("Name given by threadFactory = "+thread.getName());
			thread.start();
		}

	}

}
