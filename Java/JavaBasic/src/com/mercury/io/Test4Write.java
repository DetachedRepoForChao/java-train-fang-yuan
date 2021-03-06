package com.mercury.io;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

import com.mercury.bean.Customer;

public class Test4Write {
	public static void main(String[] args) {
		try(FileOutputStream fos = new FileOutputStream("resources/test4.dat");
				ObjectOutputStream oos = new ObjectOutputStream(fos)) {
			
			Customer c = new Customer("Voodoo", "Male", 2);
			oos.writeObject(c);
			
			System.out.println("Test4 complete!");
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}
