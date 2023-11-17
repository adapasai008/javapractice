package java_8_Interview;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MinMaxThree {

	public static void main(String[] args) {
		List<Integer> numsList = Arrays.asList(11,22,33,44,55,66,77,88,99);
		
		System.out.println("Minimum three values:");
		numsList.stream().sorted().limit(3).forEach(e -> System.out.print(e+" "));
		
		System.out.println();
		
		System.out.println("Maximum three values:");
		numsList.stream().sorted(Comparator.reverseOrder()).limit(3).forEach(e -> System.out.print(e+" "));

	}

}
