package com.java.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CustomObjectSortByComparator {

	public static void main(String[] args) {
		
		Student s1 = new Student(1, "manju");
		Student s2 = new Student(10, "anju");
		Student s3 = new Student(3, "nju");
		Student s4 = new Student(4, "ju");
		Student s5 = new Student(5, "u");
		
		
		List<Student> list = new ArrayList<>();
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		list.add(s5);
		
		//java 7
		System.out.println("Before sorting="+list);
		Collections.sort(list,new StudentComparatorByID());
		System.out.println("After sorting by ID ="+list);
		
		//java 8
		Comparator<Student> comparator = ( s,  s10)->{
			return s.getName().compareTo(s10.getName());
		};
		
		
		list.sort(comparator);
		System.out.println("sort by name="+list);
	}

}


class Student{
	
	int id;
	String name;
	
	public Student(int id,String name) {
		this.id=id;
		this.name=name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "student [id=" + id + ", name=" + name + "]";
	}
	
	
}


class studentComparator implements Comparator<Student> {

	@Override
	public int compare(Student s1, Student s2) {

		return s1.getName().compareToIgnoreCase(s2.getName());
	}

}

class StudentComparatorByID implements Comparator<Student>{

	@Override
	public int compare(Student s1, Student s2) {

		if (s1.getId() == s2.getId()) {
			return 0;
		} else if (s1.getId() < s2.getId()) {
			return -1;
		} else {
			return 1;
		}

	}
	
}