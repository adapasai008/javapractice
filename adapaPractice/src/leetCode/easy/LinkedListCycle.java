package leetCode.easy;

class ListNode {
	
	int data;
	ListNode nextNode;
	
	ListNode(int data){
		this.data = data;
		this.nextNode = null;
	}
}

public class LinkedListCycle {

	public boolean hasCycle(ListNode head) {
	
		ListNode slow = head, fast = head;
		
		while(fast != null && fast.nextNode != null) {
			fast = fast.nextNode.nextNode;
			slow = slow.nextNode;
			
			if(slow == fast) {
				return true;
			}
		}
		return false;
		
	}
	
	public static void main(String[] args) {
		
		//creating the linked list with cycle
		ListNode head = new ListNode(5);
		head.nextNode = new ListNode(4);
		head.nextNode.nextNode = new ListNode(3);
		head.nextNode.nextNode.nextNode = new ListNode(8);
		head.nextNode.nextNode.nextNode.nextNode = head.nextNode; // creating the cycle;
		
		LinkedListCycle solution = new LinkedListCycle();
		
		boolean hasCycle = solution.hasCycle(head);
		System.out.println("It has the cycle = "+hasCycle);
		
      //To Iterate the values.		
//		ListNode current = head;
//		
//		while(current != null) {
//			System.out.println(current.data+" ");
//			current = current.nextNode;
//		}

	}

}
