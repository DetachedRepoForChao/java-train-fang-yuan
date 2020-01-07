package com.mercury.basic.oop;

public class AccessibilitySub1 extends AccessibilityPar {
	
	@Override
	public void bar() {
		System.out.println("Sub1 bar");
	}

	public static void main(String args[]) {
		AccessibilityPar.foo();
	}
}
