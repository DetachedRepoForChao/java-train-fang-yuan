package com.mercury.basic.oop;

public class ExtendTest {
	
	abstract public static class Animal {
		
		public static void sleep() {
			System.out.println("Animal is sleeping");
		}
		
		public static void eat(String food) {
			System.out.println("Animal is eating " + food);
		}
		
		public void move() {
			System.out.println("Animal is moving...");
		}
		
//		abstract public void sing();
		
		public void play() {
			System.out.println("Animal play");
		}
		
		public void play(int i) {
			
		}
	}
	
	public static class Bird extends Animal {
		
		// static function cannot be overridden
		// private function cannot be overridden
//		@Override
		public static void eat(String food) {
			System.out.println("Bird is eating " + food);
		}
		
		@Override
		public void move() {
			System.out.println("Bird is flying...");
		}
	}
	
	public static class Fish extends Animal {
		public void sing() {
			
		}
		
		public void play(String s) {
			
		}
	}

	public static void main(String[] args) {
		Bird b = new Bird();
		b.move();
		
		b.eat("bug");
		b.sleep();
		
		new Fish();
	}

}
