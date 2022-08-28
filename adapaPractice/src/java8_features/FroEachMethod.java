package java8_features;

import java.util.Arrays;
import java.util.List;

public class FroEachMethod {

	public static void main(String[] args) {
	
		List<Integer> list = Arrays.asList(2,5,44,3,6);
		
		//forEach method it's a new feature in Java 8 
		//it's a internal loop
	     list.forEach(i -> System.out.println(i));//" -> " it's a lambda expression

	}

}
