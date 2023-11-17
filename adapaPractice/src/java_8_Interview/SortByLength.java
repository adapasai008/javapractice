package java_8_Interview;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortByLength {

	public static void main(String[] args) {
		List<String> str = Arrays.asList("Adapa","Sai","Naga","KoteswaraRao","Pallavi");
		
		//This code will print the names in the accending order
		str.stream().sorted(Comparator.comparing(String::length)).forEach(e-> System.out.println(e));
		
		System.out.println("-------------------");
		
		//This code will print the names in the decending order
		str.stream().sorted(Comparator.comparing(String::length).reversed()).forEach(e-> System.out.println(e));

		System.out.println("-------------------");
		
		//This code will print the name with highest character
		String LastName = str.stream().sorted(Comparator.comparing(String::length).reversed()).findFirst().get();
		
		System.out.println("Name with highest count = "+LastName);
	}

}
