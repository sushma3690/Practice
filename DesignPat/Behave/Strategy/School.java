package DesignPat.Behave.Strategy;

public class School implements Strategy{

	@Override
	public String build(String location) {
		// TODO Auto-generated method stub
		return "Building School in "+location +" area";
	}

}
