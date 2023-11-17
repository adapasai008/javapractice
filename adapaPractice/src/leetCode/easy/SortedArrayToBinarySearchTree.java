package leetCode.easy;

import java.util.Arrays;

class TreeNode{
	int data;
	TreeNode left, right;
	
	public TreeNode(int data) {
		this.data = data;
	}
}

public class SortedArrayToBinarySearchTree {

	public static void main(String[] args) {
		int[] nums = {-10,5,-3,9,0};
		
		Arrays.sort(nums);
		
		for(int i : nums) {
			System.out.print(i+" ");
		}
		
		 createTree(nums,0,nums.length-1);
	}
	
	static TreeNode createTree(int[] nums,int left, int right) {
		if(left > right) {
			return null;
		}
		
		int mid = left + (right - left)/2;
		TreeNode bst = new TreeNode(mid);
		
		bst.left = createTree(nums, left, mid-1);
		bst.right = createTree(nums, mid+1, right);
		return bst;
	}
	
}
