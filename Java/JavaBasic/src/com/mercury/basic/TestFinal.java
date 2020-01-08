package com.mercury.basic;

// final is a java keyword
// can be added in front of a class / variable / function 
// 1. final class cannot be extended
// 2. final function cannot be overridden; (even work on static function)
// 3. final field cannot be modified/reassigned
public class TestFinal {
	
	public static final void test() {};
	Object o;
	
	public static class A extends TestFinal {
//		public static void test() {}
	}

	// assign value to a static final field
	// 1. assign when define
	static final int i = 2;
	
	static final int j;
	
	// 2. assign in static block
	static {
		j = 9;
	}
	
	
	// assign value to a non-static final field
	// 1. assign when define
	final int k = 2;
	
	// 2. assign in block
	final int m;
	{
		m = 2;
	}
	
	// 3. assign in all constructors
	final int n;
	
	public TestFinal() {
		n = 1;
	}
	
	public TestFinal(int x) {
		n = 8;
	}
	
	public static class User {
		int age;
	}
	
	public static final User u = new User();
	
	public static void main(String[] args) {	
		u.age = 2;
		u.age = 9;
		System.out.println(u.age);
		
		
	}
}
