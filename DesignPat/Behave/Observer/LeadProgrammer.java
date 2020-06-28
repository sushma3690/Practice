package DesignPat.Behave.Observer;

public class LeadProgrammer extends Observer{
	Programmer programmer;

	LeadProgrammer(Programmer programmer){
		this.programmer = programmer;
		this.programmer.attach(this);
	}
	@Override
	void update() {
		if(this.programmer.getState().equals("S")) {
			System.out.println(" Happy wit P");
		}else {
			System.out.println(" Unhppy with P");

		}
	}

}
