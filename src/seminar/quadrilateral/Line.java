package seminar.quadrilateral;

import edu.princeton.cs.algs4.Point2D;

public class Line {

	public Point2D[] points;

	public Line(Point2D a, Point2D b) {
		points = new Point2D[2];
		points[0] = a;
		points[1] = b;
	}
}
