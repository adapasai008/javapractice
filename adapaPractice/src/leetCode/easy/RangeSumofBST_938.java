package leetCode.easy;

public class RangeSumofBST_938 {
	
	public static int rangeSumBST(TreeNode_1 root, int low, int high) {
		if(root == null) {
			return 0;
		}
		
		if(root.val >= low && root.val <= high) {
			return root.val + rangeSumBST(root.Right, low, high) + rangeSumBST(root.Left, low, high) ;
		}else if(root.val < low) {
			return rangeSumBST(root.Right, low, high);
		}
		return rangeSumBST(root.Left, low, high);
	}

	public static void main(String[] args) {
		
		TreeNode_1 root = new TreeNode_1(10);
		root.Left = new TreeNode_1(5);
		root.Right = new TreeNode_1(15);
		root.Left.Left = new TreeNode_1(3);
		root.Left.Right = new TreeNode_1(7);
		root.Right.Right = new TreeNode_1(18);

		int low = 7;
		int high = 15;
		int sum = rangeSumBST(root, low, high);
		
		System.out.println(sum);
	}

}
