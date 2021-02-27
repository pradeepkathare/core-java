package com.java.v8.brains.lambdas;
/*
 * Example says about this keyword in java
 * this : refers to current object reference
 * this : it cannot be used in static methods
 * this can be used in annonymus class type ,but it will refer to current object that been created using new operator for annonymus
 * this behaves bit differnt in lambdas.since there is no new operator used it points to object that calls lambda
 * this can be directly called in instance method
 */
public class _11_ThisReferenceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Processing p = new Processing() {
			
			@Override
			public void process() {
				System.out.println(this); // this is  refering to new Processing object so it is calling internal tostring method 
				System.out.println("annonynmous class type");
				
			}
			
			@Override
			public String toString() {
				return "this is annonynmous class object";
				
			}
		};
		
		//doProcess(p);
		new _11_ThisReferenceExample().proccessing(p);
	}

	private static void doProcess(Processing p) {
		System.out.println("doprocess method");
		//System.out.println(this); //cannot use this in static method
		p.process();
	}
	
	private void proccessing(Processing p) {
		System.out.println(this); // it will refer to calling object i,e here new _11_ThisReferenceExample()
		p.process();
	}

	@Override
	public String toString() {
		return "_11_ThisReferenceExample reference";
	}
}
