package Tricky;

public class B extends C {
	/*
	 * public void print() { System.out.println(" B printed"); }
	 */
	/*
	 * public void printB(int a) { System.out.println("int"); }
	 */

	/*
	 * public void printB(float a) { System.out.println("float");
	 * 
	 * }
	 */

	public void printB(double a) {
		System.out.println("double");

	}

	/*
	 * public void printB(long a) { System.out.println("long");
	 * 
	 * }
	 */

	void print(String in) {
		System.out.println("String");
	}

	void print(Integer in) {
		System.out.println("Int");
	}

	/*
	 * void print(StringBuilder in){ System.out.println("String da"); }
	 */

	void print(Object in) {
		System.out.println("Object");
	}

	public static void main(String[] args) {
		A a = new B();
		a.print();
		/*
		 * B b = new B(); String a1 = new String("susu");
		 * 
		 * b.printB(1); b.printB(1.1); b.printB(1.11); b.printB(1.0); b.printB(1L);
		 * b.printB(1F);
		 * 
		 * b.print("abc"); b.print(new String(a1)); //b.print(null); //b.pr
		 * 
		 * 
		 * 
		 * a.print(); //int-> long->float->double
		 */ }
}
