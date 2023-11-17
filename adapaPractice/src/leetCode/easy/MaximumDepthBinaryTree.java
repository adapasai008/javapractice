package leetCode.easy;

import java.util.Scanner;

class NodeT{
	int data;
	NodeT right, left;
	
	public NodeT(int data) {
		this.data = data;
	}
}

public class MaximumDepthBinaryTree {

	static Scanner sc = null;
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		NodeT root = createTree();
		int result = maxDepth(root);
		System.out.println("MaxDepth = "+result);

	}
	static NodeT createTree() {
		NodeT root = null;
		int data = sc.nextInt();
		System.out.println("Enter the data");
		
		if(data == -1) return null;
		
		root = new NodeT(data);
		System.out.println("Enter for left data : "+data );
		root.left = createTree();
		
		System.out.println("Enter for right data : "+data);
		root.right = createTree();
		
		return root;
	}
	
     static int maxDepth(NodeT root) {
		if(root == null) {
			return 0;
		}
		
		int leftDepth = maxDepth(root.left);
		int rightDepth = maxDepth(root.right);
		
		return Math.max(leftDepth, rightDepth)+1;
	}
}
