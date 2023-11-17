package leetCode.easy;


import java.util.Scanner;

class NodeN{
	NodeN left, right;
	int data;
	
	public NodeN(int data) {
		this.data = data;
	}
}

public class BinaryTreeInorderdTraversal {

	static Scanner sc = null;
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		
		NodeN root = createTree();
		inOrder(root);
		System.out.println();
		preOrder(root);
		System.out.println();
		postOrder(root);
	}
	
	static NodeN createTree() {
		NodeN root = null;
		int data = sc.nextInt();
		System.out.println("Enter the data..");
		
		if(data == -1) return null;
		
		root = new NodeN(data);
		System.out.println("Enter left for " + data);
		root.left = createTree();
		
		System.out.println("Enter right for " + data);
		root.right = createTree();
			
		return root;
	}
	
	static void inOrder(NodeN root) {//left,node,right
		if(root == null) return;
		
		inOrder(root.left);
		System.out.print(root.data+ " ");
		inOrder(root.right);
	}
	static void preOrder(NodeN root) {//node,left,right
		if(root == null) return;
		
		System.out.print(root.data+ " ");
		inOrder(root.left);
		inOrder(root.right);
	}
	static void postOrder(NodeN root) {//left,right,node
		if(root == null) return;
		
		inOrder(root.left);
		inOrder(root.right);
		System.out.print(root.data+ " ");
	}
	
}

