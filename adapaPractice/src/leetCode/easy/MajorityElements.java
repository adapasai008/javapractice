package leetCode.easy;

public class MajorityElements {

	public static void main(String[] args) {

		int[] nums = {2,2,1,1,1,2,2};// print the which character is repeating more.

		int count = 0;
		int repeating = 0;
		
		for(int num : nums) {
			
			if(count == 0) {
				repeating = num;
			}
			if(num == repeating) {
				count++;
			}else {
				count--;
			}
			
		}
		
		System.out.println("Repeating num = "+ repeating);

	}

}
