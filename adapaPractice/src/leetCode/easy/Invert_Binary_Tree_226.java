package leetCode.easy;

import java.util.LinkedList;
import java.util.Queue;

public class Invert_Binary_Tree_226 {

    public static TreeNode_1 invertTree(TreeNode_1 root) {
    	if(root == null) {
    		return null;
    	}
    	
    	TreeNode_1 temp = root.Left;
    	root.Left = root.Right;
    	root.Right = temp;
    	
    	invertTree(root.Left);
    	invertTree(root.Right);
    	
    	return root;
        
    }
	
	public static void levelOrderTraversal(TreeNode_1 root) {
		if(root == null) {
			return;
		}
		Queue<TreeNode_1> queue = new LinkedList<TreeNode_1>();
		queue.add(root);
		
		while(!queue.isEmpty()) {
			TreeNode_1 current = queue.poll();
			System.out.print(current.val + " ");
			
			if(current.Left != null) queue.add(current.Left);
			if(current.Right != null) queue.add(current.Right);
		}
	}
	
	public static void main(String[] args) {
		TreeNode_1 root = new TreeNode_1(4);
		root.Left = new TreeNode_1(2);
		root.Right = new TreeNode_1(7);
		root.Left.Left = new TreeNode_1(1);
		root.Left.Right = new TreeNode_1(3);
		root.Right.Left = new TreeNode_1(6);
		root.Right.Right = new TreeNode_1(9);
		
		levelOrderTraversal(root);
		
		TreeNode_1 invertRoot = invertTree(root);
		
		System.out.println();
		
		levelOrderTraversal(invertRoot);
	}

}
