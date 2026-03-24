package leetCode.easy;

public class RemoveDuplicatesFromSortedArry_26 {

	public static int removeDuplicates(int[] nums) {
		int result = 0;

		for (int i = 0; i < nums.length; i++) {

			if (nums[result] != nums[i]) {// here we are comparing with updated array to the old array
				result++;
				nums[result] = nums[i];
			}

		}

		return result + 1; // here we are updating the index value to the count.
	}

	public static void main(String[] args) {

		int[] nums = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4, 7, 7, 9 };
		int result = removeDuplicates(nums);

		for (int i = 0; i < result; i++) {
			System.out.print(nums[i] + " ");
		}

	}

}
