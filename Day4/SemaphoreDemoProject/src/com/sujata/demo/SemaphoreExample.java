package com.sujata.demo;

import java.util.concurrent.Semaphore;

public class SemaphoreExample {

	static Semaphore semaphore=new Semaphore(3);
	
	static class DemoThread extends Thread{
		String name;
		
		DemoThread(String name){
			this.name=name;
		}
		
		@Override
		public void run() {
			try {
				System.out.println("Thread "+name+" acquiring lock......");
				System.out.println("Thread "+name+" : available permits is : "+semaphore.availablePermits());
				//acquire lock on shared resource
				semaphore.acquire();
				System.out.println("Thread "+name+" got the permit");
				for(int i=1;i<=5;i++) {
					System.out.println("Thread"+name+" is performing operation "+i+", available permits "+semaphore.availablePermits());
					Thread.sleep(2000);
				}
			}
			catch(Exception ex) {
				ex.printStackTrace();
			}
			finally {
				System.out.println("Thread "+name+" releasing lock....");
				//release lock for other threads
				semaphore.release();
				System.out.println("Thread "+name+" :available semaphore permits is "+semaphore.availablePermits());
			}
		}
	}
	public static void main(String[] args) {
		System.out.println("Total Available Semaphores "+semaphore.availablePermits());
		
		DemoThread t1=new DemoThread("FirstThread");
		DemoThread t2=new DemoThread("SecondThread");
		DemoThread t3=new DemoThread("ThirdThread");
		DemoThread t4=new DemoThread("FourthThread");
		DemoThread t5=new DemoThread("FifthThread");
		
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		

	}

}
