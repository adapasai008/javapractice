package interview_prep_2026;

public class Repeating_Numbers_count_29 {

	public static void main(String[] args) {

		int[] nums = {1, 0, 1, 1, 0, 1, 1, 1, 1, 0, 1};
		
		int left = 0;
		int maxCount = 0;
		
		for(int i=0; i< nums.length;i++) {
			
			if(nums[left] == nums[i]) {
				maxCount = Math.max(maxCount, (i - left)+1);
			}else {
				left = i;
			}
		}
		
		System.out.println(maxCount);
		
	}

}
