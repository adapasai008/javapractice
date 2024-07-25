package leetCode.medium;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindDuplicatesInArray_442 {

	public static List<Integer> duplicatesInArray(int[] nums){
		List<Integer> result = new ArrayList<Integer>();
		Set<Integer> seen = new HashSet<Integer>();
		
		for(int i=0;i<nums.length;i++) {
			if(seen.contains(nums[i])) {
				result.add(nums[i]);
			}else {
				seen.add(nums[i]);
			}
		}
		return result;
	}
	
	public static void main(String[] args) {
		int[] nums = {4,3,2,7,8,2,3,1};
		List<Integer> dupli = duplicatesInArray(nums);
		
		System.out.println(dupli);

	}

}
