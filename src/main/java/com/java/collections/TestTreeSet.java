package com.java.collections;

import java.util.TreeSet;

/*
 * In tree set it doesnot maintain insertion order
 * Doesnot allow duplicate elements 
 * It sort elements by key and value will present object
 * NOTE : YOU HAVE TO OVERRIDE COMPARETO METHOD FOR ADDING USERDEFINED OBJECTS FOR STRING AND WRAPPER CLASS ITS INBUILT
 *  BECAUSE KEYS ARE SORTED IN ASCENDING ORDER 
 * TO COMPARE KEYS WE HAVE TO OVERRIDE ASCENDING ORDER
 */
public class TestTreeSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employe e1 = new Employe(10, "kathare");
		
		TreeSet<Employe> treeset = new TreeSet<>();
		treeset.add(e1);
		treeset.add(e1);
		System.out.println(treeset);
		
	}

}

/*
 * This program throws exception so uncomment to see changes
 */
class Employe {//implements Comparable<Object>{
	
	int id;
	String name;
	
	public Employe(int id,String name) {
		// TODO Auto-generated constructor stub
		this.id = id;
		this.name = name;
	}
	
	

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		/*int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());*/
		return id;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employe other = (Employe) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}


	
/*
 * To add elements/objects in prioirty or treeset or to call collections.sort method  we have to specify compareto method for userdefined 
 * class/objects
 */
	/*
	 @Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		if(this.id>id) {
			return 1;
		}
		return 0;
	}
	 */
	
	
	
}