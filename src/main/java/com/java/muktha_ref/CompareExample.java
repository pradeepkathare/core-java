package com.java.muktha_ref;

/*
 * Pradeep.k
 * 
 */
public class CompareExample {

	public static void main(String[] args) {

		String s1 = "pradeep";
		String s2 = "pradeep";

		System.out.println("==========compare string with other string created======");
		// expect the output
		System.out.println("s1==s2:" + (s1 == s2)); // == compares references
		System.out.println("s1.equals(s2):" + s1.equals(s2)); // equals compares values but case sensitive
		System.out.println("s1.equalsIgnoreCase(s2):" + s1.equalsIgnoreCase(s2));
		System.out.println("s1.compareTo(s2):" + s1.compareTo(s2)); // compares ascii returns 0 for same and difference
																	// between ascii/unicode
		System.out.println("==========END======");
		System.out.println();

		String s3 = "java";
		String s4 = new String("java");

		System.out.println("==========compare string with other string created by new object see difference======");
		System.out.println("s3==s4:" + (s3 == s4));
		System.out.println("s3.equals(s4):" + s3.equals(s4));
		System.out.println("s3.equalsIgnoreCase(s4):" + s3.equalsIgnoreCase(s4));
		System.out.println("s3.compareTo(s4):" + s3.compareTo(s4));
		System.out.println("==========END String======");
		System.out.println();

		String s5 = new String("java");
		String s6 = new String("java");

		System.out.println("==========compare String for 2 different new object======");
		System.out.println("s3==s4:" + (s3 == s4));
		System.out.println("s3.equals(s4):" + s3.equals(s4));
		System.out.println();

		// custom object
		Student student1 = new Student(10, "meghana");
		Student student2 = new Student(10, "meghana");
		Student student3 = student1;
		System.out.println("see difference equals method returns false even value is same ");
		System.out.println("By default, equals method compare references like student1==student2");
		System.out.println("equals method is been overriden in string class so true was returned if value was equal");

		System.out.println("student1==student2:" + (student1 == student2));
		System.out.println("student1.equals(student2):" + student1.equals(student2));

		// check will compareto works
		System.out.println();

		// Uncomment ovrrided equals method and hascode in Student
		// study below links
		// reference : https://www.geeksforgeeks.org/equals-hashcode-methods-java/
		// https://www.infoworld.com/article/3305792/comparing-java-objects-with-equals-and-hashcode.html

	}

}

// eclipse generate setters and getters ,right click select source then generate
// getter and setter
class Student {

	String name;
	int age;

	public Student(int age) {
		this.age = age;

	}

	// remove this and check what is output and behaviour
	public Student(int age, String name) {
		this.age = age;
		this.name = name;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	// Every class is subclass of Object
	@Override
	public boolean equals(Object obj) {

		// here this is current object which is calling equals method
		// example :student1.equals(student2) :student1 becomes this and student2 is
		// Object passed->case 2
		// student1.equals(student1)->case1
		if (this == obj) {
			return true;
		}

		if (obj == null || obj.getClass() != this.getClass()) {
			return false;
		}

		// type cast Object to Student
		Student student = (Student) obj;

		if (student.getName().equalsIgnoreCase(this.getName()) && this.getAge() == student.getAge()) {
			return true;
		}

		return false;
	}

}