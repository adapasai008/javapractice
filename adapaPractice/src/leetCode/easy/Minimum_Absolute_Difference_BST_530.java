package leetCode.easy;

public class Minimum_Absolute_Difference_BST_530 {

	static int minDiff = Integer.MAX_VALUE; //I am accessing the var inside the static method so the var should be static.
	static Integer prev = null;
	
	public static int getMinimumDifference(TreeNode_1 root) {
		inOrdertraversal(root);
		return minDiff;
	}
	public static void inOrdertraversal(TreeNode_1 root) {
		if(root == null) {
			return;
		}
		
		inOrdertraversal(root.Left);
		
		if(prev != null) {
			minDiff = Math.min(minDiff,root.val-prev);
		}
		prev = root.val;
		
		inOrdertraversal(root.Right);
		
	}
	
	public static void main(String[] args) {
		TreeNode_1 root = new TreeNode_1(4);
		root.Left = new TreeNode_1(2);
		root.Right = new TreeNode_1(6);
		root.Left.Left = new TreeNode_1(1);
		root.Left.Right = new TreeNode_1(3);
		
		System.out.println(getMinimumDifference(root));

	}

}
