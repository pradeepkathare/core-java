package com.java.v8;

import static org.junit.jupiter.api.DynamicTest.stream;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/*
 * Stream API :
 * 1 : It is used to process collections of objects
 * 2 : java.util.stream:This package consists of classes, interfaces and enum to allows functional-style operations on the elements
 * 
 */
public class StreamAPI {

	public static void main(String[] args) {

		List<Integer> listUnfiltered = new ArrayList<Integer>();
		
		listUnfiltered.add(100);
		listUnfiltered.add(1);
		listUnfiltered.add(1);
		listUnfiltered.add(100);
		listUnfiltered.add(400);
		listUnfiltered.add(200);
		listUnfiltered.add(300);
		
		
		
		System.out.println("listUnfiltered : "+listUnfiltered);
		//create list with filtering values greater than 200
		//Basic java7
		List<Integer> listfiltered = new ArrayList<Integer>();
		for(int a:listUnfiltered) {
			
			if(a>200) {
				listfiltered.add(a);
			}
		}
		System.out.println("listfiltered using java7 : "+listfiltered);
//=========using Streams============
				
		//streams sorted->sorts the collection
		System.out.println("sorted stream :"+listUnfiltered.stream().sorted().collect(Collectors.toList()));
		//Streams allMatch ->return true if  all values in list matches condition
		System.out.println("allMatch stream : "+listUnfiltered.stream().allMatch(p->p==1));
		//Streams anyMatch->retrun true if any 1 value matches in list
		System.out.println("anyMatch stream : "+listUnfiltered.stream().anyMatch(p->p==1));
		//Streams close->closes the streams but did not identified 
		listUnfiltered.stream().close();
		//Streams count->gives length(number of elements) of the collection
		System.out.println("count stream : "+listUnfiltered.stream().count());
		//Streams distinct->returns only distinct elements from the list
		System.out.println("distinct stream : "+listUnfiltered.stream().distinct().collect(Collectors.toList()));
		//Streams equals->did no understand what equality its checking
		System.out.println(listUnfiltered.stream().equals(listUnfiltered));
		//Streams filter
		listfiltered = listUnfiltered.stream().filter(p->p>200).collect(Collectors.toList());
		System.out.println("listfiltered using java 8: "+listfiltered);
		listUnfiltered.stream();
		//Streams findAny->return random optional from the collection
		System.out.println("findAny stream : "+listUnfiltered.stream().findAny().get());
		//Streams findFirst->return first element from the collection
		System.out.println("findFirst stream : "+listUnfiltered.stream().findFirst().get());

		/*
		 * flatMap is to make values flattening
		 * example u have listoflist then to iterate values u need 2 advance forloop or other methodlogy  
		 */
		//combinedList contains list as values
		List<List<Integer>> combinedList = new ArrayList<>();
		
		combinedList.add(listfiltered);
		combinedList.add(listUnfiltered);
		System.out.println("combined List :"+combinedList);
		System.out.println("combined array:"+combinedList.toArray());
		
		//for iterating values for some business logic we should iterate like below 
			for(List<Integer> l:combinedList) {
				for(Integer i:l) {					
					System.out.println(i);
				}			
			}
	   //By using Stream flatmap
		System.out.println(combinedList.stream().flatMap(list->list.stream()).collect(Collectors.toList()));
	
		//Stream
		List<String> list = Arrays.asList("1","2","3","4");
		//pre java8 to convert to string to int,double,float
		
		for(String a:list) {
			System.out.print(" "+Integer.parseInt(a));
		}
		System.out.println();
		//when u have streams then to parse the string to primitive type		
		list.stream().flatMapToDouble(l->DoubleStream.of(Double.parseDouble(l))).forEach(System.out::println);
		
		System.out.println("for each sample");
		//streams foreach and foreachordered is used to maintain the order in parallelstreams
		listUnfiltered.stream().forEach(System.out::print);
		
		//iterator similar to normal iterator
		//limit is used to iterate the values or limit the values of collection to given specifed maxsize
		Iterator itr = listUnfiltered.stream().limit(3).iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		//maps to each element in the stream so that u can apply logic
		//Returns a stream consisting of the results of applying the given function to the elements of this stream.
		Stream s = listUnfiltered.stream().map(l->l*2);
		s.collect(Collectors.toList());
		
		//System.out.println(s.collect(Collector<T, A, R>));
		
		//max will return the max value by taking comaparator as parameter
		System.out.println(listUnfiltered.stream().max(Comparator.naturalOrder()).get());
		
		//min return minimum value according to comparator
		System.out.println(listUnfiltered.stream().min(Comparator.naturalOrder()).get());
		
		
		//Boxed Stream:
		//In Java 8, if you want to convert stream of objects to collection, then you can use one of the static methods in the Collectors class.
		//But if u want to convert primitive to collections we should use boxed as below
		
		//It works perfect !!
		List<String> strings = Stream.of("how", "to", "do", "in", "java")
		                    .collect(Collectors.toList());
		System.out.println("works without boxed :"+strings);
		
		
		//Get the collection and later convert to stream to process elements
		List<Integer> ints = IntStream.of(1,2,3,4,5)
		                .boxed()
		                .collect(Collectors.toList());
		System.out.println("boxed stream : "+ints);
		         
		
	}

}
