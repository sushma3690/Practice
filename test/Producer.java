package test;

import java.util.Queue;

public class Producer implements Runnable {

	Queue q;
	int limit;
	
	volatile int i =0;
	Producer(Queue q, int limit){
		this.q = q;
		this.limit = limit;
		
	}

	void produce() throws InterruptedException {
		//sync

		while(true) {
			synchronized(q) {
				int count=0;
				while(q.size() == limit) {
					q.wait();
				}

				q.add(++i);
				System.out.println("Added to queue "+ i);
				if(q.size() == limit) {
					q.notify();
					//Thread.sleep(10000);
				}
				
			}
		}
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

}
