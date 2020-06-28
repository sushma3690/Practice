package Concurrency;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

class TaskCallable implements Callable{
    private int i;
    TaskCallable(int i){
    	this.i = i;
    }
	@Override
	public Object call() throws Exception {
		// TODO Auto-generated method stub
		Thread.sleep(10000);// - when this is present future will be populated after 5000 ms
		return this.i;
	}
	
}

public class FutureImpl {
	
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		Thread t = new Thread(this);
		
		ExecutorService es = Executors.newSingleThreadExecutor();
		List<Future<Integer>> futureList = new ArrayList<Future<Integer>>();
		for(int i = 0; i < 10; i++) {
			Future f = es.submit(new TaskCallable(i));
			
			//Integer res =  (Integer) f.get(); // will not go to next iteration until res is populated
			// so better to put all futures in a list, submit the taskk, do all other ops and 
			//get back to using the futures in a list so that even if its blocking your other jobs r done
			//System.out.println(" result at i is "+ res);
			futureList.add(f);
		}
		
		es.shutdown();
		
		
		if(!es.awaitTermination(1, TimeUnit.MICROSECONDS)) {
			List<Runnable> list = es.shutdownNow(); // if timeout happeed before exec coulf inish all tasks, do a shutDownNow
			// for current example this should happen, and one of the sleeping threads should be interrupted
		    Iterator itr = list.iterator();
		    while(itr.hasNext()) {
		    	System.out.println(" list ele is "+ itr.next());
		    }
			
		}
		
		for(int i = 0; i < futureList.size(); i++) {
			Future<Integer> f = futureList.get(i);
			System.out.println(" i " + f.get());
		}
		
	}

}
