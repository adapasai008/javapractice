package leetCode.easy;

public class MergeSortedArray_88 {

	public static void merge(int[] nums1, int m, int[] nums2, int n) {
		int left = m - 1;
		int right = n - 1;
		int len = m + n - 1;

		while (right >= 0) {// "right >= 0" null check for nums2;
			if (left >= 0 && nums1[left] >= nums2[right]) {// "left >= 0" null check for nums1;
				nums1[len--] = nums1[left--];
			} else {
				nums1[len--] = nums2[right--];
			}
		}
	}

	public static void main(String[] args) {

		int[] nums1 = { 4, 5, 6, 0, 0, 0 };
		int m = 3;
		int[] nums2 = { 1, 2, 3 };
		int n = 3;
		merge(nums1, m, nums2, n);

		for (int num : nums1) {
			System.out.print(num + " ");
		}
	}
}
