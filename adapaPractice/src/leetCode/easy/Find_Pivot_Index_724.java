package leetCode.easy;

public class Find_Pivot_Index_724 {

    public static int pivotIndex(int[] nums) {
    	int totalSum = 0;
    	
    	for(int num : nums) {
    		totalSum += num;
    	}
    	
    	int leftSum = 0;
    	
    	for(int i=nums.length-1;i>=0;i--) {
    		if(leftSum == totalSum -leftSum - nums[i]) {
    			return i;
    		}
    		leftSum += nums[i];
    	}
    	
    	return -1;
    }
	
	public static void main(String[] args) {
		int[] nums = {1,7,3,6,5,6};
		
		System.out.println(pivotIndex(nums));

	}

}
