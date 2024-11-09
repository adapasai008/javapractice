package leetCode.easy;

public class Invert_Binary_Tree_226 {

	public static void treeTraversal(TreeNode_1 root) {
		if(root == null) {
			return;
		}
		System.out.print(root.val + " ");
		treeTraversal(root.Left);
		treeTraversal(root.Right);
	}
	
	public static void main(String[] args) {
		TreeNode_1 root = new TreeNode_1(4);
		root.Left = new TreeNode_1(2);
		root.Right = new TreeNode_1(7);
		root.Left.Left = new TreeNode_1(1);
		root.Left.Right = new TreeNode_1(3);
		root.Right.Left = new TreeNode_1(6);
		root.Right.Right = new TreeNode_1(9);
		
		treeTraversal(root);
	}

}
