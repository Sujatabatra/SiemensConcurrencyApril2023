package com.sujata.demo;

class MyThread extends Thread{
	
	public MyThread() {
		super();
	}
	public MyThread(String name) {
		super(name);
	}
	@Override
	public void run() {
		System.out.println("Hello : "+Thread.currentThread().getName());
		for(int i=1;i<=5;i++) {
			System.out.println(Thread.currentThread().getName()+" i : "+i);
		}
	}
	
	
}

class ThreadJob implements Runnable{
	@Override
	public void run() {
		System.out.println("Hi from "+Thread.currentThread().getName());
		for(int j=1;j<=5;j++) {
			System.out.println(Thread.currentThread().getName()+" j : "+j);
		}
	}
}

public class MyThreadPriorityDemo {

	public static void main(String[] args) {
		ThreadJob job=new ThreadJob();
		
//		Thread t1=new Thread(new ThreadJob(),"FirstThread");
		Thread t1=new Thread(job,"FirstThread");
		MyThread t2=new MyThread("SecondThread");
		MyThread t3=new MyThread("ThirdThread");
		
		t3.setPriority(Thread.MIN_PRIORITY);  //1
		t2.setPriority(Thread.MAX_PRIORITY);   //10
		t1.setPriority(Thread.NORM_PRIORITY);  //5 (Default)
		
		t1.start();
		t2.start();
		t3.start();
		
		

	}

}
