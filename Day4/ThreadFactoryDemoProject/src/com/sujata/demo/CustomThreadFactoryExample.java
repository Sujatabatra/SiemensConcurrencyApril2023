package com.sujata.demo;

import java.util.ArrayList;
import java.util.concurrent.ThreadFactory;

class CustomThreadFactory implements ThreadFactory{

	private int count=0;
	
	@Override
	public Thread newThread(Runnable r) {
		count++;
		return new Thread(r);
	}
	
	public int getCount() {
		return count;
	}
	
	
}
public class CustomThreadFactoryExample {

	public static void main(String[] args) {
		CustomThreadFactory customThreadFactory=new CustomThreadFactory();
		
		Runnable job1=()->System.out.println("Job 1 Executed");
		Runnable job2=()->System.out.println("Job 1 Executed");
		Runnable job3=()->System.out.println("Job 1 Executed");
		Runnable job4=()->System.out.println("Job 1 Executed");
		Runnable job5=()->System.out.println("Job 1 Executed");
		
		ArrayList<Runnable> runnableArray=new ArrayList<Runnable>();
		runnableArray.add(job1);
		runnableArray.add(job2);
		runnableArray.add(job3);
		runnableArray.add(job4);
		runnableArray.add(job5);
		
		for(Runnable r:runnableArray) {
			customThreadFactory.newThread(r).start();
		}
		
		System.out.println("Total No of Threads created using CustomThreadFactory : "+customThreadFactory.getCount());

	}

}
