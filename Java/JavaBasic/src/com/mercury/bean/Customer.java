package com.mercury.bean;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class Customer implements Externalizable {
	
	private String name;
	transient private String gender;
	private int age;
	
	public Customer() {
		super();
		System.out.println("111111111111111");
	}
	public Customer(String name, String gender, int age) {
		super();
		this.name = name;
		this.gender = gender;
		this.age = age;
		System.out.println("222222222222");
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", gender=" + gender + ", age=" + age + "]";
	}
	
	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeObject(name);
		out.writeObject(gender);
		out.writeInt(age);
	}
	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		this.gender = (String)in.readObject();
		this.name = (String)in.readObject();
		this.age = in.readInt();
	}
}