package com.java.jvm;

//2 classes ,
//1 : one class has main method
//other class has static variable ,method and instance variable and method
//Question : how to call from 1 class to other class


public class Sample1{
	
	public static void main(String[] args) {
		//call static variable
		//call instance variable
		//call instance method
		//call static method
	}
}

class Sample2{
	//declare static variable ,method nd instance variable and method
	int b=20;
	static int c=30;
	
	void display() {
		int a =20; //local variable
		
	}
	
	
	
	static void show() {
		int a =30;//it will not allow to access ,because a was declared in display method
		
	}
	
	
	
}


