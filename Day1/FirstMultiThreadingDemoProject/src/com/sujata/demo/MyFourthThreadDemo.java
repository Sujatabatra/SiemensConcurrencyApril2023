package com.sujata.demo;

class FourthThread extends Thread{

	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println(Thread.currentThread().getName()+" i : "+i);
		}
		System.out.println("Good Bye from "+Thread.currentThread().getName());
	}
}
public class MyFourthThreadDemo {
	public static void main(String args[]) {
		FourthThread t1=new FourthThread(); //Thread-0
		FourthThread t2=new FourthThread(); //Thread-1 
		t2.setName("t2Thread"); //rename Thread-1 to t2Thread
		FourthThread t3=new FourthThread(); //Thread-2
		FourthThread t4=new FourthThread();  //Thread-3
		
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
