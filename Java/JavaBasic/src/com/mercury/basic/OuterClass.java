package com.mercury.basic;

import com.mercury.basic.OuterClass.InnerClass2;

public class OuterClass {
	
	public static void o1() {};
	public void o2() {};

	public static class InnerClass1 {
		public static void ic1() {};
		public void ic2() {};
	}
	
	public class InnerClass2 {
//		public static void ic3() {};
		public void ic4() {};
	}
	
	public static void main(String args[]) {
		OuterClass.InnerClass1 ic1 = new OuterClass.InnerClass1();
		
		OuterClass oc = new OuterClass();
		OuterClass.InnerClass2 ic2 = oc.new InnerClass2();	
	}
}
