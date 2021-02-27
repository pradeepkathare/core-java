package com.java.v8;

/*
 * FunctionalInterface : 
 *  1:Interface with single method is called FunctionalInterface.
 *  2:It can contain any number of Object class methods. 
 *  3:Java provides predefined functional interfaces to deal with functional programming by using lambda and method references. 
 */



@FunctionalInterface
interface FunctionaInterface1{
	
	public  void add();
	

	default public void add1() {
		System.out.println("default");
	}
	default public void add2() {
		System.out.println();
	}
}