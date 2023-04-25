package com.sujata.demo;

public class MainAccountClass {

	public static void main(String[] args) {
		Account a001=new Account();
//		Account a002=new Account();
		Thread rohanThread=new Thread(a001, "Rohan");
		Thread saurabhThread=new Thread(a001,"Saurabh");
		
		
		rohanThread.start();
		saurabhThread.start();
		
		
//		for single threaded
//		a001.run();
//		System.out.println("================");
//		a001.run();
//		System.out.println("================");
//		a001.run();
	}

}
