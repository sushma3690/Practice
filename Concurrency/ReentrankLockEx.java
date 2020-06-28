package Concurrency;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/*******
 * Sychronized(this){// lock.lock()
 * 
 * 
 * }lock.unlock()
 * allows multiple times to get the lock hence the name reentrant lock
 * lock can be acquired in one scope and closed in another and locks acquired in 1 ordr neednt be closed
 * in the same order
 * getHoldCount -> gives lock count
 * by default reentrant lock is not fair - the moment u do unlock if any thread is trying
 * to acquire that lock, it gives the lock to it. so other threads waiting for lock much before dint get it
 * if you want fair lock - that is giving lck to thread wiaiting for a long time
 * then initialize reentrant lock with const booleab true
 * trylock - if lock gets acuired do something else dont get blocked do something else.
 * when trylock is used, fairness doesnt get follwoed, so put try lock with timeout in constructr , then fairness comes
 * into play
 * always put lock.unlock in catch or finally clause so that in case u get an exeption after u acquire lock 
 * u for sure release it and dont starve other threads
 * fairness : no thread starvation
 * non fair reentrant lock : high throughput
 * 
 * 
 * @author karsushm
 *
 */

public class ReentrankLockEx {

	public static void accessResource() {
		Lock lock = new ReentrantLock();
		try {
			System.out.println(" I am "+ Thread.currentThread().getName());
			/*
			 * if(Thread.currentThread().getName().contains("2")) { throw new
			 * Exception("this is why you should have unlock in catch or finally"); }
			 */
		}catch(Exception e){
			System.out.println(e.getMessage() + " by "+Thread.currentThread().getName());
			//lock.unlock();
		}finally {
			System.out.println(" unlocked start" + Thread.currentThread().getName() );
			lock.unlock();
			System.out.println(" unlocked end");
		}

	}
	public static void main(String[] args) {

		Thread t1 = new Thread(()->accessResource());
		Thread t2 = new Thread(()->accessResource());
		Thread t3 = new Thread(()->accessResource());
		t1.start();
		//t2.start();
		//t3.start();



	}

}
