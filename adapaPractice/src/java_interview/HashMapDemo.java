package java_interview;

import java.util.HashMap;
import java.util.Set;

//HashMap contains values based on keys
//HashMap contains only unique keys
//HashMap may allow one null key multiple null values
//HashMap may is non synchronized 
//HashMap maintains no order
public class HashMapDemo {

	public static void main(String[] args) {
	
		HashMap<Integer, String> students = new HashMap<Integer, String>();
		students.put(1, "Adapa");
		students.put(2, "Sai");
		students.put(3, "Naga");
		students.put(4, "Ravi");
		
		System.out.println(students);
		System.out.println(students.get(2));
		
		Set<Integer> keys = students.keySet();
		
		for(Integer key : keys) {
			
			System.out.println(key+" "+students.get(key));
		}

	}

}
