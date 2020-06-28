package LeetCode_LL_DLL;


public class isPalindrome {

    MyLinkedList second_half;
    
    public void printLinkedList(MyLinkedList head) {
		/*MyLinkedList temp = head;
		System.out.print(temp.value + " --> ");
		while (temp.next != null) {
			temp = temp.next;
			System.out.print(temp.value + " --> ");

		}*/
	}
    public void reverse(){
        MyLinkedList prev = null;
        while(second_half != null){
            MyLinkedList next = second_half.next;
            second_half.next = prev;
            prev = second_half;
            second_half = next;
            
            
        }
         second_half = prev; 
         printLinkedList(second_half);
        System.out.println();
    }
    
     boolean compareLists(MyLinkedList head1, MyLinkedList head2) 
     {
        MyLinkedList temp1 = head1;
        MyLinkedList temp2 = head2;
        
         while(temp1 != null && temp2 != null){
             System.out.println(" temp1 data "+ temp1.value);
             System.out.println(" temp2 data "+ temp2.value);

             if(temp1.value == temp2.value){
                 temp1=temp1.next;
                 temp2=temp2.next;
             }else{
                 return false;
             }
         }
         
         if(temp1 == null && temp2 == null){
             return true;
         }
         
         return false;
         
     }
    public boolean isPalindrome(MyLinkedList head) {
        
        if(head == null || head.next == null){
            return true;
        }
        //find middle node
        // keep track of previous node if odd number of elements
        // set previous of middle node to null if odd
        // set  middle node to null if even
        //reverse the second half of linkedlist
        //compare both the linked lists from start to end excluding the middle node if odd
        MyLinkedList slow = head;
        MyLinkedList fast = head;
        MyLinkedList prevSlow = head;
        MyLinkedList newMidNode = null;
        
        //1,2,3,4,5 -> fs -> 5
        while(fast != null && fast.next != null ){
            fast = fast.next.next;
            //System.out.println(fast.value);
            prevSlow = slow;
            slow=slow.next;
            
            
        }
       System.out.println(slow.value);
       System.out.println(prevSlow.value);
        
        if(fast != null){ //odd case
            // newMidNode = new MyLinkedList(prevSlow);
            newMidNode = slow;
            System.out.println("mid node "+newMidNode.value);
            slow = slow.next;
        }
        
    second_half = slow;
        prevSlow.next = null;
  //  System.out.println(second_half.value);
    reverse();
        printLinkedList(head);
        System.out.println();
       boolean res = compareLists(head, second_half);
      
        
        return res;
        
        
    }
}
