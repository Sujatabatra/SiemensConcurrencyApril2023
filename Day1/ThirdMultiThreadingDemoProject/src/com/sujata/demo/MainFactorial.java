package com.sujata.demo;

public class MainFactorial {

	public static void main(String[] args) {
		
		//Thread objectName=new Thread(Job of the Thread)
		Factorial factorialJob1=new Factorial(5);
		Thread t1=new Thread(factorialJob1); //t1 is a thread with blank job
		
		Factorial factorialJob2=new Factorial(12);
		Thread t2=new Thread(factorialJob2);
		
		t1.start();
		t2.start();
		
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Factorial of : "+factorialJob1.getNumber()+" : "+factorialJob1.getFactorial());
		System.out.println("Factorial of : "+factorialJob2.getNumber()+" : "+factorialJob2.getFactorial());
		
		System.out.println("Good Bye from "+Thread.currentThread().getName());
		
	}

}
