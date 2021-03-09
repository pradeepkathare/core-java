package programming.programs;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

/*
 * To print duplicate values and  remove duplicate values from hashmap
 */
public class TestHashMapDuplicateValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Object, Object> hm = new HashMap<Object, Object>();
		
		hm.put(1, "kathare1");
		hm.put(2, "kathare");
		hm.put(3, "pradeep");
		hm.put(4,"kathare");
		
		Collection<Object> coll = hm.values();
		
		
		Iterator<Object> itr   = coll.iterator();
		Iterator<Object> itr1 ;
		
		String ste = "";
		while (itr.hasNext()) {

			System.out.println("itr.next() : "+itr.next());
			
			itr1 = itr;
			//System.out.println("itr1 : "+itr1.next() +"itr.next() : "+itr.next());
			
			while(itr1.hasNext()){
				System.out.println("itr1 : "+itr1.next());
			}
		}
		 
		 
	}

}
