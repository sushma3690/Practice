package Concurrency;
import java.util.concurrent.SynchronousQueue;

public class SequencePrint implements Runnable {

	volatile int i = 1;
	public static void main(String[] args) {
		SequencePrint sequencePrint = new SequencePrint();
		Thread t1 = new Thread(sequencePrint);
		Thread t2 = new Thread(sequencePrint);
		Thread t3 = new Thread(sequencePrint);
		t1.setName("1");
		t2.setName("2");
		t3.setName("3");
		t1.start();
		t2.start();
		t3.start();
	}

	@Override
	public synchronized void run() {

		while (i<100) {
		//	System.out.println(" i is "+ i);
		//	System.out.println(" Name "+Thread.currentThread().getName());
			if (i % 3 == 1  ) {
				if(Thread.currentThread().getName().equals("1")) {
					try {
						System.out.println(Thread.currentThread().getName() + "-" + i++);
						notifyAll();
						wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}else {
					//notifyAll();
					try {
						notifyAll();
						wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

				}
			}

			if (i % 3 == 2) {
				if(Thread.currentThread().getName().equals("2")) {
					try {
						System.out.println(Thread.currentThread().getName() + "-" + i++);
						notifyAll();
						wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				else {

					//notifyAll();
					try {
						notifyAll();
						wait();


					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

				
				}
			}

			if (i % 3 == 0) {
				if(Thread.currentThread().getName().equals("3")) {
					try {
						System.out.println(Thread.currentThread().getName() + "-" + i++);
						notifyAll();
						wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}else {

					//notifyAll();
					try {
						notifyAll();
						wait();


					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

				
				}
			}


		}
	}
}

