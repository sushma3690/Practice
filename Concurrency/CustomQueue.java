package Concurrency;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

class Task1 implements Runnable{
	private int i;
	Task1(int i){
		this.i = i;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(" I am task "+ i);
		
	}
}
// coudlnt reproduce catch scenrio - try later
public class CustomQueue {
	
	public static void main(String[] args) {
		int corePoolSize = Runtime.getRuntime().availableProcessors();
		ExecutorService es = new ThreadPoolExecutor(corePoolSize,corePoolSize,60,TimeUnit.SECONDS,new ArrayBlockingQueue(10));
		for(int i = 0; i < 100; i++) {
			try {
			es.execute(new Task(i));
			//es.shutdown(); //throws rejected task
			}catch(RejectedExecutionException e ) {
				System.out.println(" Rejected task "+ i);
			}
		}
		
		/*
		 * ExecutorService es1 = new
		 * ThreadPoolExecutor(corePoolSize,corePoolSize,60,TimeUnit.SECONDS,new
		 * ArrayBlockingQueue(10), new RejectedExecutionHandler() {
		 * 
		 * @Override public void rejectedExecution(Runnable arg0, ThreadPoolExecutor
		 * arg1) { // TODO Auto-generated method stub
		 * System.out.println(" chumma trial code");
		 * 
		 * }});
		 */
		
		/*
		 * for(int i = 0; i < 100; i++) { try { es1.execute(new Task(i));
		 * }catch(RejectedExecutionException e ) { System.out.println(" Rejected task "+
		 * i); } }
		 */
		

	}

}
