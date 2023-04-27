package com.sujata.demo;

import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable {

	private BlockingQueue<String> queue;

	public Producer(BlockingQueue<String> queue) {
		super();
		this.queue = queue;
	}

	@Override
	public void run() {
		int i = 0;
		try {
			while (i < 20) {
				System.out.println("Producer Producing : " + i);
				queue.put(" " + i);
				i++;
				Thread.sleep(1000);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
