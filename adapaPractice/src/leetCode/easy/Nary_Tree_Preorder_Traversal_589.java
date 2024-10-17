package leetCode.easy;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class Root {
	public int val;
	public List<Root> children;

	public Root() {
	}

	public Root(int val) {
		this.val = val;
		this.children = new ArrayList<>();
	}

	public Root(int val, List<Root> children) {
		this.val = val;
		this.children = children;
	}
}

public class Nary_Tree_Preorder_Traversal_589 {

	public List<Integer> preorder(Root root) {
		List<Integer> result = new ArrayList<>();
		traversePreorder(root, result);
		return result;
	}

	private void traversePreorder(Root root, List<Integer> result) {
		if (root == null)
			return;

		result.add(root.val);

		for (Root child : root.children) {
			traversePreorder(child, result);
		}
	}

	public List<Integer> iterativePreorder(Root root) {
		List<Integer> result = new ArrayList<>();
		if (root == null)
			return result;

		Stack<Root> stack = new Stack<>();
		stack.push(root);

		while (!stack.isEmpty()) {
			Root current = stack.pop();
			result.add(current.val);

			for (int i = current.children.size() - 1; i >= 0; i--) {
				stack.push(current.children.get(i));
			}
		}

		return result;
	}

	public static void main(String[] args) {

		Root node5 = new Root(5);
		Root node6 = new Root(6);
		List<Root> childrenOfNode3 = new ArrayList<>();
		childrenOfNode3.add(node5);
		childrenOfNode3.add(node6);
		Root node3 = new Root(3, childrenOfNode3);

		Root node2 = new Root(2);
		Root node4 = new Root(4);

		List<Root> childrenOfRoot = new ArrayList<>();
		childrenOfRoot.add(node3);
		childrenOfRoot.add(node2);
		childrenOfRoot.add(node4);
		Root root = new Root(1, childrenOfRoot);

		Nary_Tree_Preorder_Traversal_589 solution = new Nary_Tree_Preorder_Traversal_589();

		System.out.println("Recursive Preorder Traversal: " + solution.preorder(root));

		System.out.println("Iterative Preorder Traversal: " + solution.iterativePreorder(root));
	}
}
