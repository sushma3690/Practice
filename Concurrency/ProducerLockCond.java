package Concurrency;

import java.util.Queue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

public class ProducerLockCond implements Runnable {

	private final int numberOfElementsToAdd;
	private final Queue q;
	private final Condition c;
	private final Lock l;
	private final Condition d;
	

	ProducerLockCond(int n, Queue q, Condition c, Lock l, Condition d){
		this.numberOfElementsToAdd = n;
		this.q=q;
		this.c=c;
		this.l=l;
		this.d=d;
	}

	@Override
	public void run() {
		
		while(q.size()<=30) {
			l.lock();
			while(q.size() >= numberOfElementsToAdd) {
				try {
					c.await();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block	
					e.printStackTrace();
				}
			}
			for(int i = 1; i < numberOfElementsToAdd+1; i++) {
				q.add(i);
				System.out.println("Added "+ i +" to the queue while q size is "+ q.size());
			}
			c.signal();
			l.unlock();

		}


	}

}
