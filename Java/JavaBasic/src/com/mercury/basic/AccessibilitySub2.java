package com.mercury.basic;

import com.mercury.basic.oop.AccessibilityPar;

public class AccessibilitySub2 extends AccessibilityPar {
	
	@Override
	public void bar() {
		System.out.println("Sub2 bar");
	}
	

	public static void foo() {
		System.out.println("Sub2 foo");
	}
	
	
	public static void main(String args[]) {
		AccessibilityPar ap = new AccessibilitySub2();
//		ap.bar();
		
		ap.foo();
		
		AccessibilityPar.foo();
		AccessibilitySub2.foo();
		
	}
}
