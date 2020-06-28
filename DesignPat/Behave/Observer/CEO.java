package DesignPat.Behave.Observer;

public class CEO extends Observer{
	Programmer programmer;

	CEO(Programmer programmer){
		this.programmer = programmer;
		this.programmer.attach(this);
	}
	@Override
	void update() {
		if(this.programmer.getState().equals("S")) {
			System.out.println(" Hppy with M and L");
		}else {
			System.out.println(" Unhppy with M and L");

		}
	}

}
