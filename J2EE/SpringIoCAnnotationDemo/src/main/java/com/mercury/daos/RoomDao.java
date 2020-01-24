package com.mercury.daos;

import org.springframework.stereotype.Repository;

@Repository
public class RoomDao {
	private int id;
	private String name;
	
	public RoomDao() {
		super();
		System.out.println("Creating RoomDao " + super.toString());
	}
	public RoomDao(int id, String name) {
		super();
		this.id = id;
		this.name = name;
		System.out.println("Creating RoomDao: " + id + ", " + name + " " + super.toString());
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
	
	@Override
	public String toString() {
		return "RoomDao [id=" + id + ", name=" + name + "] " + super.toString();
	}
}
