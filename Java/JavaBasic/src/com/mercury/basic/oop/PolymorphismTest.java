package com.mercury.basic.oop;

public class PolymorphismTest {
	
	public static class GrandPar {
		
	}
	
	public static class Par extends GrandPar {
		
	}
	
	public static class Sub extends Par {
		
	}

	public static void main(String[] args) {
		// up casting, always allowed in Java
		Par p = new Sub();
		
		// down casting, is only allowed when object is "big enough" for this reference
//		Sub s = new Par();
		
		Sub s = (Sub)p;
		
		System.out.println("*******");
	}

}
