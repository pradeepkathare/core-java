package com.java.utils;

/*
 * Dscrib how to usee clone mthod in java
 */
public class TestClone implements Cloneable {

	int age;
	int rollNo;
	public TestClone() {
		// TODO Auto-generated constructor stub
	}
	
	TestClone(int age,int rollno){
		this.age = age;
		this.rollNo = rollno;
	}
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TestClone t1 = new TestClone(25, 45);
		TestClone t2 = null;
		try {
			 t2 = (TestClone) t1.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("after cloning : "+t1.hashCode() +" t2.hash : "+t2.hashCode());
		t1.setAge(33);
		System.out.println("t1.age : "+t1.getAge() +"t2.ag : "+t2.getAge());
	}

}
