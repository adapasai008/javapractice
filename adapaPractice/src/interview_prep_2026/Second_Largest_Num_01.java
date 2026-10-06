package interview_prep_2026;

import java.util.Arrays;
import java.util.Comparator;

public class Second_Largest_Num_01 {

	public static void main(String[] args) {
	
		int[] arr = {1,2,3,4,5};
		
		int first = Integer.MIN_VALUE;
		int second = Integer.MIN_VALUE;
		
		for(int nums : arr) {
			
			if(nums > first) {
				second = first;
				first = nums;
			}else if(first > nums && second < nums) {
				second = nums;
			}
		}
		
		System.out.println(second);
		/* Java * solution code */
		System.out.println("---Java 8 solution---");
		
		Integer second_8 = Arrays.stream(arr).boxed().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst().orElseThrow();
		
		System.out.println(second_8);
		
	}

}
