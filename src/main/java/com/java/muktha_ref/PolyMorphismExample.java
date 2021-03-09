package com.java.muktha_ref;

public class PolyMorphismExample {

	public static void main(String[] args) {

		//as normal object creation
		// TODO:explain object creation and how compiler refers to method during compile time
		A a =new A();
		B b= new B();//it calls parent constructor first then  child
		
		a.add(); 
		b.add();
		
		a.sub();
		b.sub(); //sub is not there in b but still calls sub method of A (inheritance concept)
		
		A a1 = new A();
		A a2= new B(); //B is subclass and A is parent class so allows B object to refer A
		
		a1.add(); // calls A class add method
		a2.add(); // calls B class add method since object is B
		
		
		//Attention :polymorphism on fileds not applicable
		System.out.println("prints a value of class A a="+a1.a);//as expected because object is A
		System.out.println("value of A for a2 refernce a="+a2.a); //even though object is B,class A's method a value printed
		System.out.println("print value of a from B class refernce a="+b.a);
		
		//uncomment
		//a2.multiply(); //compile time error because,even though object is of B we cannot call multiply method(will explain u)
		
		//uncomment :A is parent Object so dont allow for reference in B(Its java rule)
		//B b=new A(); //compile time error 
		
		

		
	}

}


class A{

	int a=10;
	
	public A() {
		System.out.println("A constructor");
	}
	
	void add() {
		System.out.println("A class add method");
	}
	
	void sub() {
		System.out.println("A class sub method");
	}
}

class B extends A{
	int a=20;
	
	public B() {
		System.out.println("B constructor");
	}
	
	@Override
	void add() {
		System.out.println("B class add method");
	}
	
	void multiply() {
		System.out.println("B class multiply method");
	}
	
}