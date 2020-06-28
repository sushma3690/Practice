package DesignPat.Behave.Observer;

import java.util.ArrayList;
import java.util.List;

public class Programmer {
List<Observer> observers = new ArrayList<Observer>();

private String state;

public String getState() {
	return state;
}

public void setState(String state) {
	this.state = state;
	notifyObservers();
}

public void attach(Observer obs){
	this.observers.add(obs);
}

public void notifyObservers() {
	for(Observer obs:observers) {
		obs.update();
	}
	
}


}
