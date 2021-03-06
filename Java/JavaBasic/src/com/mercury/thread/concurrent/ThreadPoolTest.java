package com.mercury.thread.concurrent;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ThreadPoolTest {
	
	public static class DummyThread implements Runnable{

		int id;
		public DummyThread(int id) {
			this.id = id;
		}
		
		@Override
		public void run() {
			System.out.println(Thread.currentThread().getName() + " -> " + id);
		}
		
	}
	
	public static void process() {
//		ExecutorService es = Executors.newCachedThreadPool();
//		ExecutorService es = Executors.newFixedThreadPool(5);
		ExecutorService es = Executors.newSingleThreadExecutor();
		
		for(int i = 0; i < 100; i++) {
			es.submit(new DummyThread(i));
		}
		
		es.shutdown();
	}
	
	public static class SmartThread implements Callable<Integer> {
		
		int num;
		public SmartThread(int num) {
			this.num = num;
		}
		
		public int factorial(int num) {
			if(num < 2) {
				return 1;
			} else {
				return num * factorial(num - 1);
			}
		}

		@Override
		public Integer call() throws Exception {
			Thread.sleep((11 - num) * 1000);
			return factorial(num);
		}
		
	}
	
	public static void process2() {
		ExecutorService es = Executors.newCachedThreadPool();
		
		List<Future<Integer>> futures = new ArrayList();
		
		for(int i = 0; i < 10; i++) {
			Future<Integer> f = es.submit(new SmartThread(i));
			futures.add(f);
		}
		
		for(Future<Integer> f : futures) {
			while(!f.isDone() ) {
				
			}
			try {
				System.out.println(f.get());
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		es.shutdown();
	}

	public static void main(String[] args) {
//		process();
		process2();
		
		System.out.println("************");
	}

}
