package leetCode.easy;

public class TreeNode_1 {
	public int val;
	public TreeNode_1 Left;
	public TreeNode_1 Right;

	public TreeNode_1() {

	}

	public TreeNode_1(int val) {
		this.val = val;
	}

	public TreeNode_1(int val, TreeNode_1 left, TreeNode_1 right) {
		this.val = val;
		this.Left = left;
		this.Right = right;
	}
}
