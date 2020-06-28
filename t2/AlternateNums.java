package t2;

public class AlternateNums {

	private static int i=1;
	static Object lock = new Object();
	
	 static void  printN(int n) throws InterruptedException {
		System.out.println(Thread.currentThread().getName());

		while(i < 10) {
			
			synchronized(lock) {
				if(i%2 != n) {
					lock.wait();
				}
				System.out.println(" Printing "+ i + "from Tread" + Thread.currentThread().getName());
				lock.notifyAll();
			}
			i++;
		}
		
		
		
	}
	
	public static void main(String[] args) throws InterruptedException {
		
		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				try {
					printN(1);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
			}
			
		});
		t1.setName(" Odd Thread ");
		
		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				try {
					printN(0);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
			}
			
		});
		
		t2.setName(" Even Thread ");
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		
		

		
	}
}
