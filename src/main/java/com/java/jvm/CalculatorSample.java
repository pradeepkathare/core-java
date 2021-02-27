package com.java.jvm;

public class CalculatorSample {

	//inside class and outside methods

	 int a=50;//instance variable non static 
	 int b=30;//instance variable
	 static int c=30;//instance variable static
	
	public static void main(String[] args) {
		//access instance variables through object in static method within class;
		
		//rule 1 :  either instance variables should be static	
		//rule 2 : or can access through object
		System.out.println(c); //method is static and variable is static so used directly
		
		CalculatorSample cal = new CalculatorSample();//cons
	
		int res= cal.a+cal.b; //method is static and variable is non static so used through object cannot do directly
		System.out.println(res);
		System.out.println(cal.a+cal.b);
		
		//cal.display();
		cal.getPhoneNumber();
		sendOtp();
	}
	
	public  void getPhoneNumber() {
		//method is not static so use directly without object within same class
		//rule 1 : through object;
		//rule 2 : directly;
		System.out.println("within display");
		int res = a+b+c;
		//50 lines of code
		
	}
	
	public static void sendOtp() {
		System.out.println("show method");
		//100 of lines logic
	}
	/*
	 * The calling method is the method that contains the actual call. 
	 * The called method is the method being called. They are different. 
	 * They are also called the Caller and the Callee methods.
	 */
	//If we are calling method in main method(say main method is static) 2 rules,
	//rule 1 : if calling method static nd called method is static 
		//->calling method can invoke called method directly without object
	//rule 2 : if calling method is static and called method is non static
			//-> calling method can call called method only through object

}


class Calculator{
	
	
	void add() {
		
		
	}
	
	void sub() {
		
	}
	
	void multiply() {
		
	}
	
	void division() {
		
	}
}