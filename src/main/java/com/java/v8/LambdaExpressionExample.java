package com.java.v8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class LambdaExpressionExample {

	// man
	public static void main(String[] args) {

//===========================Before lambdaExpression

		NonFunctionalInterface n = new NonFunctionalInterface() {

			@Override
			public void test(int a) {
				System.out.println("doing something int");

			}

			@Override
			public void test() {
				System.out.println("no paramter test");

			}
		};

		n.test();
		n.test(1);

//=========================END=============================================		

//========With Lambda no need to specify method names return type=============================================
		// Interface : LambadaExpression can be applied only for FunctionalInterfaces
		// not any other interfaces
		FunctionalInterfaceSampleWithoutParameter f1 = () -> {
			System.out.println("it is implmentation of no parameter method of FunctionalInterface ");
		};

		//within parenthesis and without are same
		FunctionalInterfaceSampleWithParameter f2 = a -> {
			System.out.println("a= " + a);
		};

		FunctionalInterfaceSampleWithParameterInt f3 = (b) -> {

			System.out.println("a =" + b);
			return b;
		};

		FunctionalInterfaceSampleWithParameterInt f4 = (b) -> {

			System.out.println("a =" + b);
			return b;
		};

		FunctionalInterfaceSampleWithParameters f5 = (a, b) -> {
			System.out.println("multiple paramaters");
		};

		f1.test();
		f2.test("FunctionalInterfaceSampleWithParameter");
		f3.test(0);
		f4.test(1);
//======================END LambdaInterfaces	

//=======Lambda on foreach start=======
		// https://crunchify.com/how-to-iterate-through-java-list-4-way-to-iterate-through-loop/

		List<String> list = new ArrayList<String>();
		list.add("a1");
		list.add("a2");

		Iterator<String> iterator = list.iterator();
		while (iterator.hasNext()) {
			System.out.println("value : " + iterator.next());
		}

		// with lambda

		list.forEach(t -> {
			System.out.println("forEach : " + t);
		});

//=======END==========================		

//====Lambda for comparator

		// Step1 : Write java program to sort list of custom object using comparator
		// Below code shows it using lambda
		List<Student> students = new ArrayList<Student>();

		Student s1 = new Student(1, "pradeep", "banglore");
		Student s2 = new Student(2, "kathare", "hospet");

		students.add(s1);
		students.add(s2);

		Collections.sort(students, (p1, p2) -> {
			return p1.getName().compareToIgnoreCase(p2.getName());
		});

//=====END============		
	}

}

interface NonFunctionalInterface {

	public void test();

	public void test(int a);
}

//sample lambdaExpression on FunctionalInterface
//@FunctionalInterface ->Interface with only one method
@FunctionalInterface
interface FunctionalInterfaceSampleWithoutParameter {

	public void test();

}

@FunctionalInterface
interface FunctionalInterfaceSampleWithParameter {

	public void test(String value);
}

@FunctionalInterface
interface FunctionalInterfaceSampleWithParameterInt {

	public int test(int value);
}

@FunctionalInterface
interface FunctionalInterfaceSampleWithParameters {

	public void test(int value, int value2);
}
