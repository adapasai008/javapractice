package java_interview;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
/*
 1.The Fail-Fast iterator will throws a ConcurrentModificationException if a collection is modified while
   iterating over it.
 2.The Fail-Fast iterator uses an original collection to traverse over the collection's elements.
 3.They are memory savers, don't requires extra memory.
 4.The Fail-Fast iterators returned by ArrayList, HashMap, Vector classes.
 */
public class FailFastDemo {

	public static void main(String[] args) {
		
		Map<Integer, String> fail = new HashMap<Integer, String>();
		fail.put(1, "Adapa");
		fail.put(2, "Sagar");
		fail.put(3, "Hari");
		fail.put(4, "Sai");
		
		Iterator<Integer> itr = fail.keySet().iterator();
		
		while(itr.hasNext()) {
			
			System.out.println(itr.next());
			//Here it will throw the ConcurrentModificationException.
			fail.put(5, "Pallvai");
		}
		
		
	}
	
}
