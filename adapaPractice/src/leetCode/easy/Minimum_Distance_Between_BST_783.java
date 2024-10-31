package leetCode.easy;

public class Minimum_Distance_Between_BST_783 {

	static int minVal = Integer.MAX_VALUE;
	static Integer preVal = null;
	
    public static int minDiffInBST(TreeNode_1 root) {
        inOrder(root);
        return minVal;
    }
    
    public static void inOrder(TreeNode_1 root) {
    	if(root == null) {
    		return;
    	}
    	inOrder(root.Left);
    	
    	if(preVal != null) {
    		minVal = Math.min(minVal, root.val - preVal);
    	}
    	
    	preVal = root.val;
    	
    	inOrder(root.Right);
    }
	
	public static void main(String[] args) {
		TreeNode_1 root = new TreeNode_1(4);
		root.Left = new TreeNode_1(2);
		root.Right = new TreeNode_1(6);
		root.Left.Left = new TreeNode_1(1);
		root.Left.Right = new TreeNode_1(3);
		
		int val = minDiffInBST(root);
		System.out.println(val);
	}

}
