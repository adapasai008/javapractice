package interview_prep_2026;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Remove_Duplicates_List_39 {

	public static void main(String[] args) {

		List<Integer> nums = Arrays.asList(10, 20, 30, 10, 20, 40, 30, 50);

		Set<Integer> set = new HashSet<Integer>();

		for (int i : nums) {
			set.add(i);
		}

		Set<Integer> orderedSet = new LinkedHashSet<>(nums); // convert the set to LinkedHashSet to maintain the order.
		
		System.out.println(set);
		
		System.out.println(orderedSet);

		/* Java 8 code solution */

		Set<Integer> set8 = nums.stream().collect(Collectors.toSet());
		//List<Integer> set8 = nums.stream().distinct().toList();//Another way of implementation to maintain the order.
		System.out.println(set8);

	}

}
