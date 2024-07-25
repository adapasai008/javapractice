package leetCode.easy;

import java.util.Arrays;

public class SquaresOfSotedArray_977 {

	public static int[] targetSum(int[] nums) {

		int i = 0;
		int j = nums.length-1;
		int count = nums.length-1;
		
		int[] result = new int[nums.length];
		
		while(i <= j) {
			
			int leftsq = nums[i] * nums[i];
			int rightsq = nums[j] * nums[j];
			
			if(leftsq > rightsq) {
				result[count] = leftsq;
				i++;
			}else {
				result[count] = rightsq;
				j--;
			}
			count--;
		}
		
		return result;
		
	}
	
	public static void main(String[] args) {
		
		int[] nums = {4,1,2,3,5};//1,4,9,16,25
		
		int[] val = targetSum(nums);
		
		System.out.println(Arrays.toString(val));

	}

}
