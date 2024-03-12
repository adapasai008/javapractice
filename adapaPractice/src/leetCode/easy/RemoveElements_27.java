package leetCode.easy;

public class RemoveElements_27 {

	public static int removeElement(int[] nums,int val) {
		int i=0;
		int count = 0;
		
		while(i<nums.length) {
			if(nums[i] != val) {
				nums[count] = nums[i];
				count++;
			}
			i++;
		}
		return count;
	}
	
	public static void main(String[] args) {
		int[] nums = {3,2,2,3,5,8,9,3};
		int val = 3;
		
		int result = removeElement(nums, val);
		
		for(int i=0; i<result;i++) {
			System.out.print(nums[i]+" ");
		}
	}

}
/*
 * The time complexity of this code is O(n) because I have used only one loop to iterate the given array
 * And the space complexity is O(1) because it's justs using constant space
 */
