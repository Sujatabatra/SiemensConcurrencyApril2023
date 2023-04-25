package com.sujata.demo;

public class MainAutomicCounter {

	public static void main(String[] args) throws InterruptedException {
		AtomicCounter c=new AtomicCounter();
		Thread t1=new Thread(c,"First");
		Thread t2=new Thread(c,"Second");
		
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		
		System.out.println(c.count);

	}

}
