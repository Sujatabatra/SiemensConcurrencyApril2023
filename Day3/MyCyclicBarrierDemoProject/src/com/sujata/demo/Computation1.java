package com.sujata.demo;

import java.util.concurrent.BrokenBarrierException;

public class Computation1 implements Runnable {

	public static int product=0;
	
	@Override
	public void run() {
		product=2*3;
		try {
			MainBarrierTester.newBarrier.await();
		} catch (InterruptedException | BrokenBarrierException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
