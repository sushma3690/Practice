package DesignPat.Behave.Observer.Real;

import java.util.Observable;
import java.util.Observer;

public class A implements Observer{

	@Override
	public void update(Observable arg0, Object arg1) {
		 System.out.println("Observer A is added"); 		
	}

}
