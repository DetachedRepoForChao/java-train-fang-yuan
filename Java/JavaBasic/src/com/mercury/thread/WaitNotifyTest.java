package com.mercury.thread;

import com.mercury.thread.SyncTest.MyThread;

public class WaitNotifyTest {
	// wait function is defined in Object class
	// can only be called on lock object, within a sync environment

	public static class Patient implements Runnable {
		int level;
		String name;
		Doctor d;
		
		public Patient(String name, int level, Doctor d) {
			this.name = name;
			this.level = level;
			this.d = d;
		}
		
		public String toString() {
			return name;
		}
		
		@Override
		public void run() {
			d.treat(this);
		}
	}
	
	public static class Doctor {
		
		public void treat(Patient p) {
			System.out.println(p + " arrived!");
			synchronized(this) {
				if(p.level > 5) {
					try {
						this.wait();	// current thread will wait for "this"
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				} else {
					this.notify();		// current thread is notify one thread back, which is waiting for "this"
				}
				
				try {
					Thread.sleep(p.level * 1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
				System.out.println(p + " is done!");
			}
		}
	}

	public static void main(String[] args) {
		Doctor d = new Doctor();
		
		Patient pa = new Patient("A", 2, d);
		Patient pb = new Patient("B", 3, d);
		Patient pc = new Patient("C", 6, d);
		
//		new Thread(pa).start();
//		new Thread(pb).start();
		new Thread(pc).start();
		
		System.out.println("**********");

//		String a = "a";
//		
//		try {
//			a.wait();
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//		
//		System.out.println("**********");
	}

}
