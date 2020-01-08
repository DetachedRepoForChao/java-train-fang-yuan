package com.mercury.basic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ExceptionHandling {

	// throws : indicate the caller, this function MAY throws Exception
	public static void testException() throws NullPointerException {
		System.out.println(1);

		throw new NullPointerException();
		
//		try {
//			System.out.println(2);
//			int x = 23;
//			if(x < 10) {
//				throw new IOException();
//			} else {
//				throw new TreeException("ABC");
//			}
//			
//		} catch (IOException e) {
//			System.out.println(4);
//			e.printStackTrace();
//			System.out.println(5);
//		}
		
//		System.out.println(6);
	}
	
	public static void testMultiException() {
		try {
			f1();
			f2();
		} catch(FileNotFoundException ioe) {
			
		} catch(IOException fnfe) {
			
		}
	}
	
	public static void f1() throws IOException {
		// logic
		throw new IOException();
	}
	
	public static void f2() throws FileNotFoundException {
		//logic
//		throw new BadLocationException("a", 1);
		throw new FileNotFoundException();
	}
	
	
	public static void testFinally() {
		FileOutputStream fos = null;
		FileInputStream fis = null;
		
		try {
			
			 fos = new FileOutputStream("c:/2123.txt");
			 fis = new FileInputStream("c:/134.txt");
			
			// logic : use fos to operate
			System.exit(1);
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			// this block will always be executed, no matter what happened
			// unless JVM shut down
			try {
				if(fos != null)
					fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			try {
				if(fis != null)
					fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("8");
	}
	
	public static void testTryWithResource() {
		// 1. finally normally used for closing resources
		// 2. need a lot of redundant code to do so.
		
		// will be closed right after try block
		try(MyResource mr = new MyResource();
				FileOutputStream fos = new FileOutputStream("c:/2123.txt");
				FileInputStream fis = new FileInputStream("c:/134.txt");
				){
			fos.write(1);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static class MyResource implements AutoCloseable{

		@Override
		public void close() throws Exception {
			System.out.println("Closing...");
		}
		
	}
	
	// ctrl + shift + o
	public static void main(String[] args)  {
//		testException();
		
//		testFinally();
		
		testTryWithResource();
		
		
		System.out.println(7);
	}

}
