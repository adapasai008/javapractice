package java_8_Interview;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class OddEvenNum {

	public static void main(String[] args) {
		List<Integer> numsList = Arrays.asList(23,12,56,76,34,89,33);
		
		//even numbers
		List<Integer> even = numsList.stream().filter(e -> e%2 == 0).collect(Collectors.toList());
		System.out.println("even = "+even);
		
		//odd numbers
		List<Integer> odd = numsList.stream().filter(e -> e%2 != 0).collect(Collectors.toList());
		System.out.println("odd = "+odd);

	}

}
