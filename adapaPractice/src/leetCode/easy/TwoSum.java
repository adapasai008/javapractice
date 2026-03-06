package leetCode.easy;

import java.util.HashMap;

public class TwoSum {

	public static int[] twoSum(int[] nums, int target) {

		HashMap<Integer, Integer> contains = new HashMap<Integer, Integer>();

		for (int i = 0; i < nums.length; i++) {
			int remaining = target - nums[i];

			if (contains.containsKey(remaining)) {
				return new int[] { contains.get(remaining), i };
			}
			contains.put(nums[i], i);
		}
		return null;
	}

	public static void main(String[] args) {

		int[] nums = { 7, 11, 15, 2 };
		int target = 9;
		int[] result = twoSum(nums, target);

		System.out.println(result[0] + ", " + result[1]);

	}
}
