package DesignPat.struct.adapter;

public class Implementation implements Builder{

	@Override
	public void build(String type, String location) {
	
		MainBuilderAdapter builderAdapt = new MainBuilderAdapter(type);
		builderAdapt.build(type, location);
		
	}
	
	public static void main(String[] args) {
		Implementation impl = new Implementation();
	    impl.build("invalid","Nowhere");
	    impl.build("House","Manali");
	    impl.build("SkyScareper","Nowhere");
	}

}
