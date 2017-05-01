package seminar.quadrilateral;

import edu.princeton.cs.algs4.Point2D;

public class QuadrilateralChecker {

	public final float EPS = 0.000001f;

	public String getType(Point2D[] points) {
		String type = "NOT_A_QUADRILATERAL";
		if (points.length == 4) {
			Point2D[] hull = getConvexHull();
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
				} else if (areParalell(lines[0], lines[2]) ^ areParalell(lines[1], lines[3])) {
					type = "PARALELLOGRAM";
					if (formRightAngle(lines[0], lines[3]) && formRightAngle(lines[1], lines[2])) {
						type = "RECTANGLE";
					}
				}
			}
		}
		return type;
	}

	private boolean formRightAngle(Line line, Line line2) {
		return false;
	}

	private boolean areParalell(Line line, Line line2) {
		return false;
	}

	private Point2D[] getConvexHull() {
		return null;
	}
}
