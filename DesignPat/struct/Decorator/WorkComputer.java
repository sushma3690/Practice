package DesignPat.struct.Decorator;

public class WorkComputer extends ComputerDecorator {

	public WorkComputer(Computer computer) {
		super(computer);
		// TODO Auto-generated constructor stub
	}
	
	@Override
    public void assemble() {
        this.computer.assemble();
        System.out.println(" Adding Work compatibilities ");
    }

}
