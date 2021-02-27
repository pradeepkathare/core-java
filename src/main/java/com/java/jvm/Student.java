package com.java.jvm;

public class Student implements Comparable<Student>{
	
	String name="";
	int id=10;
	
	public Student(int id) {
	  this.id=id;
	}
	public String getName() {
		return name;
	}
	public int getId() {
		return id;
	}
	
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		
		return this.id-o.id;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return ""+this.id;
	}
}


