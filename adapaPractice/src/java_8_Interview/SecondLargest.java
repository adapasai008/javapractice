package java_8_Interview;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SecondLargest {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(10,50,30,20,40);
		
		Integer secLarg = numbers.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
		
		System.out.println(secLarg);
	}

}
