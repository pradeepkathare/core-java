package com.java.v8.brains.lambdas;

/*
 * FunctionalInterface : Interface which has only one abstract method
 */
public class _4_FunctionalInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FunctionalInterfaceExample f1 = ()->System.out.println("lambda display method");
	}

}

//annotation @FunctionalInterface is optional but adding it has adding,i,e it shows interface is functional so 
//dont allow to add additional method
//when u uncomment display2 method it shows complile time error in interface itself
//when u comment annotation and uncomment display2,compile time error will be shown only in classes that write/implements lambdas.
//so good praticse is to maintain annotation to knew compile time issue at interface level to convey our usage


@FunctionalInterface
interface FunctionalInterfaceExample{
	
	void display();
	//void display2(); 
	
}