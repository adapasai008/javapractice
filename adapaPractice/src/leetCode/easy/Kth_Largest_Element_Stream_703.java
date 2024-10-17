package leetCode.easy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Kth_Largest{
	int k;
	List<Integer> nums;
	
	public Kth_Largest(int k, int[] nums) {
		this.k = k;
		this.nums = new ArrayList<Integer>();
		
		for(int num : nums) {
			this.nums.add(num);
		}
	}
	
	public int add(int val) {
		nums.add(val);
		
		Collections.sort(nums);
		
		return nums.get(nums.size()-k);
	}
}

public class Kth_Largest_Element_Stream_703 {

	public static void main(String[] args) {
		int[] num = {4, 5, 8, 2};//23458

		Kth_Largest kLargest = new Kth_Largest(3,num);
		
		System.out.println(kLargest.add(3));
		System.out.println(kLargest.add(5));
		System.out.println(kLargest.add(10));
		System.out.println(kLargest.add(9));
		

	}

}
