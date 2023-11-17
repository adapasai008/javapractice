package java_8_Interview;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ListReverseOrder {

	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(23,43,45,12,67,98,32,11);
		
	    nums.stream().sorted(Comparator.reverseOrder()).forEach(e -> System.out.print(e+" "));

	}

}
