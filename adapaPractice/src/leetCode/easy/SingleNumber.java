package leetCode.easy;

public class SingleNumber {

	public static void main(String[] args) {
		//should print the non-repeating number;
		
		int[] nums = {1,2,2,3};
		
		for(int i=0;i<nums.length;i++) {
			int non = nums[i];
			int count = 0;
			for(int j=0;j<nums.length;j++) {
				if(non == nums[j]) {
					count++;
				}
			}
			if(count == 1) {
				System.out.print(nums[i]+" ");
			}
		}
		
		
		
	}
}
