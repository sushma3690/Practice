package DesignPat.AFP;

import javax.xml.parsers.DocumentBuilderFactory;

public class AbstractFactoryPatternDemo {

	public static void main(String[] args) {
		FactoryProducer fp = new FactoryProducer();
		
		AbstractShapeFactory sfp = fp.getFactory(true);
		sfp.getShape("R").getShape(); // rounded
		sfp.getShape("S").getShape();
		
		AbstractShapeFactory sfp1 = fp.getFactory(false);
		sfp1.getShape("R").getShape(); //normal
		sfp1.getShape("S").getShape();
		
		 DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		 //factory.getAttribute("abc");
	}
}
