package com.mercury.io;

import java.io.FileOutputStream;

public class Test1Write {

	public static void main(String[] args) {
		try (FileOutputStream fos = new FileOutputStream("resources/test1.dat");) {
			
			int[] nums = {-1, 2, 3, 4, 78591934};
			for(int x : nums) {
				fos.write(x);
			}
			
			System.out.println("Test1 done!");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
