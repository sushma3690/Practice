package Concurrency;

import java.util.Queue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

public class ConsumerLockCond implements Runnable{



	private final Queue q;
	private final Condition c;
	private final Condition d;
	private final Lock l;

	ConsumerLockCond( Queue q, Condition c, Lock l, Condition d){
		this.q=q;
		this.c=c;
		this.l=l;
		this.d=d;
	}

	@Override
	public void run() {
		while(true) {
			l.lock();
			while(q.isEmpty()) {
				try {
					c.await();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			int number = (int) q.poll();
			System.out.println(" Removed number "+number+" from Queue ");
            
			c.signal();

			l.unlock();
		}


	}



}
