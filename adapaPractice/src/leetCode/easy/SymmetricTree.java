package leetCode.easy;

import java.util.Scanner;

class Node{
	int data;
	Node right, left;
	
	public Node(int data) {
		this.data = data;
	}
}

public class SymmetricTree {

	static Scanner sc = null;
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		Node root = createTree();
		boolean isSymmetric = symmetric(root.left, root.right);
		System.out.println("The binary tree is symmetric : " + isSymmetric);

	}
	static Node createTree() {
		Node root = null;
		int data = sc.nextInt();
		System.out.println("Enter the data");
		
		if(data == -1) return null;
		
		root = new Node(data);
		System.out.println("Enter for left data : "+data );
		root.left = createTree();
		
		System.out.println("Enter for right data : "+data);
		root.right = createTree();
		
		return root;
	}

	   static boolean symmetric(Node left,Node right) {
       if(left == null && right == null) {
    	   return true;  
       }
       if(left == null || right == null || left.data != right.data) {
    	   return false;
       }
       
       return symmetric(left.left, right.right)&&symmetric(left.right, right.left);
		
	}
}
