package com.mercury.basic;

public enum Direction {
	North;
	
	public static void foo() {
		System.out.println("Direction foo");
	}
	
	public void bar() {
		System.out.println(this.name() + " bar");
	}
}
