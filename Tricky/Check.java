package Tricky;

public class Check {

	public void m1() throws InterruptedException {
		System.out.println(" m1 ");
		Thread.sleep(10000);
		System.out.println(System.currentTimeMillis() + Thread.currentThread().getName());
	}
	
	public static synchronized void mStat() throws InterruptedException {
		System.out.println(" mStat ");
		Thread.sleep(10000);
		System.out.println(System.currentTimeMillis() + Thread.currentThread().getName());
	}
	
	public synchronized void m2() throws InterruptedException {
		System.out.println(" m2 ");
		Thread.sleep(10000);
		System.out.println(System.currentTimeMillis() + Thread.currentThread().getName());

	}
	
	public static void main(String[] args) {
		Check c = new Check();
		Check c1 = new Check();

		Thread t1 = new Thread(()-> {
			try {
				c.m1();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});
		Thread t2 = new Thread(()-> {
			try {
				c.m2();
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		});
		Thread t3 = new Thread(()-> {
			try {
				c.m1();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});
		Thread t21 = new Thread(()-> {
			try {
				c.m2();
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		});
		/*
		 * Thread t22 = new Thread(()-> { try { c1.m2(); } catch (InterruptedException
		 * e1) { // TODO Auto-generated catch block e1.printStackTrace(); } });
		 */
		t1.start();
		t2.start();
		t21.start();
		t3.start();
		//t22.start();


	}
}
