package interview_prep_2026;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Duplicate_Elements_02 {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5, 2, 3 };
		Set<Integer> duplicate = new HashSet<Integer>();

//		for (int i : arr) {
//
//			if (!duplicate.add(i)) {
//				System.out.print(i+", ");
//			}
//		}
		
		/* Java 8 code solution */
		Arrays.stream(arr).boxed().filter(n -> !duplicate.add(n)).forEach(System.out::println);
	}

}
