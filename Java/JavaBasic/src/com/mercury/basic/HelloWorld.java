package com.mercury.basic;

import java.util.ArrayList;

public class HelloWorld {

	// modifiers return functionName(arguments / parameters) {body}
	public static void main(String[] args) {
		
		String x = "Hello World";
		
//		User u = new User();
		int i = 8;
		
		System.out.println(x);
		
		foo("A");
		
		
		OuterClass.InnerClass1 ic1 = new OuterClass.InnerClass1();
		
		OuterClass oc = new OuterClass();
		OuterClass.InnerClass2 ic2 = oc.new InnerClass2();
		
	}
	
	public static void foo(String s, int... x) {
		System.out.println("foo");
	}
	
	public static void a() {
		System.out.println("a");
	}
	
	public void b() {
		System.out.println("b");
		HelloWorld hw = new HelloWorld();
		a();
	}
	
	public void c() {
		System.out.println("c");
		b();
	}

}
