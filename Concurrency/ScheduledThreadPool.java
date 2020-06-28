package Concurrency;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

class Task implements Runnable{
	int i ;
	Task(int i){
		this.i = i;
		System.out.println("i "+i);
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(" I am Task " +i +" run by "+ Thread.currentThread().getName());
		
	}
	
}

public class ScheduledThreadPool {

	
	//uses Delay Queue - places elements based on when they should be executed -
	//tasks that have to be executed at a later time are moved to the last
		public static void main(String[] args) {
			int corePoolSize = Runtime.getRuntime().availableProcessors();
			System.out.println(corePoolSize);
			ScheduledExecutorService  es = Executors.newScheduledThreadPool(corePoolSize);
			es.schedule(new Task(1), 5, TimeUnit.SECONDS); //delay after 5 seconds
			es.scheduleAtFixedRate(new Task(2), 10, 10, TimeUnit.SECONDS); //??
			
			

			es.shutdown();
		}
}
