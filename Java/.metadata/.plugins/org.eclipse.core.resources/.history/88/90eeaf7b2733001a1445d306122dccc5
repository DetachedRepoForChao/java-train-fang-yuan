package com.mercury.io;

import java.io.FileInputStream;

public class Test1Read {

	public static void main(String[] args) {
		try (FileInputStream fis = new FileInputStream("resources/test1.dat")) {
			
			int x = fis.read();
			
			while(x != -1) {
				System.out.println(x);
				x = fis.read();
			}
			
			System.out.println("->>>>" + (78591934 & 255));
			System.out.println(78591934 % 256);
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}
