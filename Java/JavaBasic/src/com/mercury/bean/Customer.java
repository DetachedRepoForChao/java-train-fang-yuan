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
	
	
//	private String name;
//	transient private String gender;
//	private int age;
	
//	@Override
//	public int hashCode() {
//		return name.hashCode() * 3 + gender.hashCode() * 7 + age * 19;
//	}
//	
//	@Override
//	public boolean equals(Object o) {
//		if(!(o instanceof Customer)) {
//			return false;
//		}
//		Customer c = (Customer)o;
//		
//		if(!name.equals(c.name)) {
//			return false;
//		}
//		if(!gender.equals(c.gender)) {
//			return false;
//		}
//		if(age != c.age) {
//			return false;
//		}
//		return true;
//	}
	
	
	
	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeObject(name);
		out.writeObject(gender);
		out.writeInt(age);
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((gender == null) ? 0 : gender.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		if (age != other.age)
			return false;
		if (gender == null) {
			if (other.gender != null)
				return false;
		} else if (!gender.equals(other.gender))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		this.gender = (String)in.readObject();
		this.name = (String)in.readObject();
		this.age = in.readInt();
	}
}
