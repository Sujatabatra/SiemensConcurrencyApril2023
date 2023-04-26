package com.sujata.demo;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

class HelloTask implements Runnable{
	private String name;
	
	public HelloTask(String name) {
		this.name=name;
	}
	@Override
	public void run() {
		System.out.println("Hi am Hello Task : "+this.name+" executed by "+Thread.currentThread().getName());
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(this.name+" after waking up is executed by "+Thread.currentThread().getName());
	}
}

public class ThreadPoolExecutorDemo {

	public static void main(String[] args) {
		Executor fixedThreadPool=Executors.newFixedThreadPool(3);
		
		for(int i=1;i<5;i++) {
			HelloTask helloTask=new HelloTask("Task-"+i);
			fixedThreadPool.execute(helloTask);
		}
		

	}

}
