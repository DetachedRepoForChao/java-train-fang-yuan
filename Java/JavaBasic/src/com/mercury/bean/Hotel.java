package com.mercury.bean;

import java.io.Serializable;

public class Hotel implements Serializable {
	
	// static field will NOT be serialized
	// only 1 exception : serialVersionUID
	
	private static final long serialVersionUID = 6741957691346L;
	public static String country = "US";
	
	private String name;
	private String addr;
	transient private int yearage;
	transient public Stadium s;
	
	public Hotel() {
		super();
		System.out.println("111111111111111");
	}
	public Hotel(String name, String addr, int yearage) {
		super();
		this.name = name;
		this.addr = addr;
		this.yearage = yearage;
		System.out.println("111111111111111");
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public int getYearage() {
		return yearage;
	}
	public void setYearage(int yearage) {
		this.yearage = yearage;
	}
	
	@Override
	public String toString() {
		return "Hotel [name=" + name + ", addr=" + addr + ", yearage=" + yearage + "] " + country;
	}
}
