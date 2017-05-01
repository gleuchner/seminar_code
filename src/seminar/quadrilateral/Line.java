package seminar.quadrilateral;

import java.util.Arrays;

import edu.princeton.cs.algs4.Point2D;

public class Line {

	@Override
	public String toString() {
		return "Line [points=" + Arrays.toString(points) + "]";
	}

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

	public boolean isVertical() {
		return FloatingPointUtil.compareFloatingPoint(points[1].x(), points[0].x());
	}

	public boolean isParalellTo(Line line2) {
		if (this.isVertical() && line2.isVertical()) {
			return true;
		}
		return FloatingPointUtil.compareFloatingPoint(this.getSlope(), line2.getSlope());
	}

	public boolean formsRightAngleWith(Line line2) {
		if (this.isVertical()) {
			return FloatingPointUtil.compareFloatingPoint(line2.getSlope(), 0.0);
		} else if (line2.isVertical()) {
			return FloatingPointUtil.compareFloatingPoint(this.getSlope(), 0.0);
		} else {
			return FloatingPointUtil.compareFloatingPoint(-1.0 / this.getSlope(), line2.getSlope());
		}
	}
}
