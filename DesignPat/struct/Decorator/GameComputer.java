package DesignPat.struct.Decorator;

public class GameComputer extends ComputerDecorator {

	public GameComputer(Computer computer) {
		super(computer);
		// TODO Auto-generated constructor stub
	}
	
	@Override
    public void assemble() {
        this.computer.assemble();
        System.out.println(" Adding gaming compatibilities ");
    }

}
