package com.mercury.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;

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
//		Iterator<Integer> iterator = l.iterator();
//		while(iterator.hasNext()) {
//			System.out.println(iterator.next());
//		}
		
		// 4. forEach()
//		Consumer c = e -> System.out.println(e);
		
		l.forEach(e -> System.out.println(e));
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
//		Iterator<Integer> iterator = hs.iterator();
//		while(iterator.hasNext()) {
//			System.out.println(iterator.next());
//		}
		
		// 4. forEach
		hs.forEach(e -> System.out.println(e * 2));
	}

	public static void testIterator() {
		List<Integer> l = new ArrayList();
		l.add(1);
		l.add(2);
		l.add(3);
		l.add(4);
		
		// traditional for loop not using iterator
		// no exception while "fail"
//		for(int i = 0; i < l.size(); i++) {
//			if(i == 0) {
//				l.remove(2);
//			}
//		}
		
		// enhanced for loop internally use iterator
//		for(int i : l) {
//			if(i == 1) {
//				l.remove(0);
//			}
//		}
		
//		CopyOnWriteArrayList cc;
		
		Iterator<Integer> i = l.iterator();
		while(i.hasNext()) {
			int cur = i.next();
			if(cur == 2) {
				i.remove();
			}
		}
		
		System.out.println(l);
	}
	
	public static void iterateMap() {
		Map<Integer, Integer> hm = new HashMap();
		hm.put(1, 1);
		hm.put(2, 1);
		hm.put(3, 1);
		hm.put(4, 1);
		
		// use key set
//		Set<Integer> ks = hm.keySet();
//		for(Integer key : ks) {
//			System.out.println(key + " --> " + hm.get(key));
//		}
		
		// use entry set
		Set<Map.Entry<Integer, Integer>> s = hm.entrySet();
		
//		Iterator i = s.iterator();
//		
//		while(i.hasNext()) {
//			Object n = i.next();
//			Map.Entry me = (Map.Entry)n;
//			System.out.println(me.getKey() + " ---> " + me.getValue());
//		}
		
//		Iterator<Map.Entry<Integer, Integer>> i = s.iterator();
//		while(i.hasNext()) {
//			Map.Entry<Integer, Integer> me = i.next();
//			System.out.println(me.getKey() + " ---> " + me.getValue());
//		}
		
		hm.forEach((k, v) -> System.out.println(k + " <<>> " + v));
	}
	
	public static void main(String[] args) {
//		iterateArray();
//		iterateList();
//		iterateSet();
//		testIterator();
		iterateMap();
	}

}
