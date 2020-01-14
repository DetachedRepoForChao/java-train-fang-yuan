package com.mercury.thread.concurrent;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class SafeLock {
	
	public static class MyThread extends Thread {
		private int id;
		private Lock lock1, lock2;
		
		public MyThread(int id, Lock lock1, Lock lock2) {
			this.id = id;
			this.lock1 = lock1;
			this.lock2 = lock2;
		}
		
		@Override
		public void run() {
			if(lock1.tryLock()) {
				System.out.println(id + " gets " + lock1);
				
//				try {
//					Thread.sleep(1000);
//				} catch (InterruptedException e) {
//					e.printStackTrace();
//				}
				
				if(lock2.tryLock()) {
					System.out.println(id + " gets " + lock2);
					lock2.unlock();
				} else {
					System.out.println(id + " cannot get " + lock2);
				}
				
				lock1.unlock();
			} else {
				System.out.println(id + " cannot get " + lock1);
			}
		}
	}

	public static void main(String[] args) {
		Lock lock1 = new ReentrantLock();
		Lock lock2 = new ReentrantLock();
		
		new MyThread(1, lock1, lock2).start();
		new MyThread(2, lock2, lock1).start();
		
		System.out.println("***********");
	}

}
