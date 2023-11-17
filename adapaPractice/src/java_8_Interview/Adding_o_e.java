package java_8_Interview;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Adding_o_e {

	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(1,2,3,4,5,6);
		
		//To print the second largest number from the given string
		int secondlarge = nums.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
		System.out.println(secondlarge);
		
		//This code will print the odd and even along with the number
		List<String> oddEvn = nums.stream().map(n -> n % 2 == 0 ? n+"e" : n+"o").collect(Collectors.toList());
		System.out.println(oddEvn);

	}

}
