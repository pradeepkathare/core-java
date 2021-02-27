package com.java.utils;

import java.util.HashMap;

/*
 * Why to override hashcode and equals method
 */
public class TestHashEqualsV2 {

	String name;
	int id;
	
	public TestHashEqualsV2(String name ,int id) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.id = id;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Testing HashCode and Equals");
		//
		TestHashEqualsV2 test1 = new TestHashEqualsV2("pradeep",24);
		TestHashEqualsV2 test2 = new TestHashEqualsV2("pradeep",24);
		
		/*
		 * i have 2 objects of same value so 
		 * i will take key as object and value some value then
		 *  try to fetch from test2 it will give null without overriding hash code
		 *  because it will put two objects in 2 different buckets even if its same
		 */
		HashMap hm = new HashMap<>();
		hm.put(test1, "rtry to fetch value from test2");
		
		System.out.println("Null value without hashcode override : "+hm.get(test2));
		System.out.println("hashcode of test 1 : "+test1.hashCode());
		System.out.println("hashcode of test2 : "+test2.hashCode());
		
	}
	/*
	 * (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		int result = 17;
		result = 31*result+this.id;
		return result ;
				//super.hashCode();
	}
	
	/*
	 * override equals method 
	 * If i override only hashcode without equals then 2 objects hashcode will remain same 
	 * But when you fetch values from  different object then it will print nul while fetching objects 
	 * Too differenciate just comment equals method and check output   
	 */
public boolean equals(Object o){
		
		boolean flag = false;
		
		if(o instanceof TestHashEqualsV2){
			System.out.println("in Equals method");
			TestHashEqualsV2 test = (TestHashEqualsV2)o;
			test.name.equals(this.name);
			flag = true;
		}
		
		return flag;
	}

}
