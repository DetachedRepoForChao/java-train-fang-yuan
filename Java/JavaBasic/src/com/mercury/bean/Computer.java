package com.mercury.bean;

public class Computer implements Comparable<Computer> {
	
	private int size;
	private String brand;
	
	public Computer() {
		super();
	}
	public Computer(int size, String brand) {
		super();
		this.size = size;
		this.brand = brand;
	}
	
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}

	@Override
	public String toString() {
		return "Computer [size=" + size + ", brand=" + brand + "]";
	}
	
	@Override
	public int compareTo(Computer c) {
		// return positive : this > input
		// return 0 	   : this = input
		// return negative : this < input
		
//		if(c == null) {
//			return 1;
//		}
//		
//		return this.brand.compareTo(c.getBrand());
		
		return c.size - this.size;
	}
}
