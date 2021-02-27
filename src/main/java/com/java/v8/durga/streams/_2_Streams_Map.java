package com.java.v8.durga.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/*
 *  Java 8 streams map : this is used to process elements on each element on collection.
 *  i,e if u don't want to filter but to process each element and return all elements into new list then go to map
 *  map is normally,to map elements in list
 *   Example : if u want to process elements on list and multiple to 5 ,and to return new list 
 */
public class _2_Streams_Map {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> list = new ArrayList<>();
		list.add(0);
		list.add(5);
		list.add(10);
		list.add(15);
		list.add(20);
		mapInJava8(list);
	}

	private static void mapInJava8(List<Integer> list) {
		// TODO Auto-generated method stub
		mapWithoutJava8(list);
		mapWithJava8(list);
	}

	

	//without java8 for in loop and add to new list with processing element and return
	private static void mapWithoutJava8(List<Integer> list) {
		// TODO Auto-generated method stub
		System.out.println("map Without Java8");
		List<Integer> mappedList = new ArrayList<>();
		for(Integer i:list) {
			mappedList.add(i*2);
		}
		
		System.out.println("mapWithoutJava8 mappedList"+mappedList);
	}

	//map is method which accepts Function Interface implementation
	//Function Interface : It has method accept that takes one argument and returns value
	//i->i*2==> is equivalent to (i)->{return i*2}
	private static void mapWithJava8(List<Integer> list) {
		// TODO Auto-generated method stub
		System.out.println("map With Java8");
		//maps on each element and returns multipled value,this is collected to list
		List<Integer> mappedList = list.stream().map(i->i*2).collect(Collectors.toList());		
		System.out.println(mappedList);
	}
}
