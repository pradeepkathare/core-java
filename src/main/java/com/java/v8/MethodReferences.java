package com.java.v8;

/*
 * https://javarevisited.blogspot.com/2017/08/how-to-convert-lambda-expression-to-method-reference-in-java8-example.html
 * MethodReference : Method reference is used to refer method of functional interface.
 * 1 : staticReference : say we have interface and class with method ,instead of implementing method again we can refer it to some existing
 */
public class MethodReferences {

	public MethodReferences(){
		//System.out.println("no-arg constructor");
	}
	public MethodReferences(String message) {
		System.out.println("arg-constructor");
	}

	public static void main(String[] args) {

		// In this example : we are referring method StaticMethodReferenceExample to ref

		// static method reference
		Functional f1 = MethodReferences::StaticMethodReferenceExample;
		f1.add();

		// non static or instance methodReference(it will print instanceMethodReference)
		MethodReferences methodReferences = new MethodReferences();
		Functional f2 = methodReferences::instanceMethodReferenceExample;
		f2.add();

		//constructor MethodReference
		Functional f3 = MethodReference();s::new;
		f3.add();

	}

	public static void StaticMethodReferenceExample() {

		System.out.println("StaticMethodReferenceExample");
	}

	public void instanceMethodReferenceExample() {
		System.out.println("instanceMethodReferenceExample");
	}
}

@FunctionalInterface
interface Functional {

	public void add
}