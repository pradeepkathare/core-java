package com.java.v8.brains.lambdas;
/*
 * TypeInference : lambdas can be assgined to only on interface type.because compiler looks for that interface method to match lambda
 * StringLengthLambda slength = (String s)->s.length();
 * Note : lambdas can be implemented on only functionalInterface
 * java people considered interface as declaration type instead new type like Functional or .. to support backward compatiability in jdk
 * libraries .example : Runnable interface 
 */
public class _2_TypeInference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringLengthLambda slength = (String s)->s.length(); // implementation of interfaace StringLengthLambda because based on type
		//it looks for interface to match method implementation
		int length = slength.getLength("Heelo world"); // it invokes above implementation based on reference
		System.out.println(length);
		
		//some other valid lambdas for above expression
		StringLengthLambda s2 = s->s.length(); //if single parameter passing,then we can skip ()
		System.out.println(s2.getLength("hello"));
		
		printLambda(slength); //passing as parameter as usual of object
		
	}

	static void printLambda(StringLengthLambda s) {
		System.out.println(s.getLength("hello"));
	}
}


interface StringLengthLambda{
	
	int getLength(String s);
	
}