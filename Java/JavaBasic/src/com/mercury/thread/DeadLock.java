package com.mercury.thread;

public class DeadLock {

	public static class MyThread extends Thread {
		private int id;
		private Object lock1, lock2;
		
		public MyThread(int id, Object lock1, Object lock2) {
			this.lock1 = lock1;
			this.lock2 = lock2;
			this.id = id;
		}
		
		@Override
		public void run() {
			synchronized(lock1) {
				System.out.println(id + " get " + lock1);
				
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
				synchronized(lock2) {
					System.out.println(id + " get " + lock2);
				}
			}
		}
	}
	
	public static void main(String[] args) {
		Object lock1 = new Object();
		Object lock2 = new Object();

		MyThread mt1 = new MyThread(1, lock1, lock2);
		MyThread mt2 = new MyThread(2, lock2, lock1);
		
		mt1.start();
		mt2.start();
		
		System.out.println("**************");
	}

}
