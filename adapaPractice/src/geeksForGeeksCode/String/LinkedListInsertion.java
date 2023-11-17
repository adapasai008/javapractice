package geeksForGeeksCode.String;

class LinkedList{
	ListNode head;//already listNode class is created here I am using that class;
	
	LinkedList(){
		head = null;
	}
	
	void insertAtBegining(int data) {
		ListNode newNode = new ListNode(data);
		newNode.next = head;
		head = newNode;
	}
	void insertAtEnd(int data) {
		ListNode newNode = new ListNode(data);
		
		if(head == null) {
			head = newNode;
			return;
		}
		
		ListNode ptr = head;
		
		while(ptr.next != null) {
			ptr = ptr.next;
		}
		
		ptr.next = newNode;
	}
	
	void display() {
		ListNode curr = head;
		
		while(curr != null) {
			System.out.print(curr.data+" ");
			curr = curr.next;
		}
		System.out.println();
	}
	
}

public class LinkedListInsertion {

	public static void main(String[] args) {
		LinkedList  list = new LinkedList();
		list.insertAtBegining(3);
		list.insertAtBegining(2);
		list.insertAtBegining(1);
		
		list.insertAtEnd(4);
		list.insertAtEnd(5);
		
		list.display();

	}

}
