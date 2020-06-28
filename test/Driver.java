package test;

import java.util.LinkedList;
import java.util.Queue;

public class Driver {

	public static void main(String[] args) throws InterruptedException {
		Queue q = new LinkedList();
		Producer p = new Producer(q,1);
		Consumer c = new Consumer(q);
		
		new Thread(new Runnable() {

			@Override
			public void run() {

				try {
					p.produce();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}


			}}).start();

		new Thread(new Runnable() {

			@Override
			public void run() {

				try {
					Thread.sleep(1000);
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				try {
					c.consume();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}}).start();
	}


}
