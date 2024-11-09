package leetCode.medium;

import leetCode.easy.TreeNode_1;

public class Trim_Binary_Search_Tree_669 {

	public static TreeNode_1 trimBST(TreeNode_1 root, int low, int high) {
		if(root == null) {
			return null;
		}
		
		if(root.val < low) {
			return trimBST(root.Right, low, high);
		}
		if(root.val > high) {
			return trimBST(root.Left, low, high);
		}
		
		root.Left = trimBST(root.Left, low, high);
		root.Right = trimBST(root.Right, low, high);
		
		return root;
	}

	public static void preOrder(TreeNode_1 root) {
		if (root == null) {
			return;
		}

		System.out.print(root.val + " ");
		preOrder(root.Left);
		preOrder(root.Right);
	}

	public static void main(String[] args) {
		TreeNode_1 root = new TreeNode_1(3);
		root.Left = new TreeNode_1(0);
		root.Right = new TreeNode_1(4);
		root.Left.Right = new TreeNode_1(2);
		root.Left.Right.Left = new TreeNode_1(1);

		TreeNode_1 root1 =  trimBST(root, 1, 4);

		preOrder(root1);

	}

}
