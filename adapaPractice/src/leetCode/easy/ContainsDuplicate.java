package leetCode.easy;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {

	public static void main(String[] args) {
		int[] nums = {1,2,3,1};//should print the true if it's contains the repeating number
		
		Set<Integer> repetedNums = new HashSet<Integer>();
		
		boolean result = false;
		
		for(int num : nums) {
			if(repetedNums.contains(num)) {
				result = true;
			}
			repetedNums.add(num);
		}
		
		
		System.out.println(result);

	}

}
