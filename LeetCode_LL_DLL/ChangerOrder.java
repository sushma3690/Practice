package LeetCode_LL_DLL;


public class ChangerOrder {

	public static MyLinkedList oddEvenList(MyLinkedList head) {

		MyLinkedList firstEvenNode = head.next;

		MyLinkedList curr = head;
		MyLinkedList prev = head;
		int count = 1;
		while(curr != null) {
			MyLinkedList next = curr.next;
			if(count%2==1 && next==null) {
				curr.next = firstEvenNode;
			}else {
				if(next != null) {
					curr.next=next.next;
				}
				if(count %2==0 && next== null) {
					prev.next = firstEvenNode;
				}
			}
			prev = curr;
			curr=next;
			count++;

		}




		return head;


	}

	public static void main(String[] args) {
		MyLinkedList l1 = new MyLinkedList();
		MyLinkedList head = l1.addAtHead(1);
		l1.addAtTail(2);
		l1.addAtTail(3);
		l1.addAtTail(4);
		l1.addAtTail(5);
		l1.addAtTail(6);
		l1.addAtTail(7);
		l1.addAtTail(8);

		l1.printLinkedList();
		System.out.println(" First time end");
		oddEvenList(head);
		l1.printLinkedList();


	}

}
