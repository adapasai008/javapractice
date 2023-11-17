package DSA;

import java.util.Scanner;

class Node{
	Node left, right;
	int data;
	
	public Node(int data) {
		this.data = data;
	}
}

public class BinaryTreeImplementation {

	static Scanner sc = null;
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		
		Node root = createTree();
		inOrder(root);
		System.out.println();
		preOrder(root);
		System.out.println();
		postOrder(root);
	}
	
	static Node createTree() {
		Node root = null;
		int data = sc.nextInt();
		System.out.println("Enter the data..");
		
		if(data == -1) return null;
		
		root = new Node(data);
		System.out.println("Enter left for " + data);
		root.left = createTree();
		
		System.out.println("Enter right for " + data);
		root.right = createTree();
			
		return root;
	}
	
	static void inOrder(Node root) {//left,node,right
		if(root == null) return;
		
		inOrder(root.left);
		System.out.print(root.data+ " ");
		inOrder(root.right);
	}
	static void preOrder(Node root) {//node,left,right
		if(root == null) return;
		
		System.out.print(root.data+ " ");
		inOrder(root.left);
		inOrder(root.right);
	}
	static void postOrder(Node root) {//left,right,node
		if(root == null) return;
		
		inOrder(root.left);
		inOrder(root.right);
		System.out.print(root.data+ " ");
	}
	
}
