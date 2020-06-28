package t2;

public class BClass implements B {
	
	public void random(){
		System.out.println(" b ran");
	}
	
	
	
	public static void main(String[] args) {
		BClass b = new BClass();
		
		B.random1();
		
	}

}
