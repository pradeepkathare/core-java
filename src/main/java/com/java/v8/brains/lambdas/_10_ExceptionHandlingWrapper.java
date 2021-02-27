package com.java.v8.brains.lambdas;

import java.util.function.BiConsumer;

/*
 * In this approach,we are going to write separate wrapper method to handle exception
 * it should be generic way
 */
public class _10_ExceptionHandlingWrapper {

	public static void main(String[] args) {
		
		int key = 0;
		int [] array = {1,2,3,4,5};
		
		BiConsumer<Integer, Integer> biconsumer = (key1,value)->{
			
			System.out.println("divide operation = "+(value/key1));
		};

		//Important: method will call wrapperconsumer which will just return  one more lambda ,
		//wrapperconsumer lambda is calling accept method,which is responsible to execute divide operation
		performArthimeticOperation(key,array,wrapperConsumerForException(biconsumer));
	}


	//this method has consumer calling accept,it executes wrapperConsumerForException method lambda 
	//wrapperConsumerForException method internally calls divide operation lambda function
	//so handling exception in this method will not be write approach 
	private static void performArthimeticOperation(int key, int[] array, BiConsumer<Integer, Integer> biconsumer) {
		System.out.println("witin performArthimeticOperation");
		for(int value : array) {
			biconsumer.accept(key, value);
		}
	}

	//Important : understand importance of lambda communication
	//this wrraper that returns biconsumer as usual
	//this method just calls the implemenion of passed lambda and one who responsible to execute logic
	//so we can handle exception will be generic way....so we can handle all exceptions over here.
	//so who ever calls this lambdas will have small logic
	private static BiConsumer<Integer, Integer> wrapperConsumerForException(BiConsumer<Integer, Integer> biconsumer){
		System.out.println("within wrapperConsumerForException");
		return (k,v)->{
			try {
				System.out.println("k,v"+k+" "+v);
				biconsumer.accept(k, v);
			}catch(ArithmeticException ex) {
				System.out.println("ArithmeticException in wrapperConsumerForException for key nd value ="+k+" "+v);
			}
			
		};
		//return biconsumer;
	}
}
