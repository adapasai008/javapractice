package interview_prep_2026;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Reverse_Sorted_List_15 {

	public static void main(String[] args) {

		List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5);

		List<Integer> revNums = nums.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());

		System.out.println(revNums);
	}

}
