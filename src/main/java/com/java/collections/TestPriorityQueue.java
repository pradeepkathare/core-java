package com.java.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

/*
 * priorque : To add elements in prioirityQ it should be comparable 
 * String and other wrapper classes are comparable by default but 
 * user defined class should implement comaparable
 */

public class TestPriorityQueue {

	public static void main(String[] args) {
		
		PriorityQueue<Object> pq = new PriorityQueue<>();
		Employee e1 = new Employee(1, "pradeep");
		
		System.out.println("adding priortityy q");
		pq.add(e1);
		pq.add(e1); //it throws class cast exception in priorq so we have to override the comparable in userdefined class
		
		System.out.println(pq);
	
	}
}

class Employee implements Comparable<Object>{
	
	int id;
	String name;
	
	public Employee(int id,String name) {
		// TODO Auto-generated constructor stub
		this.id = id;
		this.name = name;
	}
	
	

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}


/*
 * To add elements/objects in prioirty or treeset or to call collections.sort method  we have to specify compareto method for userdefined 
 * class/objects
 */
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		if(this.id>id) {
			return 1;
		}
		return 0;
	}
	
	
}