package test;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;

/***
 * capacity=3
 * 2,3,4 -> remove 1 // simple add, where we need to check for cap and delete the firdt and add
 * else add
 * 
 * 3,1,4 -> accessed 1 and added 4, so 2 goes
 * @author karsushm
 *
 */
class Node{
	int data;
	Node next;
	Node prev;
}
public class LRU {
	private final int capacity;
	Node head; //-> //useful fr removing oldies
	Node tail;
	//1,2,3
	//1 -> node1->head 
	// 2->node -2
	 //new node, key -> old node..//
	//getKey() -> old ->Node;;;; OldNode.prev.next=NewNode; NewNode.next=oldNode.Next
	HashMap<Integer,Node> mp;
	/**
	 * 1, Node1
	 * 2, Node2
	 * 
	 * 
	 * 
	 * 
	 * @param cap
	 */
	//1<--2-->3
	 //--->1<--
	LRU(int cap){
		this.capacity = cap;
		mp = new HashMap<>();
	}
	
	
	public void add(int i) {
		
		// if map contains key, do the node thingy
		// if map doesnt contain key -> 

	}
	
	public void get(int i) {
		
	}
	

}
