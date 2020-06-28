package LeetCode_LL_DLL;


public class RotateRight {

	public static MyLinkedList rotateRight(MyLinkedList head, int k) {
		MyLinkedList temp1=head;
		int len = 0;
		 if(head == null || k == 0 || head.next == null){
	            return head;
	        }
		while(temp1 != null) {
			len++;
			temp1=temp1.next;
		}

		System.out.println(" length "+len);
		System.out.println(" length "+len);
		if(len < k){
			k = k%len;
		}
		if(k==0) {
			return head;
		}
		MyLinkedList temp = head;
		MyLinkedList prev = null;
		int count =0;
		while(count != (len-k)) {
			prev = temp;
			temp = temp.next;
			System.out.println(count);
			System.out.println(prev.value);
			System.out.println(temp.value);
			count++;
		}
		System.out.println(" prev val");
		//System.out.println(prev.value);
		if(prev != null) {
			prev.next= null;
		}

		MyLinkedList newHead = temp;
		MyLinkedList temp2 = temp;
		MyLinkedList prev1 = null;
		while(temp2 != null) {
			prev1=temp2;
			temp2 = temp2.next;
		}
		System.out.println(" prev1 val");
		System.out.println(prev1.value);
		if(prev1 != null) {
			prev1.next=head;
		}
		//4->5->null

		return newHead;

	}

	public static void main(String[] args) {
		MyLinkedList l1 = new MyLinkedList();
		MyLinkedList head = l1.addAtHead(1);
		l1.addAtTail(2);
		l1.addAtTail(3);
		l1.addAtTail(4);
		l1.addAtTail(5);
		/*
		 * l1.addAtTail(2); l1.addAtTail(3); l1.addAtTail(4); l1.addAtTail(5);
		 */
		MyLinkedList node = rotateRight(head,10);
		System.out.print(node.value+" ---->");
		MyLinkedList temp = node;
		
		  while(temp.next != null) { System.out.print(temp.next.value+" ---->"); temp =
		  temp.next; }
		 

	}

}
