package LeetCode_LL_DLL;

public class Rev {

	public MyLinkedList reverseList(MyLinkedList head) {
		MyLinkedList prev = null;
        while (head != null) {
        	MyLinkedList next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }
	/**************
	 * (null)1->2->3->4
	 * 
	 * 
	 * first iteration:
	 * #######prev = null;
	 * head = 1 // in the input ////1->2->3->4; 
	 * next = 2; 1->2 // you get the next; next = head.next;
	 * head.next=prev; 1-> null;
	 * prev = head/// prev =1;
	 * head = next; /// head -2
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * prev : 1; head 2;
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
}
