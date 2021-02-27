package com.java.v8.brains.lambdas;
/*
 * Suppose say if we  have multiple implementation details and in run time we decide which implementation to be called ,then 
 * we use interface at coding
 */

/*
 * if we obseve,below we are passing Thing that has Behaviour,i,e we are doing some additional work
 */
public class Prerequiste_WithJava7InterfaceAtCoding {

	//This method is not aware of implementation Object passed,since it is accepting  interface aas parameter and calling interface
	//methods
	void performAction(Animal animal) {
		animal.eat();
	}
	
	public static void main(String[] args) {
		Prerequiste_WithJava7InterfaceAtCoding obj1 = new Prerequiste_WithJava7InterfaceAtCoding();
		
		Dog d1 = new Dog();
		
		obj1.performAction(d1); //without lambda
		
		Animal animalDogWithoutLambda = new Dog(); //without lambda
		
		// lambda expression can be used  only on Functional interface
		Animal animalDogWithLambda = ()->System.out.println("using lambda to match eat method of Animal interface");
		 
		//Observe,animal is interface,but still it allows us to create object usually interface objects creation are 
		Animal animalDogWithInnerclass = new Animal() {
			
			@Override
			public void eat() {
				System.out.println("eat method using innerClass");
			}
		};
		
		
		animalDogWithoutLambda.eat(); //without lambda //1 
		animalDogWithLambda.eat();//2
		animalDogWithInnerclass.eat();//3
		
		/*
		 *  all above did same,type is interface and calling method on it using instance
		 *  
		 *  
		 *  
		 *  Difference with lambda expression and Interface implementation is,we dont have to create seperate class Dog and implement interface Animal and then override
		 *  eat() method.we achived same just using lambdas 
		 *  
		 *  Difference between with innerclass/anonymous is more short cut in innerclass but with more differnce,discussed in next tutorial
		 */
	}
}




interface Animal{
	
	void eat();
}


class Dog implements Animal{
	
	@Override// uncomment and check,it gives compile time error in jre 1.5: override should be used on superclasses not on interface
	 public void eat() {
		System.out.println("eat method in Dog ");
	}
}


class Cat implements Animal{

	public void eat() {
		System.out.println("eat method in Cat");
		
	}
	
	
}