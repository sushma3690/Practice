package DesignPat.Behave.Observer;

public class Manager extends Observer{
	Programmer programmer;

	Manager(Programmer programmer){
		this.programmer = programmer;
		this.programmer.attach(this);
	}
	@Override
	void update() {
		if(this.programmer.getState().equals("S")) {
			System.out.println(" Happy wit L");
		}else {
			System.out.println(" Unhppy with L");

		}
	}

}
