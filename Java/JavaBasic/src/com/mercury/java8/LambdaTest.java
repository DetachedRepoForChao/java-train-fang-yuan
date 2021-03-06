package com.mercury.java8;

public class LambdaTest {
	
	public static class Arena implements Building {
		@Override
		public void fall() {
			System.out.println("Arena fall");
		}
	}
	
	
	

	public static void main(String[] args) {
		System.out.println("**********");
		
		Building arena = new Arena();
		
		Building tower = new Building() {
			@Override
			public void fall() {
				System.out.println("Tower fall");
			}
		};
		
		// Lambda expression can only be used to implement interfaces which has only 1 abstract method
		Building house = () -> System.out.println("House fall");
		
		house.fall();
		
		System.out.println("***********");
		
		Cloth pants = (s, c) -> 1;
	
	}

}
