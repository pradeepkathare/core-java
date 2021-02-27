package com.java.collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/*
 * TestHashmap
 * HashMap allows one null key and multiple null values
 * hashMap  maintains no order 
 * it works on hashing principle so we have to override hash and equals method
 * 
 */
public class TestHashMap {

	public static void main(String[] args) {
		
		HashMap<Object, Object> hm = new  HashMap<>();
		
		TreeMap<Object, Object> tm = new  TreeMap();
		hm.put("pradeep", "kathare");
		hm.put("pradeep", "pavan");
		
		System.out.println("fetching value : "+hm.get("pradeep")); //key overrided by other method
		
		Employe e1 = new Employe(10, "pradeep");
		Employe e2 = new Employe(10, "pradeep");
		hm.put("empl", e1);
		hm.put("df", e2);
		
		/*
		 * traversing by Entry
		 */
		for(Map.Entry entry:hm.entrySet()) {
			
			System.out.println("key :"+entry.getKey() +"Value :"+entry.getValue());
			
		}
		/*
		 * traversing only keyset
		 */
		Set keyset = hm.keySet();
	
		Iterator itr = keyset.iterator();
		
		while (itr.hasNext()) {

			System.out.println(itr.next());
		}
		
		/*
		 * traversing only values
		 */
		Collection<Object> values = hm.values();
		
		itr = values.iterator();
		
		while (itr.hasNext()) {

			System.out.println(itr.next());
		}
		/*
		 * To show difference in custom object key we have to over ride equals and hashcode function
		 * 
		 */
		 hm.put(e1, "pradeep");
		// hm.put(e2, "kathare");
		 
		 //Since e1 and e2 both have same values  but
		 
		 System.out.println("Expecting to return value but it returns null so we have to override hash and  equals in Employyee:"+hm.get(e2));//
		
	}
	
	
}
