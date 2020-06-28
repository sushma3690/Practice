package LeetCode_LL_DLL;

public class MyLinkedList {
	int value;
	MyLinkedList next;
	MyLinkedList head;

	/** Initialize your data structure here. */
	public MyLinkedList() {
		head = null;
	}
	

	/**
	 * Get the value of the index-th node in the linked list. If the index is
	 * invalid, return -1.
	 */
	public int get(int index) {
		int length = getLengthOfMyLinkedList();
		if (index  < 0 || index >= length) {
			return -1;
		}
		/*
		 * MyLinkedList eleBefore = head; for(int i =1 ; i < length-1; i++) { eleBefore
		 * = eleBefore.next; } return eleBefore.value;
		 */

		MyLinkedList eleBefore = head;
		for (int i = 0; i < index; i++) {
			eleBefore = eleBefore.next;
		}
		return eleBefore.value;

	}

	/**
	 * Add a node of value val before the firsSt element of the linked list. After
	 * the insertion, the new node will be the first node of the linked list.
	 */
	public MyLinkedList addAtHead(int val) {
		if (head == null) {
			head = new MyLinkedList();
			head.value = val;
			head.next = null;
			return head;
		} else {
			MyLinkedList temp = head;
			MyLinkedList newHead = new MyLinkedList();
			newHead.value = val;
			newHead.next = temp;
			head = newHead;
			return temp;
		}
	}

	/** Append a node of value val to the last element of the linked list. */
	public MyLinkedList addAtTail(int val) {

		int length = getLengthOfMyLinkedList();
		MyLinkedList tail = new MyLinkedList();
		tail.value = val;
		tail.next = null;
		if (length == 0) {
			head = new MyLinkedList();
			head = tail;
		} else {
			MyLinkedList lastNode = head;
			for (int i = 0; i < length - 1; i++) {
				lastNode = lastNode.next;
			}
			lastNode.next = tail;

		}
		return tail;
		//int length1 = getLengthOfMyLinkedList();

	}

	/**
	 * Add a node of value val before the index-th node in the linked list. If index
	 * equals to the length of linked list, the node will be appended to the end of
	 * linked list. If index is greater than the length, the node will not be
	 * inserted.
	 */
	public void addAtIndex(int index, int val) {

		int length = getLengthOfMyLinkedList();
		if (index < 0 || index > length) {
			return;
		}
		if (index == 0) {
			addAtHead(val);
		} else {
			MyLinkedList eleBefore = head;
			for (int i = 0; i < index - 1; i++) {
				eleBefore = eleBefore.next;
			}
			MyLinkedList newNodeNext = eleBefore.next;
			MyLinkedList newNode = new MyLinkedList();
			newNode.value = val;
			newNode.next = newNodeNext;
			eleBefore.next = newNode;
			// getLengthOfMyLinkedList();
		}

	}

	/** Delete the index-th node in the linked list, if the index is valid. */
	public void deleteAtIndex(int index) {

		int length = getLengthOfMyLinkedList();
		System.out.println(length +"  "+index);
		if (index < 0 || index >= length) {
			return;
		}
		MyLinkedList eleBefore = head;
		for (int i = 0; i < index - 1; i++) {
			eleBefore = eleBefore.next;
		}
		if (index == 0) {
			head = eleBefore.next;
		} else {
			eleBefore.next = eleBefore.next.next;
		}
	}

	int getLengthOfMyLinkedList() {

		int length = 1;
		if (head == null) {
			return 0;
		} else {
			MyLinkedList temp = head;
			while (temp.next != null) {
				temp = temp.next;
				length++;
			}
		}
		// System.out.println("length of my linkedlist is "+length);
		return length;
	}

	public void printLinkedList() {
		MyLinkedList temp = head;
		System.out.print(temp.value + " --> ");
		while (temp.next != null) {
			temp = temp.next;
			System.out.print(temp.value + " --> ");

		}
	}

	
	  public static void main(String[] args) { 
		 MyLinkedList obj = new
	  MyLinkedList();
	  
	  
	  
			/*
			 * obj.addAtHead(7); obj.printLinkedList(); System.out.println();
			 * 
			 * obj.addAtHead(2); obj.printLinkedList(); System.out.println();
			 * 
			 * obj.addAtHead(1); obj.printLinkedList(); System.out.println();
			 * 
			 * obj.addAtIndex(3, 0); obj.printLinkedList(); System.out.println();
			 * 
			 * obj.deleteAtIndex(2); obj.printLinkedList(); System.out.println();
			 * 
			 * obj.addAtHead(6); obj.printLinkedList(); System.out.println();
			 * 
			 * obj.addAtTail(4); obj.printLinkedList(); System.out.println();
			 * 
			 * obj.get(4); System.out.println("obj.get(4 )"+ obj.get(4));
			 * 
			 * obj.addAtHead(4); obj.printLinkedList(); System.out.println();
			 * 
			 * obj.addAtIndex(5, 0); obj.printLinkedList(); System.out.println();
			 * 
			 * obj.addAtHead(6); obj.printLinkedList(); System.out.println();
			 */
	  
	  
		
			/*
			 * obj.addAtHead(1); obj.printLinkedList(); System.out.println();
			 * 
			 * obj.addAtTail(3); obj.printLinkedList(); System.out.println();
			 * 
			 * obj.addAtIndex(1, 2); obj.printLinkedList(); System.out.println();
			 * 
			 * System.out.println(obj.get(1));
			 * 
			 * obj.deleteAtIndex(0); obj.printLinkedList(); System.out.println();
			 * 
			 * System.out.println(obj.get(0));
			 */
		 
		 obj.addAtHead(2);
		 obj.printLinkedList(); System.out.println();
		 obj.deleteAtIndex(1);
		 obj.printLinkedList(); System.out.println();
		 obj.addAtHead(2);
		 obj.printLinkedList(); System.out.println();
		 obj.addAtHead(7);
		 obj.printLinkedList(); System.out.println();
		 obj.addAtHead(3);
		 obj.printLinkedList(); System.out.println();
		 obj.addAtHead(2);
		 obj.printLinkedList(); System.out.println();
		 obj.addAtHead(5);
		 obj.printLinkedList(); System.out.println();
		 obj.addAtTail(5);
		 obj.printLinkedList(); System.out.println();
		 obj.get(5);
		 System.out.println(" get "+ obj.get(5));
		 obj.deleteAtIndex(6);
		 obj.printLinkedList(); System.out.println();
		 obj.deleteAtIndex(4);
		 obj.printLinkedList(); System.out.println();
		 
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  }
	 
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList(); int param_1 = obj.get(index);
 * obj.addAtHead(val); obj.addAtTail(val); obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */
