package com.sujata.demo;

public class MyFirstThreadDemo {

	public static void main(String[] args) {
		/*
		 * Job of "main" Thread is create three child thread and display their names
		 * 
		 * What is the Job of Thread-0/Thread-1/Thread-2 : ? (No Job)
		 */
		System.out.println(Thread.currentThread().getName());
		//Thread-0 (New Born)
		Thread t1=new Thread() {
			@Override
			public void run() {
				System.out.println(Thread.currentThread().getName()+" is running");
			}
		};
		Thread t2=new Thread(); //Thread-1 (New Born)
		Thread t3=new Thread(); //Thread-2 (New Born)
		t1.start();
		t2.start();
		t3.start();
		System.out.println(t1.getName());
		System.out.println(t2.getName());
		System.out.println(t3.getName());
	}

}
