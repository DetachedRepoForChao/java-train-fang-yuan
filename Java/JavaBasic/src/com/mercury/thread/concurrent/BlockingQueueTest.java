package com.mercury.thread.concurrent;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class BlockingQueueTest {
	
	public static class Producer extends Thread {
		BlockingQueue<Integer> bq;
		
		public Producer(BlockingQueue<Integer> bq) {
			this.bq = bq;
		}
		
		@Override
		public void run() {
			for(int i = 0; i < 100; i++) {
				try {
					bq.put(i);
					System.out.println("Producing: " + i);
					Thread.sleep(1000);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	public static class Consumer extends Thread {
		BlockingQueue<Integer> bq;
		
		public Consumer(BlockingQueue<Integer> bq) {
			this.bq = bq;
		}
		
		@Override
		public void run() {
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			while(!bq.isEmpty()) {
				try {
					int x = bq.take();
					System.out.println("-----------Consuming: " + x);
					Thread.sleep(3000);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}

	public static void main(String[] args) {
		BlockingQueue bq = new LinkedBlockingQueue(5);
		Producer p = new Producer(bq);
		Consumer c = new Consumer(bq);
		p.start();
		c.start();
	}

}
