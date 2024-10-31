package leetCode.medium;

import leetCode.easy.TreeNode_1;

public class Insert_Into_Binary_Search_Tree_701 {

	public static void preOrderTraversal(TreeNode_1 root) {
		if(root == null) {
			return;
		}
		System.out.print(root.val+" ");
		preOrderTraversal(root.Left);
		preOrderTraversal(root.Right);
	}
	
	public static TreeNode_1 insertIntoBST(TreeNode_1 root, int val) {
		if(root == null) {
			return new TreeNode_1(val);
		}
		
		if(val < root.val) {
			root.Left = insertIntoBST(root.Left, val);
		}else {
			root.Right = insertIntoBST(root.Right, val);
		}
		
		return root;
	}
	
	public static void main(String[] args) {
		TreeNode_1 root = new TreeNode_1(4);
		root.Left = new TreeNode_1(2);
		root.Right = new TreeNode_1(7);
		root.Left.Left = new TreeNode_1(1);
		root.Left.Right = new TreeNode_1(3);
		
		int val = 5;
		TreeNode_1 insert = insertIntoBST(root, val);
		
		preOrderTraversal(insert);
	}

}
