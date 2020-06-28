package t2;

public interface B {

	default void random() {
		System.out.println("def");
	}
	static void random1() {
		System.out.println("stat");

	}
	
	public String geek();
}
