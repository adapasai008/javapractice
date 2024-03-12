package leetCode.medium;

public class JumpGame_55 {

	public static boolean canJump(int[] nums) {
		int maxJump = 0;
		for (int i = 0; i < nums.length; i++) {
			if (i > maxJump) {
				return false;
			}
			maxJump = Math.max(maxJump, i + nums[i]);
			if (maxJump >= nums.length - 1) {
				return true;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		
		int[] nums = {3,0,1,1,4};
		boolean result = canJump(nums);
		System.out.println(result);

	}

}
/*Time complexity of this code is "O(n) because it's using only one for loop to iterate over the array"
 *Space complexity of this code is "O(1)" because it's using the constant space.
 */
