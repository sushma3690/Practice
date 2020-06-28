package LeetCode_LL_DLL;


public class AddTwoNumbers {

	public static MyLinkedList reverse(MyLinkedList head) {

		MyLinkedList prev = null;
		while(head != null) {
			MyLinkedList next = head.next;
			head.next=prev;
			prev=head;
			head=next;
		}
		return prev;

	}

	public static 	MyLinkedList addTwoNumbers(	MyLinkedList l1, 	MyLinkedList l2) {

		System.out.println();
		if(l1==null) {
			return l2;
		}else if(l2==null) {
			return l1;
		}
		MyLinkedList start = null;
		MyLinkedList prev = null;
		MyLinkedList revOne = reverse(l1);
		MyLinkedList node = revOne;
		while(node != null) {
			System.out.print(node.value+" ----> ");
			node = node.next;
		}
		System.out.println();
		MyLinkedList node1 = l2;
		while(node1 != null) {
			System.out.print(node1.value+" ----> ");
			node1 = node1.next;
		}

		//MyLinkedList revTwo = reverse(l2);
		System.out.println();
		int carry = 0;
		MyLinkedList node2 = l2;
		while(revOne != null && node2 != null) {

			MyLinkedList newNode = new MyLinkedList();
			int sum = revOne.value+node2.value+carry;
			
			System.out.println(" sum "+ sum);
			if(sum >= 10) {
				carry=1;
				sum = sum-10;
			}else {
				carry=0;
			}
			newNode.value = sum;
			if(prev == null) {
				prev = newNode;
				start = prev;
			}else {
				prev.next = newNode;
				prev = prev.next;
			}
			revOne = revOne.next;
			node2 = node2.next;
		}

		while(revOne != null) {

			MyLinkedList newNode = new MyLinkedList();
			int sum = revOne.value+carry;
			if(sum > 10) {
				carry=1;
				sum = sum-10;
			}else {
				carry=0;
			}
			newNode.value = sum;
			if(prev == null) {
				prev = newNode;
				start = prev;
			}else {
				prev.next = newNode;
				prev = prev.next;

			}
			revOne = revOne.next ;
		}

		while(node2 != null) {
			MyLinkedList newNode = new MyLinkedList();
			int sum = node2.value+carry;
			if(sum > 10) {
				carry=1;
				sum = sum-10;
			}else {
				carry=0;
			}
			newNode.value = sum;
			if(prev == null) {
				prev = newNode;
				start = prev;
			}else {
				prev.next = newNode;
				prev = prev.next;

			}
			node2 = node2.next;
		}
		
	
		MyLinkedList str = start;
		while(str != null) {
			System.out.print(str.value+" ----> ");
			str = str.next;
		}
		MyLinkedList rev = reverse(start);
		
		
		/*
		 * if(carry==1) { MyLinkedList newNode = new MyLinkedList();
		 * newNode.value=carry; rev.next=newNode; }
		 */
		 
		  
		return rev;

	}

	public static void main(String[] args) {
		MyLinkedList l1 = new MyLinkedList();
		/*MyLinkedList head1 = l1.addAtHead(5);
		l1.addAtTail(6);
		l1.addAtTail(4);
		l1.addAtTail(3);
		l1.addAtTail(2);
		l1.addAtTail(1);*/
		/*MyLinkedList head1 = l1.addAtHead(2);
		l1.addAtTail(4);
		l1.addAtTail(3);*/
		MyLinkedList head1 = l1.addAtHead(2);
		l1.addAtTail(9);
		

		MyLinkedList l2 = new MyLinkedList();
		/*MyLinkedList head2 = l2.addAtHead(7);
		l2.addAtTail(2);
		l2.addAtTail(1);*/
		MyLinkedList head2 = l2.addAtHead(7);
		l2.addAtTail(5);
		

		MyLinkedList node = addTwoNumbers(head1,head2);
		System.out.println(" after addition");
		while(node != null) {
			System.out.print(node.value+" ----> ");
			node = node.next;
		}

	}

}
