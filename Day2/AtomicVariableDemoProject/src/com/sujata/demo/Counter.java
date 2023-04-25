package com.sujata.demo;

public class Counter extends Thread{

	long count=0;
	
	public void run() {
//	synchronized (this) {
		
	
		int max=10000;
		for(int i=0;i<max;i++) {
			count++;
		}
//	}
	}
}

