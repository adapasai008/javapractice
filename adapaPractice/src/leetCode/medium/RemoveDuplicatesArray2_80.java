package leetCode.medium;

public class RemoveDuplicatesArray2_80 {

	public static int removeDuplicates(int[] nums) {
		int index = 2;
		
		for(int i=2;i<nums.length;i++) {
			if(nums[i] != nums[index-2]) {
				nums[index] = nums[i];
				index++;
			}
		}
		return index;
	}
	
	public static void main(String[] args) {

		int[] nums  = {1,1,1,2,2,3};
		int result = removeDuplicates(nums);
		
		for(int i=0;i<result;i++) {
			System.out.print(nums[i]+" ");
		}
		
	}

}

/* 
 * The time complexity of this code is "O(n)" because the algorithm travers through the array only once using the for loop n times
 * And the space complexity is "O(1)" because the algorithm modifies the array wihtout using any extra data structures
 */
