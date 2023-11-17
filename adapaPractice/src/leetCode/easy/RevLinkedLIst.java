package leetCode.easy;

//class Node{
//
//	int data;
//	Node next;
//
//	Node(int data) {
//		this.data = data;
//		this.next = null;
//	}
//
//}

public class RevLinkedLIst {
	
	public ListNode reverse(ListNode head) {
		ListNode current = head;
		ListNode previous = null;
		
		while(current != null) {
			ListNode temp = current.nextNode;
			current.nextNode = previous;
			previous = current;
			current = temp;
		}
		return previous;
	}

	public static void main(String[] args) {
		ListNode head = new ListNode(4);
		head.nextNode = new ListNode(5);
		head.nextNode.nextNode = new ListNode(6);
		head.nextNode.nextNode.nextNode = new ListNode(7);
		head.nextNode.nextNode.nextNode.nextNode = new ListNode(8);

		RevLinkedLIst rev = new RevLinkedLIst();
		
		ListNode current =rev.reverse(head) ;
		
		while(current != null) {
			System.out.print(current.data+ " ");
			current = current.nextNode;
		}
		
	}

}
