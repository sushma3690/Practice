package DesignPat.AFP;

public class ShapeFactory extends AbstractShapeFactory{

	@Override
	AbstractFactoryShapeInterface getShape(String shapeType) {
		// TODO Auto-generated method stub
		if(shapeType.equals("R")) {
			return new Rectangle();
		}
		return new Square();
		}
	}


