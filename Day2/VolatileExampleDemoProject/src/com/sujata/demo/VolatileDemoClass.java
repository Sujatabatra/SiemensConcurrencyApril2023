package com.sujata.demo;

public class VolatileDemoClass {

	private static volatile int value = 0;

	public static void main(String[] args) {

		new ChangeReader().start();
		new ChangeMaker().start();
	}

	static class ChangeReader extends Thread{
			@Override
			public void run() {
				int localValue=value;
				while(localValue<5) {
					if(localValue!=value) {
						System.out.println("Got change for value "+value );
						localValue=value;
					}
				}
			}
		}
	
	static class ChangeMaker extends Thread{
		@Override
		public void run() {
			int localValue=value;
			while(value<5) {
				System.out.println("Incrementing Value to "+(localValue+1));
				value=++localValue;
				
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

}
