package com.sujata.demo;

public class MainFactorial {

	public static void main(String[] args) {
		Factorial t1=new Factorial(12);
		Factorial t2=new Factorial("FactorialEight", 8);
		Factorial t3=new Factorial(5);
		
		t1.start();
		t2.start();
		t3.start();
		
		try {
			t1.join();
			t2.join();
			t3.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
//		t1.displayFactorial();
//		t2.displayFactorial();
//		t3.displayFactorial();
		
		System.out.println("Factorial of "+t1.getNumber()+" : "+t1.getFactorial());
		System.out.println("Factorial of "+t2.getNumber()+" : "+t2.getFactorial());
		System.out.println("Factorial of "+t3.getNumber()+" : "+t3.getFactorial());
		System.out.println(Thread.currentThread().getName()+" Ends Here!");

	}

}
