package com.java.v8.brains.lambdas;

import java.util.function.BiConsumer;

/*
 * In this we will see,what if we get exception while executing lambdas
 * 1 : direct approach is,try catch method within lambda but this approach maakes lambda more line codes
 * 2 : in direct approach: create wrapper lambda and handle in generic way for all lambdas expression
 * sample : perform arithmetic operation divide by 0 option
 */
public class _9_ExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int key = 0;
		int [] array= {1,2,3,4,5};
		
		//each time accept is called,lambda will be executed
		//better approach is always keep lambda as simple as possible
		BiConsumer<Integer, Integer> biconsumer = (key1,value)->{
			try {
				System.out.println("within biconsumer Divide logic="+(value/key1));
			}catch(ArithmeticException ex){
				System.out.println("Exception in lambda");
			}
			
			
		};
		performArtihmeticAction(key,array,biconsumer);
	}

	//wt if exeption thrown in this method?is it better to handle here or in called method
	//Better approach is through called method.since this method is generic it might throw multiple exceptions nd handling all will 
	//be cumbersome . called met
	private static void performArtihmeticAction(int key, int[] array, BiConsumer<Integer, Integer> biconsumer) {
		System.out.println("performArtihmeticAction");
		for (int value : array) {
			biconsumer.accept(key, value);
		}

	}

}
