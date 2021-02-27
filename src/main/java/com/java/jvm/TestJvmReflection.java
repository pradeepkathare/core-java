package com.java.jvm;

import java.lang.reflect.Method;

public class TestJvmReflection {

	
	public TestJvmReflection() {
		super();
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub
		int count=0;
		//important specify package names
		Class c=Class.forName("jvm.core_java.Employee"); //throws ClassNotFoundException
		Method[] methods=c.getDeclaredMethods();
		//displaying method names and count of number of methods
		for(Method method:methods) {
			count++;
			System.out.println("methodName="+method.getName());
		}
		System.out.println("total Methods in Class:"+count);
		Employee e1= new Employee();
		Employee e2 = new Employee();
		Class c1=e1.getClass(); //reflection object
		Class c2 =e1.getClass();
		System.out.println("c1=Hashcode="+c1.hashCode());//same hashcode
		System.out.println("c1=Hashcode="+c2.hashCode()); //same hashcode
		System.out.println(c1==c2); //returns true
	}

}

class Employee{
	int id;
	String name;
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	
	 
}