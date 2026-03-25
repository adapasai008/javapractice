package leetCode.easy;

public class MoveZeroes_283 {

	public static void moveZeros(int[] nums) {

		int start = 0;
		int track = 0;

		while (start < nums.length) {

			if (nums[start] != 0) {
				nums[track++] = nums[start];
			}
			start++;
		}

		while (track < nums.length) {
			nums[track++] = 0;
		}

	}
	
	//another solution with swapping the values
	/*
	 * public static void mzer(int[] nums) { int j = 0; // position for next
	 * non-zero
	 * 
	 * for (int i = 0; i < nums.length; i++) { if (nums[i] != 0) { int temp =
	 * nums[i]; nums[i] = nums[j]; nums[j] = temp;
	 * 
	 * j++; } } System.out.println("from mzer");
	 * 
	 * }
	 */

	public static void main(String[] args) {

		int[] nums = { 0, 1, 0, 3, 12 };
		moveZeros(nums);
		//mzer(nums);

		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}

	}

}
