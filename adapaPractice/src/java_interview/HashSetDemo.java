package java_interview;

import java.util.HashSet;
import java.util.Set;

//HashSet stores the element using a mechanism called hashing
//It won't allows the duplicate values 
//HashSet is not synchronized
//HashSet allows the null value.
//HashSet is best for the search operations.

public class HashSetDemo {

	public static void main(String[] args) {

		Set<Integer> ids = new HashSet<Integer>();
		ids.add(56);
		ids.add(26);
		ids.add(28);
		ids.add(41);
		ids.remove(1);
		
		for(int i : ids) {
			
			System.out.println(i);
			
		}
	}

}
