package leetCode.easy;

class ListNode {
	int data;
	ListNode nextNode;

	ListNode(int data) {
		this.data = data;
		this.nextNode = null;
	}
}

class Palindrome {

	public boolean isPalindrome(ListNode head) {

		if (head == null) {
			return true;
		}

		ListNode slow = head;
		ListNode fast = head;

		while (fast != null && fast.nextNode != null) {
			slow = slow.nextNode;
			fast = fast.nextNode.nextNode;
		}

		ListNode curr = slow;
		ListNode prev = null;

		while (curr != null) {
			ListNode temp = curr.nextNode;
			curr.nextNode = prev;
			prev = curr;
			curr = temp;
		}
		ListNode first = head;
		ListNode second = prev;

		while (first != null && second != null) {
			if (first.data != second.data) {
				return false;
			}
			first = first.nextNode;
			second = second.nextNode;
		}
		return true;

	}

}

public class PalindromeLinkedList {

	public static void main(String[] args) {
		ListNode head = new ListNode(1);
		head.nextNode = new ListNode(1);
		head.nextNode.nextNode = new ListNode(3);
		head.nextNode.nextNode.nextNode = new ListNode(1);
		head.nextNode.nextNode.nextNode.nextNode = new ListNode(1);

		Palindrome isPalin = new Palindrome();

		boolean result = isPalin.isPalindrome(head);

		System.out.println("Given LinkedList is Palindrome = " + result);

	}

}
