package com.mercury.io;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

import com.mercury.bean.Customer;

public class Test4Read {
	public static void main(String[] args) {
		try(FileInputStream fis = new FileInputStream("resources/test4.dat");
				ObjectInputStream ois = new ObjectInputStream(fis)) {
			
			Customer c = (Customer)ois.readObject();
			
			System.out.println(c);
			
		} catch(Exception e) {
			e.printStackTrace();
		}

	}
}
