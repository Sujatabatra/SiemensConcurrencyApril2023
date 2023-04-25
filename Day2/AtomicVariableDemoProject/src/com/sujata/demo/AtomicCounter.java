package com.sujata.demo;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicCounter extends Thread {

	AtomicInteger count;
	
	public AtomicCounter() {
		count=new AtomicInteger();
	}
	public void run() {
		int max=10000;
		for(int i=0;i<max;i++) {
			count.addAndGet(1);
		}
	}
}
