package com.mercury.bean;

public class Stadium implements Cloneable {
	private int id;
	private String name;
	private String address;
	
	public Stadium() {
		super();
	}
	
	public Stadium(int id, String name, String address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Stadium [id=" + id + ", name=" + name + ", address=" + address + "]";
	}
	
	@Override
	public Stadium clone() {
//		return new Stadium(id, new String(name), address);
		Stadium s = null;
		try {
			s = (Stadium)super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return s;
	}
}
