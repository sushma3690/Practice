package Concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

public class SingleThreadedPool {

	//uses Synchronous queue - which has only 1 element
	//Uses LinkedBlockingQ - used by FixedThreadPool too
	// if a thread is killed as part of exeuting the task then
	public static void main(String[] args) {
		ExecutorService es = Executors.newSingleThreadExecutor(); 
		AtomicInteger am = new AtomicInteger(0);
		for(int i = 0; i < 100; i++) {
			es.submit(()->{try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(am.getAndIncrement()+" I am executed by "+ Thread.currentThread().getName());
			//Always prints Thread1

			});
		}

		es.shutdown();
	}

}
