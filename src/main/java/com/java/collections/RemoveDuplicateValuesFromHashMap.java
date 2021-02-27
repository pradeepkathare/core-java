package com.java.collections;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/*
 * Find duplicates and remove frm collections
 * 1 : 
 */
public class RemoveDuplicateValuesFromHashMap {

	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<>();
		map.put("a", 1);
		map.put("b", 1);
		map.put("c", 2);
		map.put("d", 3);
		
		
		ConcurrentHashMap<String, Integer> concurrentmap = new ConcurrentHashMap<>(map);
		for(Map.Entry<String, Integer> entry:concurrentmap.entrySet()) {
			
			boolean f=  Collections.frequency(concurrentmap.values(),entry.getValue()) >1;
			System.out.println(f);
			if(f) {
				concurrentmap.remove(entry.getKey());
			}
			
		}

		System.out.println("after duplicate ="+concurrentmap.toString());
	}

}
