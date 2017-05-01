package seminar.quadrilateral;

import java.util.ArrayList;

import edu.princeton.cs.algs4.GrahamScan;
import edu.princeton.cs.algs4.Point2D;

public class QuadrilateralChecker {

	public final float EPS = 0.0001f;

	public String getType(Point2D[] points) {
		String type = "NOT_A_QUADRILATERAL";
		if (points.length == 4) {
			Point2D[] hull = getConvexHull(points);
			if (hull.length < 4) {
				type = "CONCAVE";
			} else {
				type = "CONVEX";

				Line[] lines = new Line[4];
				lines[0] = new Line(points[0], points[1]);
				lines[1] = new Line(points[1], points[2]);
				lines[2] = new Line(points[2], points[3]);
				lines[3] = new Line(points[3], points[0]);

				if (areParalell(lines[0], lines[2]) ^ areParalell(lines[1], lines[3])) {
					type = "TRAPEZOID";
				} else if (areParalell(lines[0], lines[2]) & areParalell(lines[1], lines[3])) {
					type = "PARALELLOGRAM";
					if (formRightAngle(lines[0], lines[3]) & formRightAngle(lines[1], lines[2])) {
						type = "RECTANGLE";
						if (compareFloatingPoint(lines[0].getLength(), lines[3].getLength())) {
							type = "SQUARE";
						}
					}
				}
			}
		}
		return type;
	}

	private boolean formRightAngle(Line line, Line line2) {
		return compareFloatingPoint(-1.0 / line.getSlope(), line2.getSlope());
	}

	private boolean areParalell(Line line, Line line2) {
		return compareFloatingPoint(line.getSlope(), line2.getSlope());
	}

	private boolean compareFloatingPoint(double d, double d2) {
		return Math.abs(d - d2) <= EPS;
	}

	private Point2D[] getConvexHull(Point2D[] points) {
		GrahamScan grahamScan = new GrahamScan(points);
		Iterable<Point2D> hull = grahamScan.hull();
		ArrayList<Point2D> lst = new ArrayList<>();
		hull.forEach(p -> lst.add(p));
		return (Point2D[]) lst.toArray();
	}
}
