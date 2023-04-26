package com.sujata.demo;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class MainBarrierTester implements Runnable {

	public static CyclicBarrier newBarrier=new CyclicBarrier(3);
	public static void main(String[] args) {
		MainBarrierTester test=new MainBarrierTester();
		Thread t1=new Thread(test);
		t1.start();

	}
	@Override
	public void run() {
		System.out.println("Number of parties required to trip the barrier : "+newBarrier.getParties());
		System.out.println("sum of product and sum = "+(Computation1.product+Computation2.sum));
		
		Computation1 computation1=new Computation1();
		Computation2 computation2=new Computation2();
		
		Thread t2=new Thread(computation1);
		Thread t3=new Thread(computation2);
		
		t2.start();
		t3.start();
		
		try {
			MainBarrierTester.newBarrier.await();
		} catch (InterruptedException | BrokenBarrierException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//barrer breaaks as the number of threads waiting for the barrier at this point is 3
		System.out.println("sum of product and sum = "+(Computation1.product+Computation2.sum));
		
		//Resetting the new Barrier
		MainBarrierTester.newBarrier.reset();
		System.out.println("Barrier reset successful");
	}

}
