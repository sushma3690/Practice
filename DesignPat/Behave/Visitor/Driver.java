package DesignPat.Behave.Visitor;

/*****
 * Visitor (recognizeable by two different abstract/interface(Item) types which has methods defined which takes each the other abstract/interface type(Visitor); the one actually calls the method of the other and the other executes the desired strategy on it)
javax.lang.model.element.AnnotationValue and AnnotationValueVisitor
javax.lang.model.element.Element and ElementVisitor
javax.lang.model.type.TypeMirror and TypeVisitor
java.nio.file.FileVisitor and SimpleFileVisitor
javax.faces.component.visit.VisitContext and VisitCallback

Visitor pattern is used when we have to perform an operation on a group of similar kind of Objects. 
With the help of visitor pattern, we can move the operational logic from the objects to another class. 
For example, think of a Shopping cart where we can add different type of items (Elements).

The purpose of a Visitor pattern is to define a new operation without introducing the modifications to an existing object structure.
 * @author karsushm
 *
 */
public class Driver {

	public static void main(String[] args) {
		Item[] items = new Item[]{new Pen(10, "Parker"), new Pen(5, "Pilot"), new NotePad(50, 150), new NotePad(75, 300)};
		int total = getTotalPrice(items);
		System.out.println("Total price of items: " + total);

	}

	private static int getTotalPrice(Item[] items) {
		Visitor visitor = new VisitorImpl();
		int result = 0;
		for(Item item : items) {
			result = result + item.accept(visitor);
		}
		return result;
	}

}
