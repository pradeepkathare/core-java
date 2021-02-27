package com.java.v8.brains.lambdas;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/*
 * Without predicate , we saw in previous example we have to build interface and method test 4
 * where implementation is passed as a parameter.
 * 
 * Predicate(java-8),is generic interface with default method as test.so we can avoid some interface code
 * 
 */
public class _7_WithPredicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> list = new ArrayList<>();
		list.add("a");
		list.add("ab");
		list.add("ac");
		
		Predicate<String> predicatewithannonynmus = new Predicate<String>() {
			@Override
			public boolean test(String t) {
				// TODO Auto-generated method stub
				return false;
			}
		};
		
		Predicate<String> predicatewithlambda = (s)->{
			return s.contains("b");
		};
		
		printconditionally(list, predicatewithlambda);
		
	}

	//predicate is interface
	static void printconditionally(List<String> list,Predicate<String> predicate) {
		
		for(String s:list) {
			if(predicate.test(s)) {
				System.out.println("predicate matches the condition : "+s);
			}
		}
		
	}
}
