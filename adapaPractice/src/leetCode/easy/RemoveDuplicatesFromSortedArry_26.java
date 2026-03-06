package leetCode.easy;

import java.util.Arrays;

public class RemoveDuplicatesFromSortedArry {

	public static void main(String[] args) {

		int[] nums = { 20, 30, 10, 60, 50, 10, 30 };
		Arrays.sort(nums);
		
		int j = 0;
		
		for(int i=0;i<nums.length-1;i++) {
			if(nums[i] != nums[i+1]) {
				nums[j] = nums[i];
				j++;
			}
		}
		
		nums[j] = nums[nums.length-1];
		j++;
		
		for(int i=0;i<j;i++) {
			System.out.print(nums[i]+" ");
		}

	}

}
