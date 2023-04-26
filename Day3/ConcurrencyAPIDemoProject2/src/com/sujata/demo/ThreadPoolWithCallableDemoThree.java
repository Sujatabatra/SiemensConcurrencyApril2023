package com.sujata.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

class HelloCallableTaskThree implements Callable<String>{

	private String name;
	
	public HelloCallableTaskThree(String name) {
		this.name=name;
	}
	
	@Override
	public String call() throws Exception {
		if(this.name.equals("Sujata")) {
			for(;;)
				Thread.sleep(1000);
		}
		return "Hello from Hello task "+this.name+"executed by "+Thread.currentThread().getName();
	}
	
}
public class ThreadPoolWithCallableDemoThree {

	public static void main(String[] args) {
		
		ExecutorService threadPool=Executors.newFixedThreadPool(3);
		
		List<HelloCallableTaskThree> taskList=new ArrayList<HelloCallableTaskThree>();
		taskList.add(new HelloCallableTaskThree("Sujata"));
		taskList.add(new HelloCallableTaskThree("Rekha"));
		taskList.add(new HelloCallableTaskThree("Abhishek"));
		taskList.add(new HelloCallableTaskThree("Harshita"));
		taskList.add(new HelloCallableTaskThree("Rohan"));
		taskList.add(new HelloCallableTaskThree("Saurabh"));
		taskList.add(new HelloCallableTaskThree("Shanu"));

		List<Future<String>> futureList=new ArrayList<Future<String>>();
		
		for(HelloCallableTaskThree task:taskList) {
			futureList.add(threadPool.submit(task));
		}
		
		for(Future<String> future:futureList) {
			try {
				//get is a blocking call. It waits for the thread for completion for 1 second.
				System.out.println(future.get(1L,TimeUnit.SECONDS)); //waiting for sujata task to give result
			} catch (InterruptedException | ExecutionException e) {
				e.printStackTrace();
			} catch (TimeoutException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		System.out.println("Good Bye from Main!");
		System.out.println("Displaying name"+Thread.currentThread().getName());
	}

}
