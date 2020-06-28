package PECS;

public class Apple extends Fruit {

	void print() {
		System.out.println("Apple");
	}
	
	public static void main(String[] args) {
		Fruit f = new Apple();
		f.print();
	}
}
