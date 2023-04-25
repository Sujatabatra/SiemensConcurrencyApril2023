package com.sujata.demo;
/*
 * Thread implementing Runnable
 */
public class MainCounter {

	public static void main(String[] args) throws InterruptedException {
		Counter c=new Counter();
		Thread t1=new Thread(c,"First");
		Thread t2=new Thread(c,"Second");
		
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		
		System.out.println(c.count);
		
	}

}
