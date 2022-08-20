package java_interview;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

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
		
		/*for(String phone:mobile) {
			if(phone.equals("POCO")) {
				
				mobile.remove(phone);
			}
			
		}*/

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
