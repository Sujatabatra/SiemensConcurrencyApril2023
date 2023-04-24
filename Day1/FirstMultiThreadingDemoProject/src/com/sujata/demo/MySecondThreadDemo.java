package com.sujata.demo;

//FirstThread is a Thread (if we instantiate First Thread we get a child thread
class FirstThread extends Thread{
	
	//Job of the thread
	public void run() {
		System.out.println("Good Bye from "+Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getName()+" : "+show());
	}
	
	public String show() {
		return "Welcome to the world of Multi Threading!";
	}

}
public class MySecondThreadDemo {

	public static void main(String[] args) {
		//New Born
		FirstThread t1=new FirstThread(); //Thread-0
		t1.run();
		t1.start();
		System.out.println("Good Bye from "+Thread.currentThread().getName());
	}

}
