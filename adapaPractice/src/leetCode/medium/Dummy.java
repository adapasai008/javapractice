package leetCode.medium;

public class Dummy {
	
	public static int removeDuplicates(int[] nums) {
		
		int start = 0;
		int travel = 1;
		int answer = 1;
		
		while(travel < nums.length) {
			if(nums[start] != nums[travel]) {
				nums[answer] = nums[travel];
				start = travel;
				answer++;
				
			}
			travel++;
			
		}
		
		return answer;
		
	}

	public static void main(String[] args) {

		int[] nums = {0,0,1,1,1,2,2,3,3,4};
		
		int result = removeDuplicates(nums);
		
		System.out.println("Total unique numbers: "+result);
		
		for(int i=0;i<result;i++) {
			System.out.print(nums[i]+" ");
		}
	}

}
