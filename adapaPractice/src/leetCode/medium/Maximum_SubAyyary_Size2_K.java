package leetCode.medium;

public class Maximum_SubAyyary_Size2_K {

	public static int maxSubSum(int[] nums, int k) {
		int sMax = 0;
		int cMax = 0;

		for (int i = 0; i < k; i++) {
			cMax = cMax + nums[i];
		}
		sMax = cMax;

		for (int i = k; i < nums.length; i++) {
			cMax = cMax - nums[i - k] + nums[i];
			sMax = Math.max(sMax, cMax);
		}
		return sMax;
	}

	public static void main(String[] args) {

		int[] nums = {1,2,3,4,5,6};
		int k = 3;

		int result = maxSubSum(nums, k);
		System.out.println(result);

	}

}
/* I have solved this using the sliding window pattern
 * At first I have taken the K elements sum in the first loop
 * And in the second loop I am moving the window for the one setp removing the first element from the window
 * And adding the new element and compering the value wiht the previous value and updating the max value */


//The time complexity of this code is O(n) despite the fact that we are using two for loops. However, the key point here is that we iterate
//through the entire array only once."
//And the space complexity is O(1) we are using the constant space.