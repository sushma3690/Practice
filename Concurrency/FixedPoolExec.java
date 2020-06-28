package Concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

public class FixedPoolExec {
	
	public static void main(String[] args) {
		
		int coreCount = Runtime.getRuntime().availableProcessors();// give number of cores on your machine
		System.out.println(" Number of Cores is "+ coreCount);
	//	ExecutorService es = Executors.newFixedThreadPool(10);
		ExecutorService es = Executors.newFixedThreadPool(coreCount); // instead of 10, keep 8
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
