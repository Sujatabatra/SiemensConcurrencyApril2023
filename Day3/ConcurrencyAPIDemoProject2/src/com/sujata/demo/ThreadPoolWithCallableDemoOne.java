package com.sujata.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class HelloCallableTask implements Callable<String>{

	private String name;
	
	public HelloCallableTask(String name) {
		this.name=name;
	}
	
	@Override
	public String call() throws Exception {
//		if(this.name.equals("Rohan")) {
//			Thread.sleep(1000);
//		}
		return "Hello from Hello task "+this.name+"executed by "+Thread.currentThread().getName();
	}
	
}
public class ThreadPoolWithCallableDemoOne {

	public static void main(String[] args) {
		
		ExecutorService threadPool=Executors.newFixedThreadPool(3);
		
		List<HelloCallableTask> taskList=new ArrayList<HelloCallableTask>();
		taskList.add(new HelloCallableTask("Sujata"));
		taskList.add(new HelloCallableTask("Rekha"));
		taskList.add(new HelloCallableTask("Abhishek"));
		taskList.add(new HelloCallableTask("Harshita"));
		taskList.add(new HelloCallableTask("Rohan"));
		taskList.add(new HelloCallableTask("Saurabh"));
		taskList.add(new HelloCallableTask("Shanu"));

		List<Future<String>> futureList=new ArrayList<Future<String>>();
		
		for(HelloCallableTask task:taskList) {
			futureList.add(threadPool.submit(task));
		}
		
		for(Future<String> future:futureList) {
			try {
				//get is a blocking call. It waits for the thread for completion.
				System.out.println(future.get());
			} catch (InterruptedException | ExecutionException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("Good Bye from Main!");
		System.out.println("Displaying name"+Thread.currentThread().getName());
	}

}
