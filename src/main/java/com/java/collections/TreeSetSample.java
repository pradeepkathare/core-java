package com.java.collections;

import java.util.TreeSet;

public class TreeSetSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeSet<String> treeset = new TreeSet<String>();
		
		treeset.add("abc");
		treeset.add("aaa");
		
		System.out.println("TreeSet String values sorted="+treeset);
		
		// in angular brackets u cannot pass primitives datatype like int,long and etc
		TreeSet<Integer> t2 = new TreeSet<Integer>();
		t2.add(10);
		t2.add(2);
		System.out.println("Sorted integer="+t2);
		
		Student s1 = new Student(20);
		System.out.println("s1 values="+s1.getId());
		
		Student s2 = new Student(10);
		System.out.println("s2 values="+s1.getId());

		TreeSet<Student> t3 = new TreeSet<Student>();
		t3.add(s1);
		t3.add(s2);
		
		//check importance of comparable method and toString method
		System.out.println("t3 student object sorted="+t3);
		
	}

}
