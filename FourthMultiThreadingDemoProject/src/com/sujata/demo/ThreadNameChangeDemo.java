package com.sujata.demo;
/*
 * 4 constructors
 * 1. Thread()
 * 2. Thread(String name)
 * 3. Thread(Runnable Job)
 * 4. Thread(Runnnable Job,String name)
 */
class ThreadJob implements Runnable{

	@Override
	public void run() {
		System.out.println("Hello from "+Thread.currentThread().getName());
		
	}
	
}
public class ThreadNameChangeDemo {

	public static void main(String[] args) {
		ThreadJob job=new ThreadJob();
		
//		Thread t1=new Thread(job); //Thread-0
//		Thread t2=new Thread(job,"t2Thread");  //t2Thread
////		t2.setName("t2Thread");
//		Thread t3=new Thread(job);  //Thread-1
		
		
		Thread t1=new Thread(job); //Thread-0
		Thread t2=new Thread(job);  //Thread-1
		t2.setName("t2Thread"); //rename Thread-1 to t2Thread
		Thread t3=new Thread(job);  //Thread-2
		
		
		
		t1.start();
		t2.start();
		t3.start();

	}

}
