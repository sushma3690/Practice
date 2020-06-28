package t3;

public class A {
	
	static void print(Object a) {
		System.out.println("printing from object");
	}
	
	static void print(String a) {
		System.out.println("printing from String");
	}
	
	/*
	 * static void print(StringBuilder a) {
	 * System.out.println("printing from String Builder"); }
	 */
	
	static void print(String a,  String... b) {
		System.out.println(" printing from varargs");
	}
	


	
	
	public static void main(String[] args) {
		print("ABC");
		print(null, null,null,null,null,null); //ambiguity
	}

}
