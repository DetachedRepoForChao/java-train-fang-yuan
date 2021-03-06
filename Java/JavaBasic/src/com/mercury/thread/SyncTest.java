package com.mercury.thread;

public class SyncTest {
	// synchronized is a java keyword, can be added in front of a function, or a code block

	public static void foo() {
		System.out.println(Thread.currentThread().getName() +  " is fooing...");
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName() +  " foo complete!");
	}
	
	synchronized public static void bar() {
		System.out.println(Thread.currentThread().getName() +  " is baring...");
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName() +  " bar complete!");
	}
	
	synchronized public void dance() {
		System.out.println(Thread.currentThread().getName() +  " is dancing...");
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName() +  " dance complete!");
	}
	
	synchronized public void sing() {
		System.out.println(Thread.currentThread().getName() +  " is singing...");
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName() +  " sing complete!");
	}
	
	public static class MyThread extends Thread {
		SyncTest st;
		
		@Override
		public void run() {
//			SyncTest.foo();
			st.sing();
		}
	}
	
	public static void main(String[] args) {
		SyncTest st = new SyncTest();
		
		MyThread mt = new MyThread();
		mt.st = st;
		
		mt.start();
		
//		SyncTest.bar();
		st.dance();
		
	}

}
