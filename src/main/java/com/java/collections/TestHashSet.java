package com.java.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

/*
 * This programs shows how to use functions of hashset
 * Set :It does not allow duplicate elements
 * 
 * 2 : It doesnot maintain insrtion ordr like list
 * 
 * 3 : its iterator called as fail-fast(if set is modified any time after itrator object is created except 
 *  its own remove method it throws concurrntModificationException .i,e it fails quickly and cleanly 
 *  rathr than risking object
 *  
 * 4 : HashSet internally uses HashMap 
 * 
 * 5 :FailFast :In Java, we can find this behavior with iterators.
Incase, you have called iterator on a collection object, and another
thread tries to modify the collection object, then concurrent modification
exception will be thrown. This is called fail-fast.
//concurrent hash map helps for avoidnig fail-fast iterator
 * )
 * LinkedHashSet maintains insertion ordr and calls linkedhashmap
 * 
 * HashSet internally implementaion : If we have added 
 * HashSet intrnally calld hashmap to store elements and keys will be object passed and value will be present value;
 * if added successfully it will reutrn else it will return element already added
 * 
 * 
 * Extra rference :https://www.geeksforgeeks.org/internal-working-of-sethashset-in-java/
 * 
 * LinkedHashSet : It maintains insrtion order because it internally uses linkedhashmap i,e it has head and tail to keep 
 * track of elements
 */
public class TestHashSet {

	public static void main(String[] args) {
		
		HashSet<Object> hs = new HashSet<>();
		
		
		hs.add("Deepa"); //add internally calls put method 
		hs.add("kathare");
		hs.add("Pavan");
		hs.add("kathare");
		
		LinkedHashSet linkdhs = new LinkedHashSet<>();
		
		linkdhs.add("dsd");
		linkdhs.remove("");
		
		Iterator<Object> it = hs.iterator();
		
		while(it.hasNext()) {
			System.out.println("" +it.next());
			hs.remove("pradee");//it wont throw concurrnt modification exception
			it.remove();
			
			//hs.add("kathare2"); //throws exception because of fail-fast
		}
	}
}
