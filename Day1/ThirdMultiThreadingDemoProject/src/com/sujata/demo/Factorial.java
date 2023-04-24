package com.sujata.demo;

//Thread Job
public class Factorial extends NumberInput implements Runnable//(Runnable : Thread Job)
{

	private long factorial;

	public Factorial(int number) {
		super(number);
	}

	public void calculateFactorial() {
		factorial = 1;
		int num = getNumber();
		while (num >= 1)
			factorial *= num--;
	}

	public long getFactorial() {
		return factorial;
	}

	//job of the thread
	@Override
	public void run() {
		calculateFactorial();
		
	}

	
}
