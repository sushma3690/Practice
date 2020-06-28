package DesignPat.Proto;

/****
 * Gives cached instance of an objct. useful for objcts that have to be cerated baded on
 * complex operstaions. can cache them and give back the clone
 * @author karsushm
 *
 */
public class Driver {

	
	public static void main(String[] args) {
		ShapeCache.loadCache();
		Shape s= ShapeCache.getShape("Square");
		s.draw();
	}
}
