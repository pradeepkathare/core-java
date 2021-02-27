package com.java.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/*
 * Sort hash map by keys
 * String as key
 * int as key
 * object as key
 */
public class SortHashMapByKeys {

	public static void main(String[] args) {
		
		HashMap<String, String> hmapasstring = new HashMap<>();
		
		hmapasstring.put("manju", "d");
		hmapasstring.put("anju", "b");
		hmapasstring.put("nju", "c");
		
		System.out.println("before sorting keys="+hmapasstring.toString());
		//sort key as string
		TreeMap<String, String> sortedByKeyAsString = new TreeMap<>(hmapasstring);
		
		//sortedByKeyAsString.putAll(hmapasstring);
		for(Map.Entry<String, String> entry:sortedByKeyAsString.entrySet()) {
			System.out.println("key="+entry.getKey()+"value="+entry.getValue());
		}
		System.out.println("After sorting keys="+sortedByKeyAsString.toString());
		
	//====================================================
		//sort key for Integer
		
		HashMap<Integer, String> hmapasInt = new HashMap<>();
		
		hmapasInt.put(10, "d");
		hmapasInt.put(2, "b");
		hmapasInt.put(0, "c");
		
		System.out.println("before sorting keys="+hmapasInt.toString());
		//sort key as string
		TreeMap<Integer, String> sortedByKeyAsInt = new TreeMap<>(hmapasInt);
		
		System.out.println("after sorting keys as integer="+sortedByKeyAsInt);
	//==========================================
		
		//sort by key for custom objects==>custom object class need to overrride compareTo Method by putting in treemap
		
		HashMap<Student , String> hashmapCustomObject = new HashMap<>();
		
		Student s1 = new Student(1, "manju");
		Student s2 = new Student(10, "anju");
		Student s3 = new Student(3, "nju");
		Student s4 = new Student(4, "ju");
		Student s5 = new Student(5, "u");
		
		hashmapCustomObject.put(s1, "d");
		hashmapCustomObject.put(s2, "b");
		hashmapCustomObject.put(s3, "c");
		
		System.out.println("keys before sorting"+hashmapCustomObject.toString());
		
		//using comparator 
		//below can be achieved by comparable as well
		TreeMap<Student, String> sortedByKeyAsCustomObject = new TreeMap(new StudentComparatorByID());
		sortedByKeyAsCustomObject.putAll(hashmapCustomObject);
		System.out.println("after sorting keys as integer="+sortedByKeyAsCustomObject);
		
	}
}
