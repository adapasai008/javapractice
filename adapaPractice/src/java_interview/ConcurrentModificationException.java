package java_interview;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/*
 The ConcurrentModificationException occurs when an object is tried to be modified concurrently when it's not 
 possible. This exception usually comes when one is working with Java Collections class.
 
 For example:- It is not possible for a thread to modify a collection when some other thread is iterating over it.
 
 Constructors of ConcurrentModificationException:
 1.public ConcurrentModificationException()
 2.public ConcurrentModificationException(String message)
 3.public ConcurrentModificationException(Throwable cause)
 4.public ConcurrentModificationException(String message,Throwable cause)
 
 Ways to avoid ConcurrentModificationException in Multi-threaded environment:
 1.Instead of iterating over the collections we can iterate over the array.
 2.Another way can be locking the list by putting it in the synchronized block.
 3.JDK 1.5 or higher provides with ConcurrentHashMap.
 
 Ways to avoid ConcurrentModificationException in Single-threaded environment:
 1.By using iterator remove() function 
 

 */
public class ConcurrentModificationException {

	public static void main(String[] args) {
	
		List<String> mobile = new ArrayList<>();
		
		mobile.add("Apple");
		mobile.add("One Plus");
		mobile.add("Samsung");
		mobile.add("POCO");
		
		System.out.println(mobile);
		
		//Removing element using ArrayList remove method.
		//This will throw concurrent modification exception.
		
//		for(String phone:mobile) {
//			if(phone.equals("POCO")) {
//				
//				mobile.remove(phone);
//			}
//			
//		}

		//If we remove element in ArrayList using Iterator.remove it won't throw's any exception
		Iterator<String> itr = mobile.iterator();
		while(itr.hasNext()) {
			
			String phone = itr.next();
			
			if(phone.equals("POCO")) {
				
				itr.remove();
				
				System.out.println(mobile);
				
			}
			
		}
		
	}

}
