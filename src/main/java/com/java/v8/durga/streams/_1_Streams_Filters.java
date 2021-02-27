package com.java.v8.durga.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/*
 * Streams : Streams are used to process collections objects
 */
public class _1_Streams_Filters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> list = new ArrayList<>();
		list.add(0);
		list.add(5);
		list.add(10);
		list.add(15);
		list.add(20);
		filterUsage(list);
	}

	/*
	 * If we want to execute some condition on list ,
	 * and get new list that matches condition then use filter and collect methods of streams
	 */
	private static void filterUsage(List<Integer> list) {
		System.out.println("usage of java8 filter");
		
		filterWithoutJava8(list);
		filterWithJava8(list);
	}

	//without java8 : Iterate each element and  filter based on  condition ,if it matches thhen add to new list as shown below
	//condition : get even numbers from list
	private static void filterWithoutJava8(List<Integer> list) {
		System.out.println("filter Without Java8");
		List<Integer> filteredList = new ArrayList<>();
		
		for(Integer i : list) {
			
			if(i%2==0) {
				filteredList.add(i);
			}
		}
		
		System.out.println(" till java 8 filterList ="+filteredList);
	}
	
	//In java 8 : to process collection,convert to stream and use methods of streams
	//Condition : get even numbers from list
	//here,use filter on condition,and collect method to get new list
	private static void filterWithJava8(List<Integer> list) {
		System.out.println("filter With Java8");
		
		//filter method : it accepts predicate functional interface,so i am passing implementation directly,
		//but if u have predefind predicate then u can use same.
		//CollectMethod : Collectors.toList(),if condition matched then we are collecting them by adding to list
		//Collectors.toList() : it gives new list and dont touch primiary/orginal list 
		
		List<Integer> filterdList = list.stream().filter((i)->{
			return (i%2==0);
		}).collect(Collectors.toList());
		
		System.out.println(" java 8 filterdList = "+filterdList);
	}

}
