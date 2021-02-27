package com.java.utils;

public class TestEqualsHashCode {

	String name;
	int id;
	
	TestEqualsHashCode(String name,int id){
		this.name = name;
		this.id = id;
	}
	
	/*
	 * override equals method in pojo class 
	 * if i did not override equals then testhash1.equals(testhash2)  return false 
	 */
	
	public boolean equals(Object o){
		
		boolean flag = false;
		
		if(o instanceof TestEqualsHashCode){
			
			TestEqualsHashCode test = (TestEqualsHashCode)o;
			test.name.equals(this.name);
			flag = true;
		}
		
		return flag;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestEqualsHashCode testhash1 = new TestEqualsHashCode("pradeep",24);
		TestEqualsHashCode testhash2 = new TestEqualsHashCode("pradeep",24);
		
		System.out.println("testhash1 eqals testhash2 : "+testhash1.equals(testhash2));
	}

}
