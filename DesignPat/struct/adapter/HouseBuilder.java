package DesignPat.struct.adapter;

public class HouseBuilder implements  AdvancedBuilder  {

	@Override
	public void buildHouse(String location) {
		// TODO Auto-generated method stub
		System.out.println(" Building  house in location "+location);
		
	}

	@Override
	public void buildSkyScraper(String location) {
		// TODO Auto-generated method stub
		
	}

}
