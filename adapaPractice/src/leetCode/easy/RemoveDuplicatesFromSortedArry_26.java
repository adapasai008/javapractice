package leetCode.easy;

public class RemoveDuplicatesFromSortedArry_26 {

	public static int removeDuplicates(int[] nums) {
		int start = 0;
		int travel = 1;
		int answer = 1;

		//Two pointers approach.
		while (travel < nums.length) {
			if (nums[start] != nums[travel]) {
				nums[answer] = nums[travel];
				start = travel;
				answer++;

			}
			travel++;

		}

		return answer;
	}

	public static void main(String[] args) {

		int[] nums = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
		int result = removeDuplicates(nums);

		for (int i = 0; i < result; i++) {
			System.out.print(nums[i] + " ");
		}

	}

}
