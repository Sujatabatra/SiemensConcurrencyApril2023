package com.sujata.demo;
/*
 * Thread()
 * Thread(String name)
 */
class FifthThread extends Thread{

	public FifthThread(String name) {
		super(name);  //Thread(String name);
	}
	public FifthThread() {
		super();
	}
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println(Thread.currentThread().getName()+" i : "+i);
		}
		System.out.println("Good Bye from "+Thread.currentThread().getName());
	}
}
public class MyFifthThreadDemo {
	public static void main(String args[]) {
		FifthThread t1=new FifthThread(); //Thread-0
		FifthThread t2=new FifthThread("ChangedNameThread");  
		
		FifthThread t3=new FifthThread(); //Thread-1
		FifthThread t4=new FifthThread();  //Thread-2
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		
		for(int j=1;j<=5;j++) {
			System.out.println(Thread.currentThread().getName()+" j : "+j);
		}
		System.out.println("Good Bye from "+Thread.currentThread().getName());
		
	}
}
