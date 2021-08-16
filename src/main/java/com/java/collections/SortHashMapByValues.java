package com.java.collections;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/*
 * sort hashmap by values for integer
 * sort hashmap by values for String
 * sort hashmap by values for customObjects
 */
public class SortHashMapByValues {

	
	public static void main(String[] args) {
		
		
		
		
		
		//sort by value can be achieved by using comparator
		
		//sortbyValueforIntegers();
		//sortByValueForString();
		sortByValueCustomObject();
	}

	/*
	 * 1 : convert hashmap to LinkedList
	 * 2 : use collections.sort to sort linked list
	 * 3 : put back sortedLinked list to linkedhashmap because it maintains insertion order.hashmap dont maintain instertion order
	 */
	static void sortbyValueforIntegers() {
		HashMap<String, Integer> hmap = new HashMap<>();
		hmap.put("a", 5);
		hmap.put("sd", 1);
		hmap.put("sd1", 8);
		LinkedList<Map.Entry<String, Integer>> linkedlistOfEntrySet = new LinkedList<>(hmap.entrySet());

		System.out.println("before sorting=" + linkedlistOfEntrySet);
		Collections.sort(linkedlistOfEntrySet, (e1, e2) -> {

			return e1.getValue().compareTo(e2.getValue());

		});
		System.out.println("after sorting=" + linkedlistOfEntrySet);

		
		// step 3 :
		Map<String, Integer> linkedhashmap = new LinkedHashMap<>();

		for (Entry<String, Integer> entry : linkedlistOfEntrySet) {
			linkedhashmap.put(entry.getKey(), entry.getValue());
		}

		System.out.println("linkedhashmap = " + linkedhashmap);
	}
	
	static void sortByValueForString() {
		HashMap<String, String> hmap = new HashMap<>();
		hmap.put("a", "za");
		hmap.put("sd", "abc");
		hmap.put("sd1", "ccde");

		LinkedList<Map.Entry<String, String>> linkedList = new LinkedList<>(hmap.entrySet());
		Collections.sort(linkedList,(e1,e2)->{
			return e1.getValue().compareTo(e2.getValue());
		});
		LinkedHashMap<String, String> linkedhashmap = new LinkedHashMap<>();
		for(Entry<String,String> entry:linkedList) {
			linkedhashmap.put(entry.getKey(), entry.getValue());
		}
		
		System.out.println("After sorting by value for string="+linkedhashmap);
	}
	
	//custom
	static void sortByValueCustomObject() {
		
		HashMap<String,Student> map = new HashMap<>();
		Student s1 = new Student(1, "Apradeep");
		Student s2 = new Student(3, "pradeepK");
		Student s3 = new Student(2, "bpradeep");
		map.put("a", s1);
		map.put("b", s2);
		map.put("c", s3);
		
		//linked-list of entryset
		
		LinkedList<Map.Entry<String,Student>> listOfEntry = new LinkedList<>(map.entrySet());
		
		Comparator<Map.Entry<String, Student>> c = new Comparator<Map.Entry<String, Student>>() {

			@Override
			public int compare(Map.Entry<String, Student> e1, Map.Entry<String, Student> e2) {
				
				return e1.getValue().getName().compareToIgnoreCase(e2.getValue().getName());
			}
		};
		
		Collections.sort(listOfEntry, (Entry<String,Student> e1, Entry<String,Student> e2)->{
			return e1.getValue().getName().compareTo(e2.getValue().getName());
		});
		
		//step 3 : LinkedHashMap
		LinkedHashMap<String, Student> sortedLinkedHashMap = new LinkedHashMap<>();
		for(Entry<String,Student> entry:listOfEntry) {
			sortedLinkedHashMap.put(entry.getKey(), entry.getValue());
		}
		System.out.println("After sorting by value for string="+sortedLinkedHashMap);
		
	}
	
	
	
}

