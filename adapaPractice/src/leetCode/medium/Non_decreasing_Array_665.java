package leetCode.medium;

public class Non_decreasing_Array_665 {

	public static boolean checkPossibility(int[] nums) {
		int count = 0;
		
		for(int i = 0;i<nums.length-1;i++) {
			if(nums[i] > nums[i+1]) {
				count++;
				
				if(count > 1) {
					return false;
				}
				if(i == 0 || nums[i-1] <= nums[i+1]) {
					nums[i] = nums[i+1];
				}else {
					nums[i+1] = nums[i];
				}
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		int[] nums = {4,2,3};
		boolean result = checkPossibility(nums);
		
		System.out.println(result);
	}

}
