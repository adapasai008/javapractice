package interview_prep_2026;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvenOdd_Num_Formatter_12 {

	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5);

		/* Normal code solution */
		for (int i = 0; i < nums.size(); i++) {
			if (nums.get(i) % 2 == 0) {
				System.out.print(nums.get(i) + "e");
			} else {
				System.out.print(nums.get(i) + "o");
			}

			if (i < nums.size() - 1) {
				System.out.print(",");
			}
		}
		System.out.println();
		/* solution using Java 8 */
		System.out.println("---Java 8 code solution---");

		List<String> result = nums.stream().map(n -> n % 2 == 0 ? n + "e" : n + "o").collect(Collectors.toList());

		System.out.println(result);

	}

}
