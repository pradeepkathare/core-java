package com.java.v8.brains.lambdas;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

/*
 * In previous example,we saw printmethod  was printing elements that matches condition.
 * But what if, each lambda expression wants to perform its own actions based on there conditions matched
 * To solve this, java 8 introduced interface called Consumer<t> with method accept
 * so now there implementation,can pass one more parameter for actions and calling accept method will perform actions
 */
public class _8_WithConsumerInterface {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		list.add("a");
		list.add("ab");
		list.add("ac");
		
		//lambda for predicate i,e has test method,matches one parameter
		Predicate<String> predicate = (s)->{
			
			return s.contains("c");
		};
		
		//return type as boolean in predicate
		Predicate<String> predicate1 = (s)->{
			return true;
		};
		
		//return type is void 
		Consumer<String> consumer = (String s)->{
		
			System.out.println("s="+s);
		};
		
		performaction(list, predicate1, consumer);
	}

	
	//predicate has test method with boolean as return type and consumer has accept method which calls implementation
	//consumer interface doesn't return anything
	
	public static void performaction(List<String> list,Predicate<String> predicate,Consumer<String> consumer){
		for(String s:list) {
			
			if(predicate.test(s)) {
				consumer.accept(s);
			}
		}
		
	}
	
}

/*
 * some advantage of java 8 internl interfaces are :
 * 1 : as per requirement we can directly use inbuilt interface instead of creating our own and reduce code
 * 2 : we can interdace take one parameter,multiple(predicate) and no return type(consumer) and return types 
 */
