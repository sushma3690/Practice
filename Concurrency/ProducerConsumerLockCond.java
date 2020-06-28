package Concurrency;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ProducerConsumerLockCond {
	
	public static void main(String[] args) {
		
		Queue  q = new LinkedList();
		Lock l = new ReentrantLock();
		Condition c = l.newCondition();
		Condition d = l.newCondition();
		ProducerLockCond p = new ProducerLockCond(5,q,c,l,d);
		ConsumerLockCond cl = new ConsumerLockCond(q,c,l,d);
		
		Thread pt = new Thread(p);
		Thread ct = new Thread(cl);
		pt.start();
		ct.start();
		
	}

}
