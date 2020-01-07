package com.mercury.basic.oop;

public class AccessibilityPar {
	
	// public : access from anywhere
	// protected
	// package
	// private : access only from same class
	
	// both protected & package function can only be called from same package
	// protected function can be overridden from anywhere, package level function can only be overridden from same package
	
	public static void foo() {
		System.out.println("Par foo");
	}
	
	protected void bar() {
		System.out.println("Par bar");
	}
	
}
