package com.mercury.basic;

public class MySingleton {

	public static class MyEagerSingleton {
		private MyEagerSingleton() {}
		private static MyEagerSingleton mes = new MyEagerSingleton();
		public static MyEagerSingleton getInstance() {
			return mes;
		}
	}
	
	public static class DoubleNullSingleton {

		private int level;
		private static volatile DoubleNullSingleton dns = new DoubleNullSingleton();
		
		private DoubleNullSingleton() {}
		private DoubleNullSingleton(int level) {this.level = level;}
		
		public int getLevel() {
			return level;
		}
		public void setLevel(int level) {
			this.level = level;
		}

		public static DoubleNullSingleton getInstance() {
			if(dns == null) {
				synchronized(DoubleNullSingleton.class) {
					if(dns == null) {
						dns = new DoubleNullSingleton();
					}
				}
			}
			return dns;
		}
		
		public static DoubleNullSingleton getLeveledInstance(int level) {
			if(dns == null) {
				synchronized(DoubleNullSingleton.class) {
					if(dns == null) {
						dns = new DoubleNullSingleton(level);
					}
				}
			}
			return dns;
		}
	}
	
	public static enum EnumSingleton {
		X;
	}
	
	public static void foo() {
		Direction d = Direction.North;
		bar(d);
	}
	
	public static void bar(Direction d) {
		System.out.println(d);
	}
	
	public static void main(String args[]) {
		EnumSingleton es = EnumSingleton.X;
	}
}
