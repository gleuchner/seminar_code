package seminar.quadrilateral;

import edu.princeton.cs.algs4.Point2D;

public class Line {

	public Point2D[] points;

	public Line(Point2D a, Point2D b) {
		points = new Point2D[2];
		if (a.x() < b.x()) {
			points[0] = a;
			points[1] = b;
		} else {
			points[0] = b;
			points[1] = a;
		}
	}

	public double getSlope() {
		return (points[1].y() - points[0].y()) / (points[1].x() - points[0].x());
	}

	public double getLength() {
		return Math.sqrt(Math.pow(points[1].x() - points[0].x(), 2) + Math.pow(points[1].y() - points[0].y(), 2));
	}
}
