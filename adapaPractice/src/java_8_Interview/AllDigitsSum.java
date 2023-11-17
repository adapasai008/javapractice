package java_8_Interview;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AllDigitsSum {

	public static void main(String[] args) {
		int i = 15623;
		
		Integer sum = Stream.of(String.valueOf(i).split("")).collect(Collectors.summingInt(Integer::parseInt));
		System.out.println("Sum of the given int : "+sum);

	}

}
