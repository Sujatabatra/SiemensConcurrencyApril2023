package com.sujata.demo;

//synchronized : method or block
public class Account implements Runnable {

	private /*static*/ int accountBalance = 1000;

	@Override
	public void run() {
		//class level locking
//		synchronized (Account.class)
		//Object Level Locking
		synchronized (this) 
		{
			// 1. Check Balance
			if (accountBalance > 800) {
				System.out.println(Thread.currentThread().getName()
						+ " you have sufficient balance to withdraw and your Balance is Rs. " + accountBalance);
				try {
					Thread.sleep(1000); // 2.sleep
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

				accountBalance -= 800;
				System.out.println(
						Thread.currentThread().getName() + " after withdrawl your balance is Rs." + accountBalance);
			} else {
				System.out.println(Thread.currentThread().getName()
						+ " you have insufficinet funds to withdraw and your balance is Rs." + accountBalance);
			}
		}
	}

}
