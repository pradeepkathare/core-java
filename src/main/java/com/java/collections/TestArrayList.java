package com.java.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/*
 * TestCollection expalins  how to use List Interface and ArrayList methods in java
 * List maintains same order as array that same insrtion ordr
 * index position starts with 0
 * size starts from 1
 */
public class TestArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Object> list = new ArrayList<Object>();
		
		ArrayList<Object> list1 = new ArrayList<>();
		//add collctions
		list1.add("college");
		list1.add("MSEC");
		
		//add method
		list.add("pradeep.kathare");
		list.add(1,"kathare"); // It allows because indx 1 is equal to size and 2 is bigger than size so throws 
								//xcption comment this line for 
		list.add(2, "kathare1"); // It throws  indexoutof bondxcption
		list.addAll(list1);
		
		//list.add(index, element);
		
		//To string method is overridd in AbstractCollection
		System.out.println("list of values : "+list);
		
		
		//size from 1 
		System.out.println("size of list : "+list.size());
		
		//isEmpty returns boolean
		System.out.println("Chck whther list is Empty : "+list.isEmpty());
		
		//contains return boolean
		System.out.println("chek contains work is  "+list.contains("kathare"));
		
		//iterator
		Iterator<Object> it = list.iterator();
		System.out.println("Iterator usuage :");
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		//usuage  of Itrator remove method -->it will remove last elmnt from last
		it.remove();
		System.out.println("list : "+list);
		
		//list of remove method
		list.remove("kathare1");
		System.out.println("after removing :"+list);
		System.out.println();
		
		String a = (String) list.remove(1);
		System.out.println("rmoving from index postion 1 : "+a);
		System.out.println();
		
		//toArray returns Object array  
		System.out.println("list to array : "+list.toArray().toString());
		System.out.println("prinitng list of array using foreach ");
		
		//sys
		Object []obj = list.toArray();
		for(Object obj1 : obj) {
			System.out.println(obj1);
		}
		//ListIterator allows to traverse elements in both forwaard and backward directions 
		ListIterator<Object> listIterator = list.listIterator();
		
		System.out.println("list : "+list);
		
		/*
		 * traversing backward directions 
		 */
		
		while(listIterator.hasNext()) {
			System.out.println(listIterator.next());
		}
		/*
		 * traversing backward directions
		 */
		System.out.println("printing reverse ordr"+listIterator.hasPrevious());
		while(listIterator.hasPrevious()) {
			System.out.println(listIterator.previous());
		}
		
		/*
		 * usuage of set and get methods
		 */
		System.out.println();
		System.out.println("Usuage of get method :" +list.get(1));
		System.out.println("usuage of set method it return previously replaced value : "+list.set(1, "deepa"));
		
		/*
		 * returns boolean value xcept object as string
		 */
		System.out.println("use of quals method in java :"+list.equals(list));
		
		/*
		 * retainAll ->except only collections as parameter and removes othr elements except parameterized
		 */
		System.out.println("retain function  : "+list.retainAll(list1));
		list.add("kathare");
		list.add("Deepa");
		list.add("kathare");
		System.out.println(list);
		
		/*
		 * index of 
		 */
		System.out.println("indexOf rturn first time occureence in list: "+list.indexOf("kathare"));
		System.out.println("lastindexof : "+list.lastIndexOf("kathare"));
		
	}

}

