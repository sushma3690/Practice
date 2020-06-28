package test;

public class Threads {
	static  Object lock = new Object();
	volatile static int i = 1;



	private static void printSequence(int rem) throws InterruptedException {

		while(true) {
			synchronized(lock) {
				while(i%4 != rem) {
					lock.wait();
				}
				System.out.println(Thread.currentThread().getName() +' '+ i);
				i++;
				Thread.sleep(1000);
				lock.notifyAll();

			}
		}


	}

	public static void main(String[] args) {

		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				try {
					printSequence(1);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}});
		t1.setName("T1");
		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				try {
					printSequence(2);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}});
		t2.setName("T2");
		Thread t3 = new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				try {
					printSequence(3);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}});
		t3.setName("T3");

		Thread t4 = new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				try {
					printSequence(0);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}});
		t4.setName("T4");

		t1.start();
		t2.start();
		t3.start();
		t4.start();



	}


}
