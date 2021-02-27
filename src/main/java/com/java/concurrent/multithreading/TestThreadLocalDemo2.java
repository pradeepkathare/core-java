package com.java.concurrent.multithreading;

/*
 * Pradeep.kathare
 * This program expalins overriding of inital method
 */

public class TestThreadLocalDemo2 {

	String name;
	public TestThreadLocalDemo2(String name) {
		this.name = name;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ThreadLocal<Object> tl  = new ThreadLocal<Object>(){
			//comment inital value then u will get default value as null
			public Object initialValue(){
				return "abcdef";
			}
		};
		System.out.println("insted of null it retrns overrided value :"+tl.get());
		tl.set("pradeep");
		System.out.println("insted of acdef it retrns set value :"+tl.get());

	}

}
