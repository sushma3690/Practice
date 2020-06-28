package DesignPat.Behave.Observer;

public class Main {

	public static void main(String[] args) {
		
		Programmer p = new Programmer();
		CEO c = new CEO(p);
		p.setState("S");

	}
	
}
