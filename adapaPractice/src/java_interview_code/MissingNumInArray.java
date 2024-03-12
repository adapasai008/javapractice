package java_interview_code;

public class MissingNumInArray {

	public static void main(String[] args) {
		int[] nums = {1,3,2,4,6,7};
		int len = nums.length+1;
		
		int totalSum = len*(len+1)/2;
		
		int sum = 0;
		
		for(int n : nums) {
			sum = sum+n;
		}
		
		int missing = totalSum - sum;
		
		System.out.println("Missing Num = "+missing);

	}

}
