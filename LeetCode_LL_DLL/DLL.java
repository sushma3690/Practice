package LeetCode_LL_DLL;

public class DLL {


	int value;
	DLL next;
	DLL prev;
	DLL head;

	/** Initialize your data structure here. */
	public DLL() {
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
		 * DLL eleBefore = head; for(int i =1 ; i < length-1; i++) { eleBefore
		 * = eleBefore.next; } return eleBefore.value;
		 */

		DLL eleBefore = head;
		for (int i = 0; i < index; i++) {
			eleBefore = eleBefore.next;
		}
		System.out.println(eleBefore.value);
		return eleBefore.value;

	}

	/**
	 * Add a node of value val before the firsSt element of the linked list. After
	 * the insertion, the new node will be the first node of the linked list.
	 */
	public void addAtHead(int val) {
		if (head == null) {
			head = new DLL();
			head.value = val;
			head.next = null;
			head.prev=null;
		} else {
			DLL temp = head;
			DLL newHead = new DLL();
			newHead.value = val;
			newHead.next = temp;
			newHead.prev = null;
			head = newHead;
			temp.prev=newHead;
		}
	}

	/** Append a node of value val to the last element of the linked list. */
	public void addAtTail(int val) {

		int length = getLengthOfMyLinkedList();
		DLL tail = new DLL();
		tail.value = val;
		tail.next = null;
		if (length == 0) {
			head = new DLL();
			head = tail;
			tail.prev=null;
		} else {
			DLL lastNode = head;
			for (int i = 0; i < length - 1; i++) {
				lastNode = lastNode.next;
			}
			lastNode.next = tail;
			tail.prev = lastNode;

		}
		int length1 = getLengthOfMyLinkedList();
		System.out.println(" length after adding to tail "+length1);

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
			DLL eleBefore = head;
			for (int i = 0; i < index - 1; i++) {
				eleBefore = eleBefore.next;
			}
			System.out.println("eleBefore value " + eleBefore.value);
			DLL newNodeNext = eleBefore.next;

			DLL newNode = new DLL();
			newNode.value = val;
			newNode.next = newNodeNext;
			if(newNodeNext != null) {
				newNodeNext.prev = newNode;
			}
			eleBefore.next = newNode;
			newNode.prev = eleBefore;

			// getLengthOfMyLinkedList();
		}

	}

	/** Delete the index-th node in the linked list, if the index is valid. */
	public void deleteAtIndex(int index) {
		System.out.println("delete at index start");
		int length = getLengthOfMyLinkedList();
		System.out.println("delete at index start "+length);
		if (index < 0 || index >= length) {
			return;
		}
		DLL eleBefore = head;
		for (int i = 0; i < index - 1; i++) {
			eleBefore = eleBefore.next;
		}
		System.out.println("delete at index eleBefore val "+eleBefore.value);
		if (index == 0) {
			head = eleBefore.next;
		} else {
			eleBefore.next.next.prev = eleBefore;
			eleBefore.next = eleBefore.next.next;
			System.out.println("delete at index eleBefore next val "+eleBefore.next.value);
			System.out.println("here");
			System.out.println("delete at index  eleBefore.next.next.prev val "+ eleBefore.next.prev.value);
		}
		System.out.println("delete at index end");
	}

	int getLengthOfMyLinkedList() {

		int length = 1;
		if (head == null) {
			return 0;
		} else {
			DLL temp = head;
			while (temp.next != null) {
				temp = temp.next;
				length++;
			}
		}
		// System.out.println("length of my linkedlist is "+length);
		return length;
	}

	public void printLinkedList() {
		DLL temp = head;
		System.out.print(temp.value + " --> ");
		while (temp.next != null) {
			temp = temp.next;
			System.out.print(temp.value + " --> ");

		}
	}

	public static void main(String[] args) {

		DLL obj = new
				DLL();
		obj.addAtHead(7);
		obj.addAtHead(2);
		obj.addAtHead(1);
		obj.addAtIndex(3, 0);
		obj.deleteAtIndex(2);
		obj.addAtHead(6);
		obj.addAtTail(4);
		obj.get(4);
		obj.addAtHead(4);
		obj.addAtIndex(5, 0);
		obj.addAtHead(6);


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



	}









}

/**
 * Your DLL object will be instantiated and called as such:
 * DLL obj = new DLL(); int param_1 = obj.get(index);
 * obj.addAtHead(val); obj.addAtTail(val); obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */
