package DesignPat.Behave.Observer.Real;

public class ObserverDemo {
	
	/***
	 * java.util.Observer/java.util.Observable (rarely used in real world though)
All implementations of java.util.EventListener (practically all over Swing thus)
javax.servlet.http.HttpSessionBindingListener
javax.servlet.http.HttpSessionAttributeListener
javax.faces.event.PhaseListener
	 * @param args
	 */
	 public static void main(String args[])  
	    { 
	        B beingObserved = new B(); 
	        A observer1 = new A(); 
	        beingObserved.addObserver(observer1); 
	        beingObserved.incre(); 
	    } 

}
