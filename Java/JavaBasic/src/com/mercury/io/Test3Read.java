package com.mercury.io;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

import com.mercury.bean.Hotel;

public class Test3Read {

	public static void main(String[] args) {
		try(FileInputStream fis = new FileInputStream("resources/test3.dat");
				ObjectInputStream ois = new ObjectInputStream(fis)) {
			
			Hotel.country = "CN";
			
			Hotel h = (Hotel)ois.readObject();
			
			System.out.println(h);
			
		} catch(Exception e) {
			e.printStackTrace();
		}

	}

}
