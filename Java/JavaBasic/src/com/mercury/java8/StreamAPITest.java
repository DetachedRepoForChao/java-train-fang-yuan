package com.mercury.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class StreamAPITest {

	public static void main(String[] args) {
		// function package : java.util.function
		Function f;
		Supplier s;
		Predicate p;
		Consumer c;
		
		List<Integer> l = new ArrayList();
		l.add(1);
		l.add(2);
		l.add(3);
		l.add(4);
		
		List<String> resList = l.parallelStream()
			.filter(e -> e > 2)
			.map(e -> e * 10)
			.map(e -> "salary is " + e)
			.collect(Collectors.toList());

		resList.forEach(e -> System.out.println(e));
		System.out.println(l);
	}

}
