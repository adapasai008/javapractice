package leetCode.easy;

public class MoveZeroes {

	public static void main(String[] args) {
		
		int[] nums = {0,1,0,3,12};//output should be 1,3,12,0,0
		int zeroes = 0;
		for(int num : nums) {
			if(num != 0) {
				nums[zeroes] = num;
				zeroes++;
			}
		}
		
		while(zeroes < nums.length) {
			nums[zeroes] = 0;
			zeroes++;
		}
		
		for(int num : nums) {
			System.out.print(num+" ");
		}

	}

}
