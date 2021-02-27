package com.java.v8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateExample {

	public static void main(String[] args) {

		Predicate<Integer> predicateGreater = i->i>10;
		//It checks only greater than 10
		System.out.println("predicate :"+predicateGreater.test(111));


		Predicate<Integer> predicateLesser =i->i<100;
		//AND : It checks greater than 10 and less than 100
		System.out.println("predicate AND: "+predicateGreater.and(predicateLesser).test(20));

		//OR:It checks greater than 10 or less than 100
		System.out.println("predicate OR: "+predicateGreater.or(predicateLesser).test(1));

		//Predicate calling method (Function)
		Student s = new Student(100,"pk","hospet");
		System.out.println(predicateStudentID().test(s));

		//Predicate for collection
		List<Student> students = new ArrayList<Student>();
		students.add(new Student(100,"pk","hospet"));
		students.add(new Student(10,"pk","hospet"));
		students.add(new Student(1,"pk","hospet"));
		students.add(new Student(45,"pk","hospet"));
		students.add(new Student(1,"pk","hospet"));

		List<Student> list = filterStudent(students,predicateStudentID());
		System.out.println("predicated filtered list : "+list);


	}

	public static Predicate<Student> predicateStudentID() {
		return  student->student.getId()>10;
	}

	//no need to iterate explicitly...here it internally iterate and provides new list with filter
	public static  List<Student> filterStudent(List<Student> students,Predicate<Student>predicate){

		return students.stream().filter(predicate).collect(Collectors.toList());
	}


	//write logic to get students whose id is greater than 10 using predicate


}

