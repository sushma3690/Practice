package DesignPat.struct.Facade;

public class ZooKeeper {
	
	Lion lion;
	Dog dog;
	Rabbit rabbit;
	
	ZooKeeper(){
		lion = new Lion();
		dog = new Dog();
		rabbit = new Rabbit();
	}
	
	public void feedLion() {
		lion.feed();
	}
	
	public void feedDog() {
		dog.feed();
	}
	
	public void feedRabbit() {
		rabbit.feed();
	}
	

}
