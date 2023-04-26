package com.sujata.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CompletionService;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorCompletionService;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

class HelloCallableTaskFour implements Callable<String>{

	private String name;
	
	public HelloCallableTaskFour(String name) {
		this.name=name;
	}
	
	@Override
	public String call() throws Exception {
		if(this.name.equals("Sujata")) {
				Thread.sleep(5000);
		}
		return "Hello from Hello task "+this.name+"executed by "+Thread.currentThread().getName();
	}
	
}
public class ThreadPoolWithCallableDemoFourth {

	public static void main(String[] args) {
		
		ExecutorService threadPool=Executors.newFixedThreadPool(3);
		CompletionService<String> completionService=new ExecutorCompletionService<String>(threadPool);
		
		List<HelloCallableTaskFour> taskList=new ArrayList<HelloCallableTaskFour>();
		taskList.add(new HelloCallableTaskFour("Sujata"));
		taskList.add(new HelloCallableTaskFour("Rekha"));
		taskList.add(new HelloCallableTaskFour("Abhishek"));
		taskList.add(new HelloCallableTaskFour("Harshita"));
		taskList.add(new HelloCallableTaskFour("Rohan"));
		taskList.add(new HelloCallableTaskFour("Saurabh"));
		taskList.add(new HelloCallableTaskFour("Shanu"));

		List<Future<String>> futureList=new ArrayList<Future<String>>();
		
		for(HelloCallableTaskFour task:taskList) {
			completionService.submit(task);
		}
		
		for(int i=0;i<taskList.size();i++) {
			try {
			
				System.out.println(completionService.take().get()); //waiting for sujata task to give result
			} catch (InterruptedException | ExecutionException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("Good Bye from Main!");
		System.out.println("Displaying name"+Thread.currentThread().getName());
	}

}
