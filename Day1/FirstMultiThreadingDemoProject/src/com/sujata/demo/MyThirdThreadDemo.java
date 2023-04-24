package com.sujata.demo;

class SecondThread extends Thread {

	public void run() {
		System.out.println("Thread ID : "+Thread.currentThread().getId());
		System.out.println("Thread Name :"+Thread.currentThread().getName());
		System.out.println("Thread Priority :"+Thread.currentThread().getPriority());
		System.out.println("Thread State :"+Thread.currentThread().getState());
		System.out.println(Thread.currentThread().isAlive());

	}
}

public class MyThirdThreadDemo {

	public static void main(String[] args) {
		SecondThread t1=new SecondThread();
		SecondThread t2=new SecondThread();
		System.out.println("t1 state:"+t1.getState());
		t1.start();
		t2.start();
		System.out.println("Thread ID : "+Thread.currentThread().getId());
		System.out.println("Thread Name :"+Thread.currentThread().getName());
		System.out.println("Thread Priority :"+Thread.currentThread().getPriority());
		System.out.println("Thread State :"+Thread.currentThread().getState());
		System.out.println(Thread.currentThread().isAlive());
		
//		t1.start();
	}

}
