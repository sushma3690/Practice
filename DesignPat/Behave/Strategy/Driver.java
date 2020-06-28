package DesignPat.Behave.Strategy;

public class Driver {
	
	public static void main(String[] args) {
		Strategy m = new Mall();
		Context ctx = new Context(m);
		System.out.println(ctx.executeStrategy("Hometown"));
		
		Strategy s = new School();
		Context ctx1 = new Context(s);
		System.out.println(ctx1.executeStrategy("Hometown"));
		
		Strategy t = new SkyScraper();
		Context ctx2 = new Context(t);
		System.out.println(ctx2.executeStrategy("Hometown"));
		
	}

}
