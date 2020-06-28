package DesignPat.Singleton;

import java.io.Serializable;

public class Singleton implements Cloneable, Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static Singleton instance;
	private static int count =0;
	private Singleton() throws Exception {
		if(instance != null) {
			throw new Exception(" Rfelection not supprited");
		}
		++count;
		System.out.println(" Printed only once"+ ++count);

	}
	public static  Singleton getInstance() throws Exception {
		if(instance == null) {
			synchronized(Singleton.class){
				if(instance==null) {
					instance = new Singleton();
				}
			}
		}
		return instance;
	}

	@Override
	protected Singleton clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException();

	}
	
	public Object  readResolve()  {
		return instance;

	}
	
	public static void main(String[] args) throws Exception {

		Singleton s4 = Singleton.getInstance();
		System.out.println(s4.hashCode());
		Singleton s5 = Singleton.getInstance();
		System.out.println(s5.hashCode());
		System.out.println(s4==s5);
		Singleton s6 = null;
		try {
			s6 = Singleton.getInstance().clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			if(s6 == null) {
				System.out.println(" Clone not suppoted");
			}
			//e.printStackTrace();
		}
		/*
		 * Thread t1 = new Thread(new Runnable(){
		 * 
		 * @Override public void run() { // TODO Auto-generated method stub Singleton s3
		 * = Singleton.getInstance(); System.out.println(s3.hashCode()); }
		 * 
		 * });
		 * 
		 * Thread t2 = new Thread(new Runnable(){
		 * 
		 * @Override public void run() { // TODO Auto-generated method stub Singleton s4
		 * = Singleton.getInstance(); System.out.println(s4.hashCode());
		 * 
		 * }
		 * 
		 * });
		 * 
		 * t1.start(); t2.start(); t1.join(); t2.join();
		 */
		Runtime.getRuntime().availableProcessors();// RunTime,getRuntime // is singleotn



	}
}
