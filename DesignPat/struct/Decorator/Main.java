package DesignPat.struct.Decorator;

public class Main {
	
	public static void main(String[] args) {
		BasicComputer bc = new BasicComputer();
		bc.assemble();
		GameComputer gc = new GameComputer(bc);
		gc.assemble();
		WorkComputer wc = new WorkComputer(bc);
		wc.assemble();
	}

}
