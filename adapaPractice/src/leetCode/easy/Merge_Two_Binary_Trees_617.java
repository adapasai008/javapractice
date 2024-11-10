package leetCode.easy;

import java.util.LinkedList;
import java.util.Queue;

public class Merge_Two_Binary_Trees_617 {
	
    public static TreeNode_1 mergeTrees(TreeNode_1 root1, TreeNode_1 root2) {
        if(root1 == null && root2 == null) {
        	return null;
        }
        
        if(root1 == null) return root2;
        if(root2 == null) return root1;
        
        root1.val += root2.val;
        
        root1.Left = mergeTrees(root1.Left, root2.Left);
        root1.Right = mergeTrees(root1.Right, root2.Right);
        
        return root1;
    }
    
    public static void inOrderTraversal(TreeNode_1 root) {
    	if(root == null) {
    		return;
    	}
    	
    	Queue<TreeNode_1> queue = new LinkedList<>();
    	queue.add(root);
    	
    	while(!queue.isEmpty()) {
    		TreeNode_1 current = queue.poll();
    		System.out.print(current.val + " ");
    		
    		if(current.Left != null) queue.add(current.Left);
    		if(current.Right != null) queue.add(current.Right);
    	}
    }

	public static void main(String[] args) {
		TreeNode_1 root1 = new TreeNode_1(1);
		root1.Left = new TreeNode_1(3);
		root1.Right = new TreeNode_1(2);
		root1.Left.Left = new TreeNode_1(5);
		
		TreeNode_1 root2 = new TreeNode_1(2);
		root2.Left = new TreeNode_1(1);
		root2.Right = new TreeNode_1(3);
		root2.Left.Right = new TreeNode_1(4);
		root2.Right.Right = new TreeNode_1(7);
		
		TreeNode_1 merge = mergeTrees(root1, root2);
		
		inOrderTraversal(merge);

	}

}
