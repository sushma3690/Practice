package DesignPat.AFP;

public class FactoryProducer {

	 static AbstractShapeFactory getFactory(boolean shape) {
		 if(shape) {
			 return new RoundedShapeFactory();
		 }else {
		 return new ShapeFactory();
		 }
	 }
}
