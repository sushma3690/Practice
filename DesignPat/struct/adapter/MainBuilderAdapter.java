package DesignPat.struct.adapter;

public class MainBuilderAdapter implements Builder{
	AdvancedBuilder advancedBuilder;
	
	MainBuilderAdapter(String type){
		if(type.equals("House")) {
			advancedBuilder = new HouseBuilder();
		}else if(type.equals("SkyScareper")){
			advancedBuilder = new SkyScraperBuilder();
		}else {
			System.out.println("Invalid Building");
		}
	}
	
	@Override
	public void build(String type, String location) {
		if(type.equals("House")) {
			advancedBuilder.buildHouse(location);
		}else if(type.equals("SkyScareper")){
			advancedBuilder.buildSkyScraper(location);
		}else {
			System.out.println("Invalid type");
		}
	}

}
