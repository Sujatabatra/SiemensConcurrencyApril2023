package com.sujata.demo;

@FunctionalInterface
interface Greet{
	void wish(String name);
}
@FunctionalInterface
interface Calculate{
	long operate(int x,int y);
}

public class DemoLamdaMethods {

	public static void main(String[] args) {
//		Greet goodMorning=(String name)->{
//			System.out.println("Good Morning "+name);
//		};
//		
//		Greet goodMorning=(name)->{
//			System.out.println("Good Morning "+name);
//		};
		
//		Greet goodMorning=name->{
//			System.out.println("Good Morning "+name);
//		};
		
		Greet goodMorning=name->System.out.println("Good Morning "+name);
		
		
		goodMorning.wish("Abhishek");
		
		goodMorning.wish("Rekha");

//		Calculate sum=(x,y)->{return x+y;};
		
		Calculate sum=(x,y)->x+y;
		
		System.out.println("Addition of two nos : "+sum.operate(10, 30));
		
		
	}

}
