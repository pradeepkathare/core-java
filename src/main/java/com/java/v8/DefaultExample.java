package com.java.v8;

/*
 * DefaultMehtod:In java 8 we have option to use default methods to overcome abstractclass
 * 1 : If we need implementation of method in interface then use static or default keyword and implememt it
 * 
 * Behavior in Inheritance :
 * 1 : If we have same method name in 2 interfaces then implementing class should override the default method
 */
interface Interface1 {

	default void add() {
		System.out.println("Interface1 add method");
	}

	default void display() {
		System.out.println("Interface1 display");
	}

	//static methods can be invoked only using InterfaceName.methodName
	static void print() {
		System.out.println("Interface1 print");
	}

	static void printV2() {
		System.out.println("Interface1 printV2");
	}
}

interface Interface2{
	
	default void display() {
		System.out.println("Interface2 display");
	}
	static void printV2() {
		System.out.println("Interface1 printV2");
	}
}


//
public class DefaultExample implements Interface1,Interface2 {

	public static void main(String[] args) {
		
		DefaultExample de = new DefaultExample();
		de.add();		
		Interface1.print();
		de.display();

	}

	//Mandatory : we should override display method it is present in both interface  
	@Override
	public void display() {
		Interface1.super.display();
	}



}
