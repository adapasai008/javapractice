package geeksForGeeksCode.String;

class InsertSolution{
	static  ListNode  insert(ListNode head, int key) {//42 (30,50,65,70)
		ListNode newNode = new ListNode(key);
		
		if(head == null || key < head.data) {
			newNode.next = head;
			return newNode;
		}
		
		ListNode curr = head;
		
		while(curr.next != null && key > curr.next.data) {
			curr = curr.next;
		}
		newNode.next = curr.next;
		curr.next = newNode;
		
		return head;
	}
}

public class InsertSortList {

	public static void main(String[] args) {
		ListNode head = new ListNode(30);
		head.next = new ListNode(50);
		head.next.next = new ListNode(65);
		head.next.next.next = new ListNode(70);
		
		ListNode curr = InsertSolution.insert(head, 63);
		
		while(curr != null) {
			System.out.print(curr.data+" ");
			curr = curr.next;
		}
		

	}

}
