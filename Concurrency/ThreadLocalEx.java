package Concurrency;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

public class ThreadLocalEx {

	static ThreadLocal<SimpleDateFormat> sf = ThreadLocal.withInitial(() -> new  SimpleDateFormat("yyyy-MM-dd"));


	public static void getUserCodeAndFormat(int id){
		Random r = new Random();
		DummyUser user = new DummyUser(r.nextInt());
		//SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		SimpleDateFormat sdf = sf.get(); //use this instead of above line, so that each thread gets
		//its own sdf instead of creating a sdf everytime this method is called.
		System.out.println(" and its your day  on "+ sdf.format(user.getCode()));
	}

	static AtomicInteger  count= new AtomicInteger(0);
	public static void main(String[] args) {
		ExecutorService es = Executors.newFixedThreadPool(10);

		for(int i = 0; i < 100; i ++) {
			es.submit(new Runnable() {

				@Override
				public void run() {
					getUserCodeAndFormat(1); //if sdf is inside getUserCodeAndFormat(), 100 sfds created - not useful.
					count.getAndIncrement();
					if(count.get() == 99) {
						sf.set(null); 
						System.out.println(" set sf null ");
						System.out.println(sf.get()); // should return null
						System.out.println(" sf is null ");
						sf.set(new  SimpleDateFormat("yyyy-MM-dd")); // set  value
						System.out.println(" set sf value ");
						System.out.println(sf.get().format(new Date()));
						System.out.println(" sf value set ");
						System.out.println(" remove sf value ");
						sf.set(null);
						sf.remove();
						System.out.println(sf.get().format(new Date()));
						System.out.println(" removed sf value ");
					}
					
						
				}
				
			});
		}
		
		
		es.shutdown();
	}
}
