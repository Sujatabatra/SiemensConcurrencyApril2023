package com.sujata.demo;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class BlockingQueueMainClass {

	public static void main(String[] args) {
		BlockingQueue<String> queue=new ArrayBlockingQueue<String>(5);
		
		new Thread(new Producer(queue)).start();
		new Thread(new Consumer(queue)).start();
		

	}

}
