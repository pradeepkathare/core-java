package com.java.v8.brains.lambdas;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class _5_LambdaExercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//creating list of objects
		
		List<Person> persons = Arrays.asList(
				new Person(1, "chetan", "cadad"),
				new Person(2, "pradeep", "kathare"),
				new Person(3, "pavan", "attalekh"),
				new Person(4, "Deepa", "pathange")
				);
		
		//Exercise :
		//1 : sort list by lastName
		//2 : print all people ,whose lastname   begins with c
		//3 : create a method that prints all elements in the list
		
		//sort by lastName using java7 anonymous
		Collections.sort(persons,new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {
				// TODO Auto-generated method stub
				
				return o1.getLastName().compareToIgnoreCase(o2.lastName);
			}
			
		});
		
		
		//print persons
		printList(persons);
		checkWithC(persons);
		
		
		//we can use lambdas on comparator since it is also functionalInterface
		//list sort method accepts comparator only,so used functional interface 
		//since java 8 sort method is provided in list interface
		persons.sort((Person p1,Person p2)->p1.getFirstName().compareToIgnoreCase(p2.getFirstName()));
		//sorted by firstName
		printList(persons);
		checkWithCUsingJava8(persons);
		
	}

	static void printList(List<Person> list) {
		System.out.println("printList");
		System.out.println(list);
	}
	
	//step 3
	static void checkWithC(List<Person> persons) {
		System.out.println("checkWithC");
		for(Person p:persons) {
			if(p.getLastName().startsWith("c")) {
				System.out.println(p);
			}
			
		}
	}
	
	//forEach was implementd on java8,since we knew we are iterating on persons list we can avoid like for loop
	static void checkWithCUsingJava8(List<Person> persons) {
		
		persons.forEach(person->person.getFirstName().startsWith("c"));
		
	}
}



class Person {
	
	int id;
	String firstName;
	String lastName;
	
	public Person() {
		// TODO Auto-generated constructor stub
	} 	
	Person(int id,String firstName,String lastName){
		this.id=id;
		this.firstName=firstName;
		this.lastName=lastName;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + "]";
	}
	
	
	
}