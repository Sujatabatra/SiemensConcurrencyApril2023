package com.sujata.demo;

import java.util.concurrent.CountDownLatch;

class ChildThread extends Thread{
	private CountDownLatch countDownLatch;
	private String name;
	public ChildThread(CountDownLatch countDownLatch, String name) {
		super();
		this.countDownLatch = countDownLatch;
		this.name = name;
	}
	@Override
	public void run() {
		System.out.println(this.name+" packing bag!");
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(this.name+" changing clothes");
		countDownLatch.countDown();
		goToSchool();
	}
	
	public void goToSchool() {
		System.out.println(this.name+" off to school!");
	}
	
}

public class CountDownLatchDemo {

	public static void main(String[] args) {
		Thread.currentThread().setName("Mother");
		
		CountDownLatch countDownLatch=new CountDownLatch(3);
		
		ChildThread child1=new ChildThread(countDownLatch, "Child-1");
		ChildThread child2=new ChildThread(countDownLatch, "Child-2");
		ChildThread child3=new ChildThread(countDownLatch, "Child-3");
		ChildThread child4=new ChildThread(countDownLatch, "Child-4");
		
		child1.start();
		child2.start();
		child3.start();
		child4.start();
		
		try {
			countDownLatch.await();
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
		System.out.println(Thread.currentThread().getName()+"Continued with her own chores....");
	}
	
	

}
