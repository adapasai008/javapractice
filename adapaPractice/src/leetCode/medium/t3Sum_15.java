package leetCode.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class t3Sum_15 {

	public static List<List<Integer>> threeSum(int[] nums) {

		List<List<Integer>> result = new ArrayList<List<Integer>>();

		Arrays.sort(nums);

		for (int i = 0; i < nums.length - 2; i++) {

			if (i > 0 && nums[i] == nums[i - 1]) {
				continue;
			}
			int start = i + 1;
			int end = nums.length - 1;

			while (start < end) {

				int sum = nums[i] + nums[start] + nums[end];

				if (sum == 0) {
					result.add(Arrays.asList(nums[i], nums[start], nums[end]));

					start++;
					while (start < end && nums[start] == nums[start - 1]) {
						start++;
					}

					end--;
					while (start < end && nums[end] == nums[end + 1]) {
						end--;
					}
				} else if (sum < 0) {
					start++;
				} else {
					end--;
				}
			}

		}

		return result;

	}

	public static void main(String[] args) {

		int[] nums = { -1, 0, 1, 2, -1, -4 };

		List<List<Integer>> result = threeSum(nums);

		System.out.println(result);

	}

}
