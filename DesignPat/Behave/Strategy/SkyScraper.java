package DesignPat.Behave.Strategy;

public class SkyScraper implements Strategy{

	@Override
	public String build(String location) {
		// TODO Auto-generated method stub
		return "Building SkyScraper in "+location +" area";
	}

}
