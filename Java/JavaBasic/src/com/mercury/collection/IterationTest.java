package com.mercury.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class IterationTest {
	
	public static void iterateArray() {
		int[] nums = {1, 2, 3, 4};
		
		// 1. traditional for loop
//		for(int i = 0; i < nums.length; i++) {
//			System.out.println(nums[i]);
//		}
		
		// 2. enhanced for loop, for each
		// internal logic:
		for(int i : nums) {
			System.out.println(i);
		}
		
		// 3. iterator
		// 4. forEach
	}
	
	public static void iterateList() {
		List<Integer> l = new ArrayList();
		l.add(1);
		l.add(2);
		l.add(3);
		l.add(4);
		
		// 1. traditional for loop
//		for(int i = 0 ; i < l.size(); i++) {
//			System.out.println(l.get(i));
//		}
		
		// 2. enhanced for loop
//		for(int i : l) {
//			System.out.println(i);
//		}
		
		// 3. iterator
		Iterator<Integer> iterator = l.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		// 4. forEach()
	}
	
	public static void iterateSet() {
		Set<Integer> hs = new HashSet();
		hs.add(1);
		hs.add(2);
		hs.add(3);
		hs.add(4);
		
		// 1. traditional for loop : no index
		// 2. enhanced for loop
//		for(int i : hs) {
//			System.out.println(hs);
//		}
		
		// 3. iterator
		Iterator<Integer> iterator = hs.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		// 4. forEach
	}

	public static void main(String[] args) {
//		iterateArray();
		iterateList();
	}

}