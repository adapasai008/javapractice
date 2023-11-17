package java_8_Interview;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringJoinerII {

	public static void main(String[] args) {
	List<String> listOfStrings = Arrays.asList("Facebook", "Twitter", "YouTube", "WhatsApp", "LinkedIn");
	String joined = listOfStrings.stream().collect(Collectors.joining(",","[","]"));
	
	System.out.println(joined);

	}

}
