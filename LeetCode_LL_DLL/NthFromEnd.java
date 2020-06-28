package LeetCode_LL_DLL;


public class NthFromEnd {
	
	static MyLinkedList getNtNodeFromEnd(MyLinkedList head, int count){
		
		MyLinkedList slow = head;
		MyLinkedList fast = head;
		
		int countR = 0;
		while(countR != count) {
			System.out.println();
			fast = fast.next;
			countR++;
		}
		System.out.println("fast value "+fast.value);
		
		while(fast != null) {
			fast = fast.next;
			slow= slow.next;
		}
		
		
		return slow;
		
	}
	public static void main(String[] args) {
		MyLinkedList l1 = new MyLinkedList();
		MyLinkedList head = l1.addAtHead(1);
		l1.addAtTail(2);
		l1.addAtTail(3);
		l1.addAtTail(4);
		l1.addAtTail(5);
		l1.printLinkedList();
		System.out.println(getNtNodeFromEnd(head,2).value);

	}
	

}
