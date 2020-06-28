package DesignPat.Behave.Observer.Real;

import java.util.Observable;

public class B extends Observable {

	void incre()  
	{ 
		setChanged(); 
		notifyObservers(); 
	} 
}
