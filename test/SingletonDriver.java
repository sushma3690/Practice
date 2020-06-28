
class Singleton implements Cloneable  {
	private static Singleton instance;
	static int count=0;
	private Singleton() {
		count++;
		System.out.println("Initiated "+count+" times");
	}

	public static Singleton getInstance() {
		if(instance == null) {
			synchronized(Singleton.class) {
				if (instance == null) { //to check if another thread aready entered meantime
					instance = new Singleton();
				}
			}
		}
		return instance;
	}
	
	

}

public class SingletonDriver{
	static Singleton s1;
	static Singleton s2;
	public static void main(String[] args) throws InterruptedException {
		Thread t1 = new Thread(new Runnable(){

			@Override
			public void run() {
				// TODO Auto-generated method stub
				s1 = Singleton.getInstance();
			}

		});

		Thread t2 = new Thread(new Runnable(){

			@Override
			public void run() {
				// TODO Auto-generated method stub
				s2 = Singleton.getInstance();
			}

		});

		t1.start();
		t2.start();
		t1.join();
		t2.join();
		System.out.println(s1.equals(s2));
	}
	
	

}
