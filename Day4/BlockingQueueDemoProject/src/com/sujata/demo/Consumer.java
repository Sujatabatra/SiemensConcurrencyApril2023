package com.sujata.demo;

import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable {

	private BlockingQueue<String> queue;

	public Consumer(BlockingQueue<String> queue) {
		super();
		this.queue = queue;
	}

	@Override
	public void run() {
		try {
			while(true) {
				System.out.println("Consumer Consuming "+queue.take());
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}

	}

}
