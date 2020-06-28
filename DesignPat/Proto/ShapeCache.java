package DesignPat.Proto;

import java.util.HashMap;

public class ShapeCache {
	private static HashMap<String,Shape> ht = new HashMap<String,Shape>();
	
	public static Shape getShape(String shapeName) {
		return (Shape) ht.get(shapeName).clone(); //returns a cloned instance
	}
	public static void loadCache() {
		Square s = new Square();
		s.setId(1);
		s.setName("Square");
		ht.put("Square", s);
		
		Rectangle r = new Rectangle();
		r.setId(1);
		r.setName("Rectangle");
		ht.put("Rectangle", r);
	}

}
