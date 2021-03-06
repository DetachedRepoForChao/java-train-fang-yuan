package com.mercury.basic.constructor;

public class Test1 {
	
	public static class Par {
		
		// default no parameter constructor will be provided automatically
		// once any constructor is provided, no more default constructor
		
		// constructor is object level function, last step to call for initializing the object
		
		// no return type specified for constructors
		// constructor can be private
		// constructor can be overloaded
		// constructor cannot be overridden
		
		public Par() {
			System.out.println("Creating par");
		}
		
		public Par(int i) {
			System.out.println("Creating par: " + i);
		}
		
	}
	
	public static class Sub extends Par {
		// sub constructor will invoke par constructor 
		public Sub() {
			// super constructor can only be invoked in the 1st line of sub constructor
			super();
			System.out.println("Creating sub");
		}
		
		public Sub(int i) {
			super(i);
			System.out.println("Creating sub: " + i);
		}
	}

	public static void main(String[] args) {
		new Sub(1);
	}

}
