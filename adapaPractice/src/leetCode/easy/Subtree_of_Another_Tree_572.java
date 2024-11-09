package leetCode.easy;

public class Subtree_of_Another_Tree_572 {

    public static boolean isSubtree(TreeNode_1 root, TreeNode_1 subRoot) {
    	if(root == null) {
    		return false;
    	}
    	
    	if(isSameTree(root, subRoot)) {
    		return true;
    	}
    	
    	return isSubtree(root.Left, subRoot) || isSubtree(root.Right, subRoot);
    	
    }
    public static boolean isSameTree(TreeNode_1 t, TreeNode_1 s) {
    	if( t == null && s == null) {
    		return true;
    	}
    	
    	if(t == null || s == null || t.val != s.val) {
    		return false;
    	}
    	
    	return isSameTree(t.Left, s.Left) && isSameTree(t.Right, s.Right);
    }
	
	public static void main(String[] args) {
		TreeNode_1 root = new TreeNode_1(3);
		root.Left = new TreeNode_1(4);
		root.Right = new TreeNode_1(5);
		root.Left.Left = new TreeNode_1(1);
		root.Left.Right = new TreeNode_1(2);
		
		TreeNode_1 subRoot = new TreeNode_1(4);
		subRoot.Left = new TreeNode_1(1);
		subRoot.Right = new TreeNode_1(2);
		
		boolean result = isSubtree(root, subRoot);
		
		System.out.println(result);

	}

}
