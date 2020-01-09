package com.mercury.io;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

import com.mercury.bean.Hotel;
import com.mercury.bean.Stadium;

public class Test3Write {

	public static void main(String[] args) {
		try(FileOutputStream fos = new FileOutputStream("resources/test3.dat");
				ObjectOutputStream oos = new ObjectOutputStream(fos)) {
			
			Hotel h = new Hotel("Hilton", "1 Main Street", 100);
			h.s = new Stadium();
			oos.writeObject(h);
			
			System.out.println("Test3 complete!");
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}
