package java8_features;

import java.util.StringJoiner;

/* 
 StringJoiner it is used to construct a sequence of charters separated by a delimiter.
 
 With the help of StringJoiner we can create string by passing delimiter like (,),(-),(:) etc
 
 We can also pass the prefix and suffix to the char sequence.
 */

public class StringJoinerDemo {

	public static void main(String[] args) {
	
		StringJoiner str1 = new StringJoiner(",","[","]");
		
		str1.add("A");
		str1.add("B");
		str1.add("C");
		
		System.out.println(str1);
		
		StringJoiner str2 = new StringJoiner(":");

		str2.add("P");
		str2.add("Q");
		
		System.out.println(str2);
		
		str1.merge(str2);//This will merge the str1 and str2
		System.out.println(str1);
	}

}
