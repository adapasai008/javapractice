package leetCode.easy;

import java.util.ArrayList;

public class InteractionArrays {

	public static void main(String[] args) {

		int[] nums1 = { 2, 8, 3, 8 };
		int[] nums2 = { 2, 5, 8, 8 };

		ArrayList<Integer> rep = new ArrayList<Integer>();

		for (int i = 0; i <= nums1.length - 1; i++) {
			for (int j = 0; j <= nums2.length - 1; j++) {
				if (nums1[i] == nums2[j]) {
					rep.add(nums1[i]);
					// Mark the used element in nums2 to avoid duplicates
					nums2[j] = -1;

					break;// Break to avoid using the same element in nums1 again
				}
			}
		}

		int[] output = new int[rep.size()];
		int k = 0;

		for (int i : rep) {

			output[k] = i;
			k++;

		}

		for (int h : output) {
			System.out.print(h + " ");
		}
	}

}
