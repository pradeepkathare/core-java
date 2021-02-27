package com.java.jvm;

public class FinalizeDemo {

	public static void main(String[] args) {

		String s1="abcd";
		s1=null;
		System.gc();
		System.out.println("end");
		
	}

	public void finalize() {
		System.out.println("gc of FinalizeDemo");
	}
	
}
