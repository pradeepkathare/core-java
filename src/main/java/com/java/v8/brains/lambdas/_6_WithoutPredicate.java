package com.java.v8.brains.lambdas;

import java.util.ArrayList;
import java.util.List;

//try condition interface before printing values using forloop
/* java 7 approach
 * suppose say,we need to print values conditionally then below is generic approach
 * say 
 * 1 : write a method to print eelemnts iterating by loop and pass condition
 * 2 : make interfaace Condition and override condition method
 * 3 : pass condition as paramter,and if condition matched then print
 * 
 */

public class _6_WithoutPredicate {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		list.add("h");
		list.add("s");
		list.add("f");
		list.add("g");
		
		Conditions  condition = new Conditions() {
			
			@Override
			public boolean test(String s) {
				
				return s.contains("h");
				
		}};
		//using java 8 
		Conditions conditionasjava8 = (s)->s.contains("s");
		printzcondition(list, condition);
		printzcondition(list, conditionasjava8);
		
	}

	//this method becomes generic
	static void printzcondition(List<String> list,Conditions condition) {
		System.out.println("within printzcondition");
		
		for(String s:list) {
			
			if(condition.test(s)) {
				System.out.println(s);
			}
		}
		
	}
}

interface Conditions{
	
	boolean test(String s);
}