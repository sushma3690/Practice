package LeetCode_LL_DLL;

public class Bla {

	public static MyLinkedList getIntersectionNode(MyLinkedList headA, MyLinkedList headB,
			int lengthA, int lengthB) {
		System.out.println(lengthA);
		System.out.println(lengthB);
		MyLinkedList res = null;


		System.out.println("headA "+headA);
		System.out.println("headB" +headB);

		if(lengthA>lengthB){
			System.out.println(" Here");
			int diff = lengthA-lengthB; //
			System.out.println("diff"+ diff);
			for(int i=0;i<diff;i++){ //<2>
				headA=headA.next;
				System.out.println(" hereeee "+headA.value);
			}
			System.out.println(" hereeee "+headA.value);
			while(headA!=null){
				headA=headA.next;
				headB=headB.next;
				if(headA==headB){
					res = headA ;
					break;
				}
			}
		}
		if(lengthA<lengthB){
			int diff = lengthB-lengthA;
			for(int i=0;i<diff;i++){
				headB=headB.next;
			}
			while(headB!=null){
				headA=headA.next;
				headB=headB.next;
				if(headA==headB){
					res = headB ;
					break;
				}
			}
		}




		if(lengthA==lengthB){
			while(headA.next!=null){
				headA=headA.next;
				headB=headB.next;
				if(headA==headB){
					res = headA ;
					break;
				}
			}
		}
		return  res;
	}

	public static void main(String[] args) {
		MyLinkedList l1 = new MyLinkedList();
		MyLinkedList head=	l1.addAtHead(4);
		l1.addAtTail(1);
		MyLinkedList tail = l1.addAtTail(8);
		l1.addAtTail(4);
		l1.addAtTail(5);
		l1.printLinkedList();

		MyLinkedList l2 = new MyLinkedList();
		MyLinkedList head1=	l2.addAtHead(5);
		l2.addAtTail(0);
		MyLinkedList l = l2.addAtTail(1);
		l.next=tail;
		

		System.out.println();
		l2.printLinkedList();
		System.out.println();
		MyLinkedList n = getIntersectionNode(head,head1,l1.getLengthOfMyLinkedList(),l2.getLengthOfMyLinkedList());
		System.out.println(n.value);

	}

}
