package geeksForGeeksCode.String;

class ListNode {
	int data;
	ListNode next;

	ListNode(int data) {
		this.data = data;
		this.next = null;
	}
}

public class LinkedListMiddle {

	public static void main(String[] args) {
		ListNode head = new ListNode(2);
		head.next = new ListNode(4);
		head.next.next = new ListNode(9);
		head.next.next.next = new ListNode(3);
		head.next.next.next.next = new ListNode(1);

		ListNode slow = head;
		ListNode fast = head;

		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		System.out.println(slow.data);

	}

}
