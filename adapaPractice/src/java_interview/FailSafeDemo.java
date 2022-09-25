package java_interview;

import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
/*
 1.We can perform the modification operations on a collections while iterating over it.
 2.Fail-Safe won't throw the ConcurrentModificationException during the iteration.
 3.Fail-Safe iterators use the copy of the collection to traverse over the elements.
 4.Unlike Fail-Fast, they require more memory as they cloned the collection.
 5.The examples of Fail-Safe iterators are ConcurrentHashMap, CopyOnWriteArrayList etc.
 */
public class FailSafeDemo {

	public static void main(String[] args) {
	
		ConcurrentHashMap<Integer, String> fast = new ConcurrentHashMap<Integer, String>();
		fast.put(1, "Adapa");
		fast.put(2, "Pallavi");
		fast.put(3, "Sai");
		
		Iterator<Integer> itr = fast.keySet().iterator();
		
		while(itr.hasNext()) {
			
			Integer key = itr.next();
			
			System.out.println(key+" "+fast.get(key));
			//Now here it won't throws any error if we modify while it's iterating.
			fast.put(4, "New");
		}
		

	}

}
