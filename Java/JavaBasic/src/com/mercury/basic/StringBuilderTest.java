package com.mercury.basic;

public class StringBuilderTest {

	public static void main(String[] args) {
		
		// Builder
		// non thread safe - performance good
		StringBuilder sb = new StringBuilder();
		
		sb.append("x");
		sb.append("y").append("z");
		
		
		String s = "x";
		s += "y";
		
		System.out.println(sb);
		
		// sync
		StringBuffer sb2;
	}

}
