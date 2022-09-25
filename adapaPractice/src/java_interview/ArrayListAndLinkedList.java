package java_interview;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListAndLinkedList {

	public static void main(String[] args) {
	
		//ArrayList is better for sorting and accessing the data.
		List<String> arry = new ArrayList<String>();
		arry.add("Adapa");
		arry.add("sai");
		arry.add("Naga");
		arry.add("Baddi");
		
		System.out.println("ArrayList = "+arry);
		arry.forEach(i -> System.out.println(i));//Java 8 feature forEach method.
		
		//LinkedList is better for manipulating the data
		//Both are non-synchronized classes which means not thread safe.
		List<String> linked = new LinkedList<String>();
		linked.add("Hyderabad");
		linked.add("Mumbai");
		linked.add("Nellor");
		linked.add("Delhi");
		
		System.out.println("LinkedList = "+linked);

	}

}
