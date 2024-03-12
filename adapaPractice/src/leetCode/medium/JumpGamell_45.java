package leetCode.medium;

public class JumpGamell_45 {

	public static int jumps(int[] nums) {
		if(nums == null || nums.length == 0) {
			return 0;
		}
		
		int position = 0;
		int jumps = 0;
		int destination = 0;
		
		for(int i=0;i<nums.length-1;i++) {
			destination = Math.max(destination, i+nums[i]);
			if(i == position) {
				jumps++;
				position = destination;
			}
		}
		return jumps;
	}
	
	public static void main(String[] args) {
	
		int[] nums = {2,3,0,1,4};
		int result = jumps(nums);
		System.out.println(result);

	}

}
/*Time complexity of this code is "O(n) because it's using only one for loop to iterate over the array"
 *Space complexity of this code is "O(1)" because it's using the constant space.
 *Refer this video for better understanding (https://www.youtube.com/watch?v=Yrw3MNh_368&ab_channel=PrakashShukla)
 */