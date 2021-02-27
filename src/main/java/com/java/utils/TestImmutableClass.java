package com.java.utils;

/*
 * String class is immutable so how to make custom immutable class.
 * 
 * Class is said to be Immutable  : A class whose state does not change once its initialized.
 * 
 * if it follows below condition :
 * 
 * 1 : Don't generate setter methods in class.
 * 2 : Make all fields as final so that they can be initialized only once.
 * 3 : Make class as final so that it won't be extended/Subclass
 * 4 : Make all fields as private to avoid direct access.
 * 5 : Create constructor that returns copy of object instead actual object
 * 6 :Perform cloning of objects in the getter methods to return a copy rather than returning the actual object reference  
 * 
 * 
 * Example of custom Immutable class :
 * 
 */


class Student implements Cloneable{
	
	int age;
	public Student() {
		
	//	this.age = age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getAge() {
		return age;
	}
}


public final class TestImmutableClass implements Cloneable {

	private final int id;
	private final String name;
	private final Student  student;

	public TestImmutableClass(int id, String name,Student s1) {

		/*
		 * I created new object and always set its value and sent its value differently
		 */
		Student s2 = new Student();
		s2.setAge(s1.getAge());;
		
		this.id = id;
		this.name = name;
		this.student = s2; //ALERT : IT is object
		
	}

	public int getId() {
		return id;

	}

	public String getName() {
		return name;
	}
	
	/*
	 * It will return Student Object not value
	 */
	public Student getStudent() {
		return  student;
	}
	
	
	
	public static void main(String[] args) {
		
		System.out.println("within main method : ");
		Student s1 = new Student(); 
		s1.setAge(100);
		
		/*
		 * I am passing s1 object to TestImmutable which means we should not be able to change 
		 * s1 object because it is final but see magic happens
		 */
		
		TestImmutableClass t1 = new TestImmutableClass(10, "kathare",s1);
		
		System.out.println("check values : "+t1.getName());
		
		//t1.name = "pradeep.kathare"; it says compiler error because field is final
		
		System.out.println("Before changing student Value : "+s1.getAge());
		
		System.out.println("Bfore modifying s1 object : "+t1.getStudent().getAge());
		
		//changing value of s1 and it breaks immutablity of TestImmutable class
		//Because s1 and student object reference always point to same object
		
		
		s1.setAge(30);
		System.out.println("Student Object of TestImmutable class also gets  modified :  "+t1.getStudent().getAge());
		
		//To overcome this we have to always provide clone object instead of actual object
		
	}
	
	
	
	
	
	
	
	

	
	
	
	
}
