package com.mercury.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.Vector;

import com.mercury.bean.Computer;

public class CollectionBasic {

	public static void main1(String[] args) {
		// generic - class
		// if generic is not provided, Object by default
		List<Integer> sl = new ArrayList<Integer>();
		
		sl.add(1);
		
		System.out.println(sl);
		
		// Wrapper class
		// Auto boxing / unboxing
		// Boxing
		Integer i = 2;	// Integer i = new Integer(2);
		
		// Unboxing
		int j = new Integer(2);	// int j = 2;
		
		// vector:
		// 1. default init capacity = 10
		// 2. thread safe, performance bad
		// 3. default resize rate = 2 (ArrayList is 1.5)
		// 4. can provide capacity increment
		List v = new Vector();
		
		List ll = new LinkedList();
		
		// allows null key, & null value
		Map<Integer, String> hm = new HashMap();
		
		hm.put(2, null);
		hm.put(null, "ABC");
		
		Map syncHm = Collections.synchronizedMap(hm);
		
		// thread safe - performance bad
		// not allow null key
		// not allow null value
		Map<Integer, String> ht = new Hashtable();
//		ht.put(2, null);
//		ht.put(null, "ABC");
		
		System.out.println("********888");
		
		System.out.println(hm);
		
		// insertion ordered map : HashMap + linked list
		// sorted by key : TreeMap
		Map<Integer, String> lhm = new TreeMap();
		lhm.put(1, "a");
		lhm.put(2342, "a");
		lhm.put(344, "a");
		lhm.put(4, "a");
		lhm.put(555, "a");
		lhm.put(6, "a");
		
		System.out.println(lhm);
	}
	
	
	
	public static void testTreeMap() {
		Computer c1 = new Computer(13, "Mac");
		Computer c2 = new Computer(15, "Dell");
		Computer c3 = new Computer(17, "Acer");
		
		Map<Computer, Integer> tm = new TreeMap();
		tm.put(c1, 1);
		tm.put(c2, 2);
		tm.put(c3, 3);
		
		System.out.println(tm);
		
		System.out.println("****************");
		
		ComputerComparator cc = new ComputerComparator();
		Map<Computer, Integer> tm2 = new TreeMap(cc);
		tm2.put(c1, 1);
		tm2.put(c2, 2);
		tm2.put(c3, 3);
		
		System.out.println(tm2);
		
		System.out.println("*************");
		
		// anonymous implementation
		Comparator<Computer> c = new Comparator<Computer>() {
			@Override
			public int compare(Computer o1, Computer o2) {
				return 0;
			}
		};
		
//		Computer pc = new Computer() {
//			@Override
//			public int getSize() {
//				return 1;
//			}
//		};
		
		Map<Computer, Integer> tm3 = new TreeMap(c);
		tm3.put(c1, 1);
		tm3.put(c2, 2);
		tm3.put(c3, 3);
		
		System.out.println(tm3);
	}
	
	// create a class
	public static class ComputerComparator implements Comparator<Computer> {

		@Override
		public int compare(Computer o1, Computer o2) {
			// return positive : o1 > o2
			return o1.getSize() - o2.getSize();
		}
	}
	
	public static void main(String args[]) {
		testTreeMap();
		Set s = new HashSet();
	}

}
