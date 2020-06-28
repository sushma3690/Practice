package PECS;

import java.util.ArrayList;
import java.util.List;

public class Generics {
	
	public void addAll() {
		
	}
	
	public static void main(String[] args) {
		
		List<? extends Fruit> producer = new ArrayList();
		Apple a = new Apple();
		Fruit f = new Fruit();
		List<Apple> al = new ArrayList<Apple>();
		List<Fruit> fl = new ArrayList<Fruit>();
		List<FruitSuper> fls = new ArrayList<FruitSuper>();
		fl.addAll(al); // apple
		fl.addAll(fl); // fruit // addAll -> extends Fruit and Fruit// 
		//fl.addAll(fls); -- super so not add; addAll -> retrieval
		
		// ? super Fruit // Fruit and SuperFruit
		//fl.add(new FruitSuper()); cant happen 

		

		

		
	}

}
