package leetCode.medium;

class ListNode{
	ListNode next;
	int data;
	
	ListNode(int data){
		this.data = data;
		this.next = null;
	}
}

class Reverse{
	
	public static ListNode reverse(ListNode head, int left, int right) {//1,2,3,4,5
		
	    // create a dummy node to mark the head of this list
	    ListNode dummy = new ListNode(0);
	    dummy.next = head;
		
	    // make markers for currentNode and for the node before reversing
	    ListNode leftPre = dummy;
	    ListNode currNode = head;

	    for (int i = 0; i < left - 1; i++) {
	      leftPre = leftPre.next;
	      currNode = currNode.next;
	    }

	    // make a marker to node where we start reversing
	    ListNode subListHead = currNode;

	    ListNode preNode = null;
	    for (int i = 0; i <= right - left; i++) {
	      ListNode nextNode = currNode.next;
	      currNode.next = preNode;
	      preNode = currNode;
	      currNode = nextNode;
	    }

	    // Join the pieces
	    leftPre.next = preNode;
	    subListHead.next = currNode;

	    return dummy.next;
		
		
	}
	
}

public class ReverseLinkedListII {

	public static void main(String[] args) {
		ListNode head = new ListNode(1);
		head.next = new ListNode(2);
		head.next.next = new ListNode(3);
		head.next.next.next = new ListNode(4);
		head.next.next.next.next = new ListNode(5);
		
		int left = 2;
		int right = 4;
		
		ListNode curr = Reverse.reverse(head, left, right);
		
		while(curr != null) {
			System.out.print(curr.data+" ");
			curr = curr.next;
		}
		
	}

}
