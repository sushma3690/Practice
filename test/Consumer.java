package test;

import java.util.Queue;

public class Consumer {

	Queue q;
	Consumer(Queue q){
		this.q = q;

	}
	

	void consume() throws InterruptedException {
		while(true) {
			synchronized(q) {
				int count=0;
				while(q.size() == 0) {
					q.wait();
				}
				
					Integer o = (Integer) q.poll();
					System.out.println("consumed from Q "+ o);
				
				q.notify();
				//Thread.sleep(10000);
			}
		}
	}

}
