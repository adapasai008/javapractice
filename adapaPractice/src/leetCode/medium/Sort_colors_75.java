package leetCode.medium;

public class Sort_colors_75 {

	public static void sortColours(int[] nums) {

		int start = 0;
		int mid = 0;
		int end = nums.length - 1;

		while (mid <= end) {

			if (nums[mid] == 0) {
				swap(nums, start, mid);
				start++;
				mid++;
			} else if (nums[mid] == 1) {
				mid++;
			} else {
				swap(nums, mid, end);
				end--;
			}

		}

	}

	private static void swap(int[] nums, int start, int end) {
		int temp = nums[start];
		nums[start] = nums[end];
		nums[end] = temp;
	}

	public static void main(String[] args) {
		int[] nums = { 2, 0, 2, 1, 1, 0 };
		sortColours(nums);

		for (int i : nums) {
			System.out.print(i + " ");
		}

	}

}
