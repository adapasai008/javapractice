package leetCode.easy;

public class Longest_Continuous_Increasing_Subsequence_674 {

    public static int findLengthOfLCIS(int[] nums) {
    	
    	if(nums == null || nums.length == 0) {
    		return 0;
    	}
    	
    	int count = 1;
    	int maxCount = 1;
    	
    	for(int i=1;i<nums.length;i++) {
    		if(nums[i] > nums[i-1]) {
    			count++;
    			maxCount = Math.max(maxCount, count);
    		}else {
    			count = 1;
    		}
    	}
    	return maxCount;
    }
	
	public static void main(String[] args) {
		int[] nums = {1,3,5,4,2,3,4,5};
		int lcis = findLengthOfLCIS(nums);
		
		System.out.println(lcis);
	}

}
