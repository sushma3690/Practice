package Concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

public class CachedThreadPool {

	
	public static void main(String[] args) {
		
/*
 * Cached threadpool doesnt take any args because it creates thread for a task/reuses if none available. Kills
 * if a thread is idle for 60 sec(that is no task is present)
 */
		ExecutorService es = Executors.newCachedThreadPool(); 
		AtomicInteger am = new AtomicInteger(0);
		for(int i = 0; i < 100; i++) {
			es.submit(()->{try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(am.getAndIncrement()+" I am executed by "+ Thread.currentThread().getName());
			
			});
		}
		
		es.shutdown();
	}


}
