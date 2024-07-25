package leetCode.easy;

import java.util.ArrayList;
import java.util.List;

public class FindAllNumbersDisappeared_448 {

	public static List<Integer> findMiss(int[] nums) {

		List<Integer> result = new ArrayList<Integer>();

		for (int i = 0; i < nums.length; i++) {
			int index = Math.abs(nums[i]) - 1;

			if (nums[index] > 0) {
				nums[index] = -nums[index];
			}
		}

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] > 0) {
				result.add(i + 1);
			}
		}
		return result;
	}


	public static void main(String[] args) {
		int[] nums = { 4, 3, 2, 7, 8, 2, 3, 1 };

		List<Integer> miss = findMiss(nums);

		System.out.println(miss);

	}

}
/* The space and time complexity of this code is O(n) because we are using the different for loops not the nested for loop
 * To solve this problme I am markign all the array index values to negative values and providing the values which are positive.
 * Rever this for better understanding (https://www.youtube.com/watch?v=oEBHLcucDYg&ab_channel=NikhilLohia)*/