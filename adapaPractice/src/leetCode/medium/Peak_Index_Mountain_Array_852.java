package leetCode.medium;

public class Peak_Index_Mountain_Array_852 {

	public static int peakIndexInMountainArray(int[] arr) {
		if (arr == null) {
			return -1;
		}
		int low = 0;
		int high = arr.length - 1;

		while (low < high) {
			int mid = low + (high - low) / 2;

			if (arr[mid] < arr[mid + 1]) {
				low = mid + 1;
			} else {
				high = mid;
			}
		}

		return low;

	}

	public static void main(String[] args) {
		int[] nums = { 0, 18, 15, 2, 1 };

		int result = peakIndexInMountainArray(nums);

		System.out.println(result);

	}

}
