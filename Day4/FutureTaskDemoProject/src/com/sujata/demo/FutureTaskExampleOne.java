package com.sujata.demo;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;

class MyRunnableTask implements Runnable{

	private final long waitTime;
	
	public MyRunnableTask(long waitTime) {
		super();
		this.waitTime = waitTime;
	}


	@Override
	public void run() {
		try {
			Thread.sleep(waitTime);
			System.out.println(Thread.currentThread().getName());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
	}
	
}
public class FutureTaskExampleOne {

	public static void main(String[] args) {
		
		ExecutorService threadPool=Executors.newFixedThreadPool(2);
		
		MyRunnableTask task1=new MyRunnableTask(1000);
		MyRunnableTask task2=new MyRunnableTask(2000);
		
		FutureTask<String> futureTask1=new FutureTask<String>(task1, "Future Task1 is complete");
		FutureTask<String> futureTask2=new FutureTask<String>(task2, "Future Task2 is complete");
		
		threadPool.submit(futureTask1);
		threadPool.submit(futureTask2);
		
		while(true) {
			try {
				if(futureTask1.isDone() && futureTask2.isDone()) {
					System.out.println("Both Future Tasks Complete");
					threadPool.shutdown();
					return;
				}
				if(!futureTask1.isDone()) {
					System.out.println("FutureTask 1 output = "+futureTask1.get());
				}
				
				System.out.println("waiting for futuretask2 to complete");
				String s=futureTask2.get(250,TimeUnit.MILLISECONDS);
				
				if(s!=null)
					System.out.println("FutureTask2 Output = "+s);
				
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}

	}

}
