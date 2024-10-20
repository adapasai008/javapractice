package leetCode.easy;

import java.util.PriorityQueue;

class Kth_minHeap{
	
	PriorityQueue<Integer> nums;
	int k;
	
	public Kth_minHeap(int k, int[] nums) {
		this.k = k;
		this.nums = new PriorityQueue<>();
		
		for(int num : nums) {
			add(num);
		}
	}
	
	public int add(int val) {
		nums.offer(val);
		
		if(nums.size() > k) {
			nums.poll();
		}
		
		return nums.peek();
	}
	
}

public class Kth_Largest_MinHeap_703 {

	public static void main(String[] args) {
		int[] values = {4, 5, 8, 2};
		int k = 3;
		Kth_minHeap minHeap = new Kth_minHeap(k, values);
		System.out.println(minHeap.add(3));
		System.out.println(minHeap.add(5));
		System.out.println(minHeap.add(10));
		System.out.println(minHeap.add(9));

	}

}
