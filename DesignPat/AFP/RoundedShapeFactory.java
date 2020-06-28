package DesignPat.AFP;

public class RoundedShapeFactory extends AbstractShapeFactory {

	@Override
	AbstractFactoryShapeInterface getShape(String shapeType) {
		// TODO Auto-generated method stub
	if(shapeType.equals("R")) {
		return new RoundedRectangle();
	}
	return new RoundedSquare();
	}

}
