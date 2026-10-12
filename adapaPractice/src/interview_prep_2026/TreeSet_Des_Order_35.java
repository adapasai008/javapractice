package interview_prep_2026;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSet_Des_Order_35 {

	/*
	 * To print the TreeSet in the descending order using comparator and without
	 * using
	 */
	public static void main(String[] args) {

		//TreeSet<Integer> nums = new TreeSet<Integer>(Comparator.reverseOrder());
		TreeSet<Integer> nums = new TreeSet<Integer>();
		
		nums.add(10);
		nums.add(40);
		nums.add(30);
		nums.add(60);
		nums.add(10);
		nums.add(20);
		nums.add(50);
		
		System.out.println(nums);
		
		System.out.println(nums.descendingSet());
		
	}

}
