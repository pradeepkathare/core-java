package com.java.muktha_ref;
/*
 * This class give example of this,super,final
 * this() and super() constructors
 */
public class KeywordsThisExample {

	public static void main(String[] args) {

		// understand problem without this
		// then usage of this keyword

		D d = new D(10);
		d.display();

		// usage of thi
		D d1 = new D(10, 20);
		d1.display();

		// solve without this
		D d2 = new D("java");
		d2.display();

		//this() method usage
		
		
	}

	
}

class D{
	int a;
	int b;
	String studentaddress;
	
	//problm without this
	public D(int a) {
		a=a;	
	}
	
	//solve with this
	public D(int a,int b) {

		this.a=a;
		this.b=b;
	}
	
	//solve without this by using different name in method 
	public D(String address) {
		studentaddress=address;
	}
	
	public D() {
		this("from no-arg constructor");	
	} 
	
	 void display() {
		 
		 //understand concating string in sop
		System.out.println("value of a="+a); 
		System.out.println("value of b="+b); 
		System.out.println("value of studentAddress="+studentaddress);
		System.out.println();
	}
}

 //uncomment and check problem
class DD extends D{
	

	int counter;
	
	//Attention : when parent class doesnt have no-arg constructors then it is neccessary to add create constructor in child class and call super in it
	//remove constructor and ccheck
	public DD() {
		//super();
		//this();
		this(0);
		System.out.println("no-arg constructor");
	}
	
	private DD(int counter) {
		//remove super and check
		super(0);
		//super();
		this.counter=counter;
		System.out.println("no-arg constructor");
	}
	
}
 






