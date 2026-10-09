package interview_prep_2026;

public class SubArray_Of_GivenSum_23 {

	public static void main(String[] args) {

		/* sliding window problem */
		int[] nums = { 1, 2, 3, 7, 5 };
		int sum = 12;

		int left = 0;
		int currentSum = 0;

		for (int right = 0; right < nums.length; right++) {
			currentSum += nums[right];

			while (currentSum > sum) {
				currentSum -= nums[left];
				left++;
			}

			if (currentSum == sum) {

				for (int i = left; i <= right; i++) {
					System.out.print(nums[i] + " ");
				}
				System.out.println();

			}
		}
	}

}
