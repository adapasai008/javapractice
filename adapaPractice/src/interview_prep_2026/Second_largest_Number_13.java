package interview_prep_2026;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Second_largest_Number_13 {

	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(1, 4, 5, 5, 2, 3);

		Optional<Integer> lnum = nums.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst();

		System.out.println(lnum.get());
		
//		int[] nums = {1,4,3,5,2}; //just use the boxed it will convert the int to integer
//		Optional<Integer> result = Arrays.stream(nums).boxed().sorted(Comparator.reverseOrder()).skip(1).findFirst();

	}

}
