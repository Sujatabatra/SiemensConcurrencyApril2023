package com.sujata.demo;

import java.util.concurrent.BrokenBarrierException;

public class Computation2 implements Runnable {

	public static int sum=0;
	
	@Override
	public void run() {
		sum=10+20;
		
		try {
			MainBarrierTester.newBarrier.await();
		} catch (InterruptedException | BrokenBarrierException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
