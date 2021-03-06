package com.mercury.basic.constructor;

public class Test2 {
	
	public static class Par {
		public Par() {
			System.out.println("Creating par");
			foo();
		}
		
		private void foo() {
			System.out.println("Par foo");
		}
	}
	
	public static class Sub extends Par {
		public Sub() {
			System.out.println("Creating sub");
			foo();
		}
		
		public void foo() {
			System.out.println("Sub foo");
		}
	}

	public static void main(String[] args) {
		new Sub();
	}
}
