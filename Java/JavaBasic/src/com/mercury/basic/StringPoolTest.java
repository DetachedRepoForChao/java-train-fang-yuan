package com.mercury.basic;

public class StringPoolTest {

	public static void main(String[] args) {
		System.out.println(1);
		
		String s1 = "abc";
		String s2 = "abc";
		String s3 = new String("abc");
		String s4 = new String("abc");
		
		System.out.println(s1 == s2);
		System.out.println(s2 == s3);
		System.out.println(s3 == s4);
		
		String s5 = new String("xyz");
		String s6 = s5.intern();
		
	}
}