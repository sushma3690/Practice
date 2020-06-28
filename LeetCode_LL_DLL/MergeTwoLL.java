package LeetCode_LL_DLL;


public class MergeTwoLL {

	 public static MyLinkedList mergeTwoLists(MyLinkedList l1, MyLinkedList l2) {
		
		 MyLinkedList prev = null;
		 MyLinkedList start = null;
		 MyLinkedList currA = l1;
		 MyLinkedList  currB = l2;
		 while(currA != null && currB != null) {
			 MyLinkedList nextA = currA.next;
			 MyLinkedList nextB = currB.next;
             System.out.println(" curra value "+ currA.value);
             System.out.println(" currb value "+ currB.value);

			 if(currA.value == currB.value ) {
				 System.out.println(" here0 ");
				 if(prev == null) {
					 prev = currA;
					 start = prev;
					 prev.next = currB;
					 prev = prev.next;
				 }else {
					 prev.next = currA;
					 prev.next.next = currB;
					 prev = prev.next.next;
				 }
				 currA = nextA;
				 System.out.println(" euals next curr a"+ currA.value);
				 currB = nextB;
				 
				 
				 
			 }else if(currA.value < currB.value ) {
				 System.out.println(" here");
				 if(prev == null) {
					 prev = currA;
					 start = prev;
				 }else {
					 prev.next = currA;
					 prev = prev.next;
				 }
				 currA = nextA;
				 
			 }else {

				 if(prev == null) {
					 prev = currB;
					 start = prev;
				 }else {
					 prev.next = currB;
					 prev = prev.next;
				 }
				 currB = nextB;
				 
			  
			 }
			 
		 }
		 
		 while(currA != null) {
			 if(prev == null) {
				 prev = currA;
				 start = prev;
			 }else {
				 prev.next = currA;
				 prev = prev.next;
			 }
			 currA = currA.next;
		 }
		 
		 while(currB != null) {

			 if(prev == null) {
				 prev = currA;
				 start = prev;
			 }else {
				 prev.next = currB;
				 prev = prev.next;
			 }
			 currB = currB.next;
		 
		 }
		 
		 
		 return start;
	        
	    }
	 
	 public static void main(String[] args) {
		 MyLinkedList l1 = new MyLinkedList();
		 MyLinkedList first= l1.addAtHead(1);
		 l1.addAtTail(2);
		 l1.addAtTail(4);
		 
		 System.out.println(" first list");
		 MyLinkedList tempA = first;
		 while(tempA != null) {
			 System.out.print(tempA.value+" ----> ");
			 tempA = tempA.next;
		 }
		 
		 System.out.println();
		 MyLinkedList l2 = new MyLinkedList();
		 MyLinkedList second= l2.addAtHead(1);
		 l2.addAtTail(3);
		 l2.addAtTail(4);
		 
		 System.out.println(" second list");
		 MyLinkedList tempB = second;
		 while(tempB != null) {
			 System.out.print(tempB.value+" ----> ");
			 tempB = tempB.next;
		 }
		 System.out.println(" merged list");
		 MyLinkedList node = mergeTwoLists(first,second);
		 System.out.println(" starting node value ");
		 System.out.println(node.value);
		 while(node != null) {
			 System.out.print(node.value+" ----> ");
			 node = node.next;
		 }

	 }
	 
}
