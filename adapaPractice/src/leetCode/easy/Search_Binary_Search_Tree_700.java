package leetCode.easy;

public class Search_Binary_Search_Tree_700 {
	public static void inOrderTraversal(TreeNode_1 root) {
		if (root == null) {
			return;
		}
		inOrderTraversal(root.Left);
		System.out.print(root.val+" ");
		inOrderTraversal(root.Right);
	}
	public static TreeNode_1 searchBST(TreeNode_1 root, int val) {
		if(root == null || root.val == val) {
			return root;
		}
		if(val > root.val) {
			return searchBST(root.Right, val);
		}else {
			return searchBST(root.Left, val);
		}
	}

	public static void main(String[] args) {
		TreeNode_1 root = new TreeNode_1(4);
		root.Left = new TreeNode_1(2);
		root.Right = new TreeNode_1(7);
		root.Left.Left = new TreeNode_1(1);
		root.Left.Right = new TreeNode_1(3);

		int val = 2;
		TreeNode_1 result = searchBST(root, val);
		inOrderTraversal(result);
	

	}

}
