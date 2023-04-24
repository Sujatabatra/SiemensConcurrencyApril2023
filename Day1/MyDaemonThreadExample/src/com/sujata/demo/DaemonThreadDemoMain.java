package com.sujata.demo;

class MyThread extends Thread{
	
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println(Thread.currentThread().getName()+" i : "+i);
		}
		System.out.println("Good Bye from "+Thread.currentThread().getName());
	}
}
public class DaemonThreadDemoMain {

	public static void main(String[] args) {
		
		MyThread t1=new MyThread();
		MyThread t2=new MyThread();
		MyThread t3=new MyThread();
		
		t1.setDaemon(true);
		t2.setDaemon(true);
		t3.setDaemon(true);
		
		t1.start();
		t2.start();
		t3.start();
		
		
		
		for(int j=1;j<=5;j++) {
			System.out.println(Thread.currentThread().getName()+" j : "+j);
		}
		System.out.println("Good Bye from "+Thread.currentThread().getName());

	}

}
