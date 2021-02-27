package com.java.v8.brains.lambdas;

import java.util.function.Predicate;

/*
 * Method refernces are ways to match/refer methods to functional interfaces  which are been implemented by 
 * for static with class name 
 * for non-static with object reference
 * with parameter 
 * without parameter
 * 
 */

public class _13_MethodReferences {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("main driver");
		Predicate<Integer> predicate = new _13_MethodReferences()::display; //here we are saying display method of class
		//_13_MethodReferences to refer to  functional interface Predicate of test method
		//since 
		predicate.test(10);
		Thread thread = new Thread(()->{System.out.println("run method");}); // this is lambda of runnable run method
		Thread thread1 = new Thread(_13_MethodReferences::displayMode); 
		thread1.start();
		thread.start();
		
		
	}

	static void  displayMode() {
		System.out.println("HelloWorld");
	}
	
	boolean display(int i) {
		System.out.println("display");
		return true;
	}
}
