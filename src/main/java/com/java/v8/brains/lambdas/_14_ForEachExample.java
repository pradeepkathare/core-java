package com.java.v8.brains.lambdas;

import java.util.ArrayList;

public class _14_ForEachExample {

	public static void main(String[] args) {
		
		ArrayList<String>  list = new ArrayList<>();
		list.add("a");
		list.add("ab");
		list.add("ac");
		list.add("ad");
		
		//for loop 
		
		//this is not foreach loop its forin loop
		
		for(String s:list) {
			System.out.println(s);
		}

		//now in java8 still easier no need to define data-types
		//println method we are refering to accept method of Consumer interface
		list.forEach(System.out::println);
	}

}
