package com.sujata.demo;

public class Factorial extends Thread {

	private int number;
	private long factorial;

	public Factorial(String name, int number) {
		super(name);
		this.number = number;
	}

	public Factorial(int number) {
		super();
		this.number = number;
	}
	
	public void run() {
		factorial=1L;
		int num=number;
		while(num>=1)
			factorial*=num--;
	}
	
	public void displayFactorial() {
		System.out.println("Facrorial of "+number+" = "+factorial);
	}

	public int getNumber() {
		return number;
	}

	public long getFactorial() {
		return factorial;
	}
	
	
}
