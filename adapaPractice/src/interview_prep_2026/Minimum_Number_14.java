package interview_prep_2026;

import java.util.Arrays;
import java.util.List;

public class Minimum_Number_14 {

	public static void main(String[] args) {
		
		List<Integer> nums = Arrays.asList(1,2,2,4,5,6,8,3);
		
		//Integer minNum = nums.stream().distinct().sorted().findFirst().orElseThrow();
		
		//Integer minNum = nums.stream().min((n1,n2) -> Integer.compare(n1, n2)).orElseThrow();
		
		/* Best Solution */
		Integer minNum = nums.stream().min(Integer::compareTo).orElseThrow();
		
		System.out.println(minNum);
	}

}
