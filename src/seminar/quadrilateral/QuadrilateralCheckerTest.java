package seminar.quadrilateral;

import edu.princeton.cs.algs4.Point2D;
import junit.framework.TestCase;

public class QuadrilateralCheckerTest extends TestCase {

	public void testSquare() {
		QuadrilateralChecker quadrilateralChecker = new QuadrilateralChecker();

		Point2D[] points = new Point2D[4];

		points[0] = new Point2D(1.0, 1.0);
		points[1] = new Point2D(1.0, 2.0);
		points[2] = new Point2D(2.0, 2.0);
		points[3] = new Point2D(2.0, 1.0);

		String type = quadrilateralChecker.getType(points);
		assertEquals("SQUARE", type);

		points[0] = new Point2D(1.0, 2.0);
		points[1] = new Point2D(2.0, 3.0);
		points[2] = new Point2D(3.0, 2.0);
		points[3] = new Point2D(2.0, 1.0);

		type = quadrilateralChecker.getType(points);
		assertEquals("SQUARE", type);
	}

	public void testSquare2() {
		QuadrilateralChecker quadrilateralChecker = new QuadrilateralChecker();

		Point2D[] points = new Point2D[4];

		points[0] = new Point2D(1.0, 2.0);
		points[1] = new Point2D(2.0, 3.0);
		points[2] = new Point2D(3.0, 2.0);
		points[3] = new Point2D(2.0, 1.0);

		String type = quadrilateralChecker.getType(points);
		assertEquals("SQUARE", type);
	}

	public void testRectangle() {
		QuadrilateralChecker quadrilateralChecker = new QuadrilateralChecker();

		Point2D[] points = new Point2D[4];

		points[0] = new Point2D(1.0, 1.0);
		points[1] = new Point2D(1.0, 3.0);
		points[2] = new Point2D(2.0, 3.0);
		points[3] = new Point2D(2.0, 1.0);

		String type = quadrilateralChecker.getType(points);
		assertEquals("RECTANGLE", type);
	}

	public void testRectangle2() {
		QuadrilateralChecker quadrilateralChecker = new QuadrilateralChecker();

		Point2D[] points = new Point2D[4];

		points[0] = new Point2D(0.0, 3.0);
		points[1] = new Point2D(1.0, 4.0);
		points[2] = new Point2D(3.0, 2.0);
		points[3] = new Point2D(2.0, 1.0);

		String type = quadrilateralChecker.getType(points);
		assertEquals("RECTANGLE", type);
	}

	public void testParalellogram() {
		QuadrilateralChecker quadrilateralChecker = new QuadrilateralChecker();

		Point2D[] points = new Point2D[4];

		points[0] = new Point2D(1.0, 1.0);
		points[1] = new Point2D(2.0, 2.0);
		points[2] = new Point2D(4.0, 2.0);
		points[3] = new Point2D(3.0, 1.0);

		String type = quadrilateralChecker.getType(points);
		assertEquals("PARALELLOGRAM", type);
	}

	public void testTrapezoid() {
		QuadrilateralChecker quadrilateralChecker = new QuadrilateralChecker();

		Point2D[] points = new Point2D[4];

		points[0] = new Point2D(1.0, 1.0);
		points[1] = new Point2D(2.0, 2.0);
		points[2] = new Point2D(3.0, 2.0);
		points[3] = new Point2D(4.0, 1.0);

		String type = quadrilateralChecker.getType(points);
		assertEquals("TRAPEZOID", type);
	}

	public void testConvex() {
		QuadrilateralChecker quadrilateralChecker = new QuadrilateralChecker();

		Point2D[] points = new Point2D[4];

		points[0] = new Point2D(1.0, 1.0);
		points[1] = new Point2D(1.0, 6.0);
		points[2] = new Point2D(6.0, 6.0);
		points[3] = new Point2D(5.0, 3.0);

		String type = quadrilateralChecker.getType(points);
		assertEquals("CONVEX", type);
	}

	public void testConcave() {
		QuadrilateralChecker quadrilateralChecker = new QuadrilateralChecker();

		Point2D[] points = new Point2D[4];

		points[0] = new Point2D(1.0, 1.0);
		points[1] = new Point2D(2.0, 2.0);
		points[2] = new Point2D(3.0, 1.0);
		points[3] = new Point2D(2.0, 1.0);

		String type = quadrilateralChecker.getType(points);
		assertEquals("CONCAVE", type);
	}
}
