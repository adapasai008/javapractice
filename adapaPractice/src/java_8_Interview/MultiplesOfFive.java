package java_8_Interview;

import java.util.Arrays;
import java.util.List;

public class MultiplesOfFive {

	public static void main(String[] args) {
		List<Integer> mult = Arrays.asList(23,15,42,55,60,70,65,20);
		
		mult.stream().filter(e -> e%5 == 0).forEach(e -> System.out.print(e+" "));

	}

}
