package DesignPat.Behave.Strategy;

public class Mall implements Strategy{

	@Override
	public String build(String location) {
		// TODO Auto-generated method stub
		return "Building mall in "+location +" area";
	}

}
