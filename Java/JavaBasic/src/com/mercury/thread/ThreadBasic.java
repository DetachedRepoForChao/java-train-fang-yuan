package com.mercury.thread;

public class ThreadBasic {
	
	public static class MyThread1 extends Thread {
		@Override
		public void run() {
			System.out.println(Thread.currentThread().getName() +  " is running.");
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Done");
		}
	}
	
	public static class MyThread2 implements Runnable {
		@Override
		public void run() {
			System.out.println(Thread.currentThread().getName() +  " is running.");
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Done");
		}
	}

	public static void main(String[] args) {
//		MyThread1 mt1 = new MyThread1();
//		
//		mt1.setDaemon(true);
//		
////		mt1.run();
//		mt1.start();
		
		
		MyThread2 mt2 = new MyThread2();
		new Thread(mt2).start();
		
		System.out.println("************");
	}

}
