package leetCode.medium;

public class MaximumSubarray_53 {

	public static int maxSubArray(int[] nums) {
		
		int maxsum = Integer.MIN_VALUE;
		int curr = 0;
		
		for(int i=0;i<nums.length;i++) {
			
			curr = curr + nums[i];
			
			if(curr > maxsum) {
				maxsum = curr;
			}
			
			if(curr < 0) {
				curr = 0;
			}
		}
		
		return maxsum;
	}
	
	public static void main(String[] args) {
		int[] nums = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };

		int result = maxSubArray(nums);

		System.out.println(result);

	}

}
