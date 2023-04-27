package com.sujata.demo;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;

class MyCallableTask implements Callable<String>{

	private long waitTime;
	
	
	public MyCallableTask(long waitTime) {
		super();
		this.waitTime = waitTime;
	}


	@Override
	public String call() throws Exception {
		Thread.sleep(waitTime);
		
		return Thread.currentThread().getName();
	}
	
}
public class FutureTaskExampleTwo {

	public static void main(String[] args) {
		
		MyCallableTask task1=new MyCallableTask(1000);
		MyCallableTask task2=new MyCallableTask(2000);
		
		FutureTask<String> futureTask1=new FutureTask<String>(task1);
		FutureTask<String> futureTask2=new FutureTask<String>(task2);
		
		ExecutorService threadPool=Executors.newFixedThreadPool(2);
		
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
